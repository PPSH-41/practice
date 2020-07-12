package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo01 {
    public static void main(String[] args) throws Exception {
        //注册驱动
        //Class.forName("com.mysql.cj.jdbc.Driver");
        //获取数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true", "root","mysql");
        //定义sql语句
        String sql = "UPDATE t_course set coursestate = 0 where courseid = 1";
        //获取执行sql对象
        Statement statement = connection.createStatement();
        //执行sql
        int count = statement.executeUpdate(sql);
        //处理结果
        System.out.println(count);
        //释放资源
        statement.cancel();
        connection.close();
    }
}
