package org.web3.flota.bussiness.factory;

import org.web3.flota.bussiness.AsignacionBO;
import org.web3.flota.bussiness.CedulaBO;
import org.web3.flota.bussiness.ClienteBO;
import org.web3.flota.bussiness.EstadoVehiculoBO;
import org.web3.flota.bussiness.MarcaBO;
import org.web3.flota.bussiness.ModeloBO;
import org.web3.flota.bussiness.PaisBO;
import org.web3.flota.bussiness.PolizaBO;
import org.web3.flota.bussiness.ReputacionBO;
import org.web3.flota.bussiness.SeguroBO;
import org.web3.flota.bussiness.TipoDocumentoBO;
import org.web3.flota.bussiness.TipoVehiculoBO;
import org.web3.flota.bussiness.UsuarioBO;
import org.web3.flota.bussiness.VehiculoBO;
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
import org.web3.flota.model.UsuarioDTO;
import org.web3.flota.model.VehiculoDTO;

public class FactoryObjectBO {
	
	public static IObjectBO createObjectBO(Object objetoDTO) {
		IObjectBO objectBO = null;
		
		if(objetoDTO instanceof AsignacionDTO)
			objectBO = AsignacionBO.getInstance();
		else if(objetoDTO instanceof CedulaDTO)
			objectBO = CedulaBO.getInstance();
		else if(objetoDTO instanceof ClienteDTO)
			objectBO = ClienteBO.getInstance();
		else if(objetoDTO instanceof EstadoVehiculoDTO)
			objectBO = EstadoVehiculoBO.getInstance();
		else if(objetoDTO instanceof MarcaDTO)
			objectBO = MarcaBO.getInstance();
		else if(objetoDTO instanceof ModeloDTO)
			objectBO = ModeloBO.getInstance();
		else if(objetoDTO instanceof PaisDTO)
			objectBO = PaisBO.getInstance();
		else if(objetoDTO instanceof PolizaDTO)
			objectBO = PolizaBO.getInstance();
		else if(objetoDTO instanceof ReputacionDTO)
			objectBO = ReputacionBO.getInstance();
		else if(objetoDTO instanceof SeguroDTO)
			objectBO = SeguroBO.getInstance();
		else if(objetoDTO instanceof TipoDocumentoDTO)
			objectBO = TipoDocumentoBO.getInstance();
		else if(objetoDTO instanceof TipoVehiculoDTO)
			objectBO = TipoVehiculoBO.getInstance();
		else if(objetoDTO instanceof UsuarioDTO)
			objectBO = UsuarioBO.getInstance();
		else if(objetoDTO instanceof VehiculoDTO)
			objectBO = VehiculoBO.getInstance();
		
		return objectBO;		
	}
	
	public static IObjectBO createObjectBO(Class<?> clazz) {
		IObjectBO objectBO = null;
		
		if(clazz.equals(AsignacionDTO.class))
			objectBO = AsignacionBO.getInstance();
		else if(clazz.equals(CedulaDTO.class))
			objectBO = CedulaBO.getInstance();
		else if(clazz.equals(ClienteDTO.class))
			objectBO = ClienteBO.getInstance();
		else if(clazz.equals(EstadoVehiculoDTO.class))
			objectBO = EstadoVehiculoBO.getInstance();
		else if(clazz.equals(MarcaDTO.class))
			objectBO = MarcaBO.getInstance();
		else if(clazz.equals(ModeloDTO.class))
			objectBO = ModeloBO.getInstance();
		else if(clazz.equals(PaisDTO.class))
			objectBO = PaisBO.getInstance();
		else if(clazz.equals(PolizaDTO.class))
			objectBO = PolizaBO.getInstance();
		else if(clazz.equals(ReputacionDTO.class))
			objectBO = ReputacionBO.getInstance();
		else if(clazz.equals(SeguroDTO.class))
			objectBO = SeguroBO.getInstance();
		else if(clazz.equals(TipoDocumentoDTO.class))
			objectBO = TipoDocumentoBO.getInstance();
		else if(clazz.equals(TipoVehiculoDTO.class))
			objectBO = TipoVehiculoBO.getInstance();
		else if(clazz.equals(UsuarioDTO.class))
			objectBO = UsuarioBO.getInstance();
		else if(clazz.equals(VehiculoDTO.class))
			objectBO = VehiculoBO.getInstance();
		
		return objectBO;		
	}
}
