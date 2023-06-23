package model;

import java.sql.DriverManager;
import java.sql.Connection;

public class Connect {
    //creacion de variable bbdd para la conexion con base de datos ademsa de la eleccion de los datos para acceder a esta
    private static final String bbdd="jdbc:mysql://localhost:3308/Twitter";
    private static final String user="root";
    private static final String password="";
    private static Connection con;
    //creacion de la funcion para conectar con BD
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(bbdd, user, password);
            System.out.println("conexion exitosa");
        } catch (Exception e) {
            System.out.println("error"+e.getMessage().toString());
        }
        return con;
    }
    //uso de la funcion conectar para dar acceso a base de datos
    public static void main() {
        Connect.conectar();
    }
}