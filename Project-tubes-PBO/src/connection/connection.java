/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TKJ
 */
public class connection {
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException {
        if(koneksi==null){
            new Driver();
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost/wireframe","root","");
        }
        return koneksi;
    }

    public static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
