/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.dao.*;
import modelo.sql.*;

/**
 *
 * @author esmeralda
 */
public class Logica {
    private AlumnoDao auxAlumno;
    private AreaDao auxArea;
    private ActividadAlumnoDao auxActividadAlumno;
    private TipoDao auxTipo;
    private ActividadDao auxActividad;
    private ProfesorDao auxProfesor;
    private SolicitudDao auxSolicitud;

    public Logica() {
        auxAlumno = new AlumnoDao();
        auxArea = new AreaDao();
        auxActividadAlumno = new ActividadAlumnoDao();
        auxTipo = new TipoDao();
        auxActividad = new ActividadDao();
        auxProfesor = new ProfesorDao();
        auxSolicitud = new SolicitudDao();
    }

    public boolean validarEliminarAlumno(Alumno obj){
    	return obj != null;
    }
    
    public boolean validarAgregarAlumno(Alumno obj){
    	return obj != null;
    }
    
    public boolean validarModificarAlumno(Alumno obj){
    	return obj != null;
    }
    
    public boolean validarEliminarArea(Area obj){
    	return obj != null;
    }
    
    public boolean validarAgregarArea(Area obj){
    	return obj != null;
    }
    
    public boolean validarModificarArea(Area obj){
    	return obj != null;
    }

    public boolean validarEliminarActividadAlumno(ActividadAlumno obj){
    	return obj != null;
    }
    
    public boolean validarAgregarActividadAlumno(ActividadAlumno obj){
    	return obj != null;
    }
    
    public boolean validarModificarActividadAlumno(ActividadAlumno obj){
    	return obj != null;
    }

    public boolean validarEliminarTipo(Tipo obj){
    	return obj != null;
    }
    
    public boolean validarAgregarTipo(Tipo obj){
    	return obj != null;
    }
    
    public boolean validarModificarTipo(Tipo obj){
    	return obj != null;
    }
    
    public boolean validarEliminarActividad(Actividad obj){
    	return obj != null;
    }
    
    public boolean validarAgregarActividad(Actividad obj){
    	return obj != null;
    }
    
    public boolean validarModificarActividad(Actividad obj){
    	return obj != null;
    }
    
    public boolean validarEliminarProfesor(Profesor obj){
    	return obj != null;
    }
    
    public boolean validarAgregarProfesor(Profesor obj){
    	return obj != null;
    }
    
    public boolean validarModificarProfesor(Profesor obj){
    	return obj != null;
    }
    
    public boolean validarEliminarSolicitud(Solicitud obj){
    	return obj != null;
    }
    
    public boolean validarAgregarSolicitud(Solicitud obj){
    	return obj != null;
    }
    
    public boolean validarModificarSolicitud(Solicitud obj){
    	return obj != null;
    }
}
