package services;


import models.Usuario;


import javax.inject.Singleton;
import java.util.List;


@Singleton
public class UsuarioService {

    public void  crearUsuario(String usuarioNombre){
        Usuario usuario = new Usuario();
        usuario.nombre = usuarioNombre;
        usuario.save();
    }

    public List<Usuario> obtenerTodosLosUsuarios(){
        return Usuario.find.all();
    }
}