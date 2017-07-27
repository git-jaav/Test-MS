package pe.royalsystems.springerp.MSTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.wftracking.domain.WaFlujoNegocio;
import pe.royalsystems.springerp.wftracking.service.WaFlujoNegocioService;

@RestController
@EnableAutoConfiguration
public class HomeController {
	
	
	@Autowired
	WaFlujoNegocioService waFlujoNegocioService ; 
	
    @RequestMapping("/")
    String home() {
    	try{
        	WaFlujoNegocio obj = new WaFlujoNegocio();
        	obj.getId().setTipoNegocioId(2);
        	obj.setAccionDbGlobal("ALL_DATA");
        	List<WaFlujoNegocio> lista =  waFlujoNegocioService.listarElementos(obj, false);
        	if(lista!=null){
        		for(WaFlujoNegocio  result : lista){
        			UtilesCommons.showObjeto(result);	
        		}    			
    		}
        	return "Hola Mundo! MS - SUCCES";
    	}catch(Exception e){
    		e.printStackTrace();
    		return "Hola Mundo! MS - EXECPTION:: "+e;
    	}    			    	    	
        
    }
}
