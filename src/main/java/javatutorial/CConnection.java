package javatutorial;

import java.sql.*;

public class CConnection {
    public Connection cn;

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/latihan?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

   public void openConnection() {
    try {
        Class.forName(JDBC_DRIVER);
        // GANTI JADI INI:
        cn = DriverManager.getConnection(DATABASE_URL, "root", "");
        System.out.println("✅ Database Connected!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

    public void closeConnection() {
        try {
            if (cn != null && !cn.isClosed()) cn.close();
        } catch (Exception ex) {}
    }
}