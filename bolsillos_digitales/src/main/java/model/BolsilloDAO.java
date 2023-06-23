package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BolsilloDAO {
    public class BolsilloVO extends Connect{
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql=null;
        public void consultarsaldo() {
            try{
        //creacion de la tarea que se ejecutara en la BD
  String sql = "select saldobolsillo from Bolsillo ";
  //conexion con base de datos
  PreparedStatement statement = con.prepareStatement(sql);
  statement.setString(1, "saldobolsillo");
  statement.executeUpdate();
//finalizacion del proceso
  statement.close();
  //cierre de la conexion
  con.close();
            }
        }
public void recargarBolsillo()  {
    try {
        String sql = "select saldobolsillo from Bolsillo ";
  //conexion con base de datos
  PreparedStatement statement = con.prepareStatement(sql);
  statement.setString(1, "saldobolsillo");
  statement.executeUpdate();
//finalizacion del proceso
  statement.close();
  //cierre de la conexion
  con.close();
 }
}
    }
}
