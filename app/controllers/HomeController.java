package controllers;

import models.Usuario;
import play.mvc.*;
import services.UsuarioService;

import javax.inject.Inject;
import java.util.List;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Inject UsuarioService usuarioService;

    public Result index() {

        String nombreUsuario = "emir";

        usuarioService.crearUsuario(nombreUsuario);

        List<Usuario> listadoDeUsuarios = usuarioService.obtenerTodosLosUsuarios();
        return ok(listadoDeUsuarios.toString());
    }
}
