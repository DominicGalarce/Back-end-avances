package cl.accenture.programatufuturo.proyecto;

import cl.accenture.programatufuturo.proyecto.DAO.Conexion;
import cl.accenture.programatufuturo.proyecto.DAO.ReclamoDAO;
import cl.accenture.programatufuturo.proyecto.DAO.UsuarioDAO;
import cl.accenture.programatufuturo.proyecto.model.*;

import java.util.Date;

public class Programa {

    public static void main(String[] args) throws Exception {

        long id = new Date().getTime();
        UsuarioDAO dao = new UsuarioDAO(new Conexion());
        //Usuario pizzac = new Usuario("Pizza","pizza@gmail.com", new Date(), new Date(),34567,"chilena","18721956-0",new Rol());


                //dao.almacenarUsuario(pizzac);

//Id, Nombre, email, contraseña, ultimoLogin, fechaDeNacimiento, telefono, nacionalidad, rut, genero, Rol_Id
        ReclamoDAO dao1 = new ReclamoDAO(new Conexion());
        Reclamo reclamo2 = new Reclamo(1,new Usuario(), "reclamo!! de prueba","reclamo!! de prueba sn internet","rm",new Tipo(), new Estado(),new Date());



         dao1.insertarReclamo(reclamo2);
        System.out.println("Reclamo agregado + " + reclamo2);


    }



}
