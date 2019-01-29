package com.cds.jdbc;
import com.cds.jdbc.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL extends Config{
	
	//Generar la conexion	
    public Connection conectarMySQL(){
        
    	//Objeto conexion Mysql
    	Connection conn = null;

        try {
        	//Especificar el driver definido en Config
            Class.forName(driver);
            
            //Crear la conexión
            conn = DriverManager.getConnection(url, username, password);
            
            //Validar tiempo de respuesta
            boolean valid = conn.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
            
        } catch (ClassNotFoundException | SQLException e) {//excepciones
            //Mensaje de excepcion
        	e.printStackTrace();
        }

        return conn;//Retorno de conexion
    }
    
    //test
    public static void main(String[] args) {
    	ConexionMySQL  javaMySQLBasic = new ConexionMySQL ();
        javaMySQLBasic.conectarMySQL(); 
    }    
}