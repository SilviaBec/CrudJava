package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sylvia
 */
public class Conexion {
    //variable tipo conection
    Connection con;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/registro", "root","");
        }catch (Exception e){
        }
           
    }
    //Un metodo public de tipo conection que retorna el valor de la conexion 
    public Connection getConnection(){
        return con;
    }
}