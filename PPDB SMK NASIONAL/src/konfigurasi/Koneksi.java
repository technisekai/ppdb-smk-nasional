/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konfigurasi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

/**
 *
 * @author Im-Bot
 */
public class Koneksi {
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("kosong");
        dataSource.setDatabaseName("smk_nasional");
        dataSource.setServerName("localhost");
        try {
        conn = (Connection) dataSource.getConnection();
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
}
