package com.controllers.proyecto;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.ToggleEvent;

@Named("fieldsetView") 
@RequestScoped
public class mensajes {

    public void handleToggle(ToggleEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORMACI�N ", "INFORMACI�N " + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}