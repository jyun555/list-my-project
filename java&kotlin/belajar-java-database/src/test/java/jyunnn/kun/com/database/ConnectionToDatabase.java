package jyunnn.kun.com.database;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDatabase {
    @BeforeAll
    static void beforeAll() {
        try{
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }

    @Test
    void TestConnectToDatabase(){
        String jdbcUrl = "jdbc:mysql://localhost:3306/belajar_jdbc";
        String username = "camela";
        String password = "yohan123";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println(connection);
            System.out.println("Sukses konek ke database");
        } catch (SQLException e) {
            Assertions.fail(e);
        }
    }
}
