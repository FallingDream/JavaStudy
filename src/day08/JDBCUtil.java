package day08;

import java.sql.*;

/**
 *
 * @author wangjj
 * @create 2019-12-11 15:46
 **/
@SuppressWarnings("all")
public class JDBCUtil {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/t_user?&useSSL=false&serverTimezone=UTC";
    private static String name = "root";
    private static String password = "31824127";


    public static void getDriver(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, name, password);
        return connection;
    }

    public static void closeConn(Connection conn, Statement stat, PreparedStatement ps, ResultSet rs){
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat!=null){
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
