/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author migue
 */
public class conexion {
    String strConexion = "jdbc:sqlite:CRUD.s3db";
    Connection conn = null;
    
    public conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexion);
            System.out.println("Conexion Establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public Connection conectar(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexion);
            System.out.println("Conexion Establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e);
        }
        return conn;
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            
            System.out.println(e);
            return null;
            
        }
    }
    
    public ResultSet listar(String strSentenciaSQL, int col, String parameter){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.setString(col, parameter);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            
            System.out.println(e);
            return null;
            
        }
    }
}
