package org.web3.flota.persist;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.web3.flota.util.HibernateUtil;

public class UsuarioDAO extends GenericDAO implements IGenericDAO{
	private static UsuarioDAO instance;
	
	private UsuarioDAO(){
		super();
	};
	
	public static UsuarioDAO getInstance(){
		if(instance == null)
			instance = new UsuarioDAO();
		return instance;
	}
	
	public void create(Object usuarioDTO) {
        super.saveOrUpdate(usuarioDTO);
    }
	
	public void update(Object usuarioDTO) {
        super.saveOrUpdate(usuarioDTO);
    }
	
	public void delete(Object usuarioDTO) {
        super.delete(usuarioDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllUsuarios");
    }
	
	public Object getByLogin(String login){
		Object usuario = null;
		
		try {
            startOperation();
            Query query = session.getNamedQuery("getUsuarioByLogin");
            query.setParameter("login", login);
            
            usuario = query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
        	HibernateUtil.close(session);
        }
        return usuario;
	}
	
	protected void handleException(HibernateException e)  {
    	HibernateUtil.rollback(tx);
        e.printStackTrace();
    }

    protected void startOperation() throws HibernateException {
        session = HibernateUtil.openSession();
        tx = session.beginTransaction();
    }
}
