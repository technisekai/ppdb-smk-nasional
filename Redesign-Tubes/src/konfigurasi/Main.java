/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konfigurasi;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import konfigurasi.Koneksi;

/**
 *
 * @author Im-Bot
 */
public class Main {
    public static void main(String[] args) throws SQLException{
        String nama = null, alamat = null, ttl = null, jenis_kelamin = null, jurusan_pil1= null, jurusan_pil2= null, status = null;
        int jml_un = 0;
            
        String user = "w";
        String pass = "16002";
        Connection conn = Koneksi.getConnection();
        Statement stmt = (Statement) conn.createStatement();
            
        ResultSet rsLogin = stmt.executeQuery("SELECT * FROM pendaftaran where nama='"+user+"' AND id_pendaftaran='"+pass+"';");
        while (rsLogin.next()) {
            nama = rsLogin.getString("nama");
            alamat = rsLogin.getString("alamat");
            ttl = rsLogin.getString("ttl");
            jenis_kelamin = rsLogin.getString("jenis_kelamin");
            jml_un = rsLogin.getInt("jml_un");
            jurusan_pil1 = rsLogin.getString("jurusan_pil1");
            jurusan_pil2 = rsLogin.getString("jurusan_pil2");
            status = rsLogin.getString("status");
                
            rsLogin.last();
            System.out.println(rsLogin.getRow());
        }
    }
    
}
