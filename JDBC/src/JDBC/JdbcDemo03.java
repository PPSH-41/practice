package JDBC;

import java.sql.*;

//数据定义语言DDL
public class JdbcDemo03 {
    public static void main(String[] args) {
        Statement stmt =null;
        Connection connection =null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //String sql = "create table student (id int ,name varchar (20))";//DDL
            String sql = "select * from t_course";//DQL
            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true", "root","mysql");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true", "root","mysql");
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);//影响的行数
            while (rs.next()) {
                ;//游标向下移动一行
                int id = rs.getInt(1);
                String name = rs.getString("coursename");
                String name1 = rs.getString("coursestate");
                System.out.println(id + "   " + name + "    " + name1);
            }

            //System.out.println(rs);
           /* if (count >0 ){
                System.out.println("success");
            }else{
                System.out.println("failed");
            }*/
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
