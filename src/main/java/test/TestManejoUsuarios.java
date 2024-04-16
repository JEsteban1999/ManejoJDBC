package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        // Insertando un nuevo objeto
//        Usuario usuarioNuevo = new Usuario("Sebastian Narvaez", "jusenaca");
//        usuarioDao.insertar(usuarioNuevo);
        // Modificar un objeto de persona existente
//        Usuario usuarioModificado = new Usuario(3, "Juan Sebastian", "jusenaca");
//        usuarioDao.actualizar(usuarioModificado);
        // Eliminar un registro
        Usuario usuarioEliminado = new Usuario(3);
        usuarioDao.eliminar(usuarioEliminado);

        // Listado de personas
        List<Usuario> usuarios = usuarioDao.seleccionar();
//        for(Persona persona: personas){
//            System.out.println("persona = " + persona);
//        }
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });
    }
}
