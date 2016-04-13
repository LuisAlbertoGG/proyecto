package modelo.sql;
// Generated Apr 11, 2016 7:57:33 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Profesor generated by hbm2java
 */
public class Profesor  implements java.io.Serializable {


     private int idProfesor;
     private String SRfc;
     private String SNombre;
     private String SAppaterno;
     private String SApmaterno;
     private String SContrasenha;
     private String SCorreo;
     private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);
     private Set<Actividad> actividads = new HashSet<Actividad>(0);

    public Profesor() {
    }

	
    public Profesor(int idProfesor, String SRfc, String SNombre, String SAppaterno, String SApmaterno, String SContrasenha, String SCorreo) {
        this.idProfesor = idProfesor;
        this.SRfc = SRfc;
        this.SNombre = SNombre;
        this.SAppaterno = SAppaterno;
        this.SApmaterno = SApmaterno;
        this.SContrasenha = SContrasenha;
        this.SCorreo = SCorreo;
    }
    public Profesor(int idProfesor, String SRfc, String SNombre, String SAppaterno, String SApmaterno, String SContrasenha, String SCorreo, Set<Solicitud> solicituds, Set<Actividad> actividads) {
       this.idProfesor = idProfesor;
       this.SRfc = SRfc;
       this.SNombre = SNombre;
       this.SAppaterno = SAppaterno;
       this.SApmaterno = SApmaterno;
       this.SContrasenha = SContrasenha;
       this.SCorreo = SCorreo;
       this.solicituds = solicituds;
       this.actividads = actividads;
    }
   
    public int getIdProfesor() {
        return this.idProfesor;
    }
    
    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    public String getSRfc() {
        return this.SRfc;
    }
    
    public void setSRfc(String SRfc) {
        this.SRfc = SRfc;
    }
    public String getSNombre() {
        return this.SNombre;
    }
    
    public void setSNombre(String SNombre) {
        this.SNombre = SNombre;
    }
    public String getSAppaterno() {
        return this.SAppaterno;
    }
    
    public void setSAppaterno(String SAppaterno) {
        this.SAppaterno = SAppaterno;
    }
    public String getSApmaterno() {
        return this.SApmaterno;
    }
    
    public void setSApmaterno(String SApmaterno) {
        this.SApmaterno = SApmaterno;
    }
    public String getSContrasenha() {
        return this.SContrasenha;
    }
    
    public void setSContrasenha(String SContrasenha) {
        this.SContrasenha = SContrasenha;
    }
    public String getSCorreo() {
        return this.SCorreo;
    }
    
    public void setSCorreo(String SCorreo) {
        this.SCorreo = SCorreo;
    }
    public Set<Solicitud> getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set<Solicitud> solicituds) {
        this.solicituds = solicituds;
    }
    public Set<Actividad> getActividads() {
        return this.actividads;
    }
    
    public void setActividads(Set<Actividad> actividads) {
        this.actividads = actividads;
    }




}


