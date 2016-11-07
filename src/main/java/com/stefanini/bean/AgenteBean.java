package com.stefanini.bean;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;
import java.io.Serializable;

@Named( "agenteMB")
@SessionScoped

public class AgenteBean implements Serializable  {
	

    @Inject
    private AgenteService agenteService;
    
    private Agente agente = new Agente ();
    
    
    public Agente getAgente() {
		return agente;
	}


	public void setAgente(Agente agente) {
		this.agente = agente;
	}


	public String chamar() {
    
        return "pages/teste";
    }

}
