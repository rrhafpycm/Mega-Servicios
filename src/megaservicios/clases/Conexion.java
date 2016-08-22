package megaservicios.clases;

import java.sql.*;

public class Conexion {
    
    Connection conectar= null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/MegaServicios","root","");
        }catch (Exception e) {
            System.out.println("No se puede conectar con MySQL... " + e);
        }
        return conectar;
    }

}
