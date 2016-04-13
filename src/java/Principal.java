
import java.util.LinkedList;
import modelo.dao.AlumnoDao;
import modelo.sql.Alumno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esmeralda
 */
public class Principal {
    
    public static void main(String[] args){
        AlumnoDao ad = new AlumnoDao();
        Alumno a;
        LinkedList<Alumno> li;
        a = new Alumno(0, 310337098, "Antonio", "Vilchis", "Salazar", "nomanches", "correo");
        ad.insert(a);
        /*a = new Alumno(0, 310337098, "Jose Antonio", "Vilchis", "Salazar", "nomanches", "correo");
        ad.update(a);
        ad.delete(a);*/
    }
    
}
