package org.web3.flota.persist;

import java.util.List;

public class TipoDocumentoDAO extends GenericDAO implements IGenericDAO{
	private static TipoDocumentoDAO instance;
	
	private TipoDocumentoDAO(){
		super();
	};
	
	public static TipoDocumentoDAO getInstance(){
		if(instance == null)
			instance = new TipoDocumentoDAO();
		return instance;
	}
	
	public void create(Object tipoDocumentoDTO) {
        super.saveOrUpdate(tipoDocumentoDTO);
    }
	
	public void update(Object tipoDocumentoDTO) {
        super.saveOrUpdate(tipoDocumentoDTO);
    }
	
	public void delete(Object tipoDocumentoDTO) {
        super.delete(tipoDocumentoDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllTiposDocumento");
    }
}
