/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.dao.ProfesorDao;
import modelo.sql.Profesor;

/**
 *
 * @author luis
 */
@Named(value = "editarProfesorBean")
@ViewScoped
public class EditarProfesorBean {

    /**
     * Creates a new instance of EditarProfesorBean
     */
    Profesor profesor;
    
    public EditarProfesorBean() {
     profesor = new Profesor();   
    }
    
    public void update(){
        ProfesorDao linkDao = new ProfesorDao();
        linkDao.update(profesor);
        profesor = new Profesor();
    }
    
}
