/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import modelo.dao.ActividadDao;
import modelo.sql.Actividad;

/**
 *
 * @author Rodrigo
 */
@Named(value = "publicaBean")
@Dependent
public class publicaBean {

    private Actividad profesorPublica= null;
    
    
    /**
     * Creates a new instance of publicaBean
     */
    public publicaBean() {
        profesorPublica = new Actividad();
    }
    
    public void insertarPublicacion(){
        ActividadDao lickDao = new ActividadDao();
        lickDao.insert(profesorPublica);
        profesorPublica = new Actividad();
    }

    public Actividad getProfesorPublica() {
        return profesorPublica;
    }

    public void setProfesorPublica(Actividad profesorPublica) {
        this.profesorPublica = profesorPublica;
    }
}
