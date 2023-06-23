package model;

public class UsuarioVO {
    private String nombreUsuario="";
    private String correoUsuario="";
    private String telefono="";
    private String usuario="";
    private String passwords="";
    private String estado="";
    public UsuarioVO() {
    }
    public UsuarioVO(String nombreUsuario, String correoUsuario, String telefono, String usuario, String passwords,
            String estado) {
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.telefono = telefono;
        this.usuario = usuario;
        this.passwords = passwords;
        this.estado = estado;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getCorreoUsuario() {
        return correoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPasswords() {
        return passwords;
    }
    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

