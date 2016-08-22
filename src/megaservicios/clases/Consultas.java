package megaservicios.clases;

import java.sql.*;

public class Consultas {

    public ResultSet ventasSemana() throws ClassNotFoundException, SQLException {
        
        Statement stmt = cn.createStatement();
        ResultSet rslt = stmt.executeQuery("");

        return rslt;
    }

    public ResultSet corporativoVentas() throws ClassNotFoundException, SQLException {
        
        Statement stmt = cn.createStatement();
        ResultSet rslt = stmt.executeQuery("");

        return rslt;
    }

    public ResultSet corporativoVentasAcumuladas() throws ClassNotFoundException, SQLException {

        Statement stmt = cn.createStatement();
        ResultSet rslt = stmt.executeQuery("");
        
        return rslt;
    }

    public ResultSet ventasDiaEmpleadosTransacion() throws ClassNotFoundException, SQLException {
        
        Statement stmt = cn.createStatement();
        ResultSet rslt = stmt.executeQuery("");
        
        return rslt;
    }

    public ResultSet ventasArticulo() throws ClassNotFoundException, SQLException {

        Statement stmt = cn.createStatement();
        ResultSet rslt = stmt.executeQuery("");
        
        return rslt;
    }

    public ResultSet ventasArticuloExcento() throws ClassNotFoundException, SQLException {
        
        Statement stmt = cn.createStatement();
        ResultSet rslt = stmt.executeQuery("");
        
        return rslt;
    }

    public ResultSet ventasArticuloUtilidad() throws ClassNotFoundException, SQLException {

        Statement stmt = cn.createStatement();
        ResultSet rslt = stmt.executeQuery("");
        
        return rslt;
    }

    public ResultSet ventasCliente() throws ClassNotFoundException, SQLException {
        
        Statement stmt = cn.createStatement();
        ResultSet rslt = stmt.executeQuery("");
        
        return rslt;
    }

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
}
