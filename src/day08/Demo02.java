package day08;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 预处理命令，占位符
 * @author wangjj
 * @create 2019-12-11 16:04
 **/
@SuppressWarnings("all")
public class Demo02 {
    public static void main(String[] args) {
        //1.加载驱动
        JDBCUtil.getDriver();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from myAccount where name = ? and pwd = ?";
            //2.建立连接
            conn = JDBCUtil.getConnection();
            //3.预处理平台
            ps = conn.prepareStatement(sql);
            ps.setString(1,"张三");
            ps.setString(2,"123456");
            //4.结果集
            rs = ps.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                String pwd = rs.getString("pwd");
                System.out.println(name + "---" + pwd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.closeConn(conn,null,ps,rs);
        }
    }
}
