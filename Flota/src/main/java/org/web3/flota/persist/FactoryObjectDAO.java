package org.web3.flota.persist;

import org.web3.flota.model.AsignacionDTO;
import org.web3.flota.model.CedulaDTO;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.EstadoVehiculoDTO;
import org.web3.flota.model.MarcaDTO;
import org.web3.flota.model.ModeloDTO;
import org.web3.flota.model.PaisDTO;
import org.web3.flota.model.PolizaDTO;
import org.web3.flota.model.ReputacionDTO;
import org.web3.flota.model.SeguroDTO;
import org.web3.flota.model.TipoDocumentoDTO;
import org.web3.flota.model.TipoVehiculoDTO;
import org.web3.flota.model.VehiculoDTO;

public class FactoryObjectDAO {

	public static IGenericDAO createObjectDAO(Class<?> clazz) {

		IGenericDAO dao = null;
		
		if(clazz.equals(AsignacionDTO.class))
			dao = AsignacionDAO.getInstance();
		else if(clazz.equals(CedulaDTO.class))
			dao = CedulaDAO.getInstance();
		else if(clazz.equals(ClienteDTO.class))
			dao = ClienteDAO.getInstance();
		else if(clazz.equals(EstadoVehiculoDTO.class))
			dao = EstadoVehiculoDAO.getInstance();
		else if(clazz.equals(MarcaDTO.class))
			dao = MarcaDAO.getInstance();
		else if(clazz.equals(ModeloDTO.class))
			dao = ModeloDAO.getInstance();
		else if(clazz.equals(PaisDTO.class))
			dao = PaisDAO.getInstance();
		else if(clazz.equals(PolizaDTO.class))
			dao = PolizaDAO.getInstance();
		else if(clazz.equals(ReputacionDTO.class))
			dao = ReputacionDAO.getInstance();
		else if(clazz.equals(SeguroDTO.class))
			dao = SeguroDAO.getInstance();
		else if(clazz.equals(TipoDocumentoDTO.class))
			dao = TipoDocumentoDAO.getInstance();
		else if(clazz.equals(TipoVehiculoDTO.class))
			dao = TipoVehiculoDAO.getInstance();
		else if(clazz.equals(VehiculoDTO.class))
			dao = VehiculoDAO.getInstance();
		
		return dao;
	}
}
