package cl.accenture.programatufuturo.proyecto.controller;

import cl.accenture.programatufuturo.proyecto.DAO.Conexion;
import cl.accenture.programatufuturo.proyecto.DAO.UsuarioDAO;
import cl.accenture.programatufuturo.proyecto.exception.SinConexionException;
import  cl.accenture.programatufuturo.proyecto.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController

public class UsuarioController {
    Conexion conexion = new Conexion();

    @PostMapping  ("/almacenarUsuario")
    public void setUsuario(@RequestBody Usuario usuario) {
        try {
            UsuarioDAO dao = new UsuarioDAO(conexion);
            dao.almacenarUsuario(usuario);

        } catch (SinConexionException e) {
            e.printStackTrace();
        }
    }
    @PostMapping ("/login")
    public void Login(@RequestBody String usuario, String contraseña){
        try{
            UsuarioDAO dao= new UsuarioDAO(conexion);
            dao.login(usuario, contraseña);
        } catch (SinConexionException e) {
            e.printStackTrace();
        }
    }

}
