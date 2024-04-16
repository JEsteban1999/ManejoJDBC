package domain;

public class Usuario {
    private int idUsuario;
    private String usuario;
    private String password;

    public Usuario() {
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String nombreUsuario, String password) {
        this.usuario = nombreUsuario;
        this.password = password;
    }

    public Usuario(int idUsuario, String nombreUsuario, String password) {
        this.idUsuario = idUsuario;
        this.usuario = nombreUsuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Persona{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + usuario + ", password=" + password  + '}';
    }
    
    
}
