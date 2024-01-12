package org.omardev;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection conection=null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","pass123");
            if(conection != null){
                System.out.println("Conexion exitosa");
            }
        }catch(SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
}
