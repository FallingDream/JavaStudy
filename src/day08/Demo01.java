package day08;

import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 连接数据库
 * @author wangjj
 * @create 2019-12-11 14:37
 **/
@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        JDBCUtil.getDriver();
        //2.建立连接

        Connection conn = JDBCUtil.getConnection();
        //3.获取执行语句
        Statement stat = conn.createStatement();
        //4.执行sql语句
        String sql = "select * from account";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()){
            int id = rs.getInt("id");
            String username = rs.getString("name");
            System.out.println(id+"---"+username);
        }
        JDBCUtil.closeConn(conn,stat,null,rs);

    }
}
