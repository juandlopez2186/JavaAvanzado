package model;
//importar libreria SQL para ejecutar tareas en la base de datos 
import java.sql.*;
public class UsuarioDAO {
    public class UsuarioVO extends Connect{
        Connection con; 
        PreparedStatement ps; 
        ResultSet rs; 
        String sql=null;  
        //creacion de funcion para añadir usuarios
    public void addusuarios() {
        try{
        //creacion de la tarea que se ejecutara en la BD
  String sql = "insert into Usuario(nombreUsuario,correoUsuario,telefono,usuario,passwords,estado) values(?,?,?,?,?,?,?)";
  //conexion con base de datos 
  PreparedStatement statement = con.prepareStatement(sql);
  statement.setString(1, "nombreUsuario");
  statement.setString(2, "correoUsuario");
  statement.setString(3, "telefono");
  statement.setString(4, "usuario");
  statement.setString(5, "passwords");
  statement.setString(6, "estado");

  statement.executeUpdate();
//finalizacion del proceso
  statement.close();
  //cierre de la conexion
  con.close();
} 
catch (SQLException es) {
  es.printStackTrace();
}
}
public void listusuario() {
    try {
        String sql = "SELECT * FROM Usuario WHERE telefono=h";
        PreparedStatement statement =con.prepareStatement(sql);
    
        statement.setString(1, "telefono");
        statement.setString(2, "passwords");
        
        statement.executeQuery();
        statement.close();
        con.close();
        
    } catch (Exception e) {
    }
    
}
    }
}