package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//数据操纵语言DML
public class jdbcDemo02 {
    public static void main(String[] args) {
        Statement stmt =null;
        Connection connection =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "INSERT INTO t_course VALUES(null,'物理',3)";
            //delete from t_course where courseid = 4
            //UPDATE t_course SET coursestate = 0 where courseid = 4
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true", "root","mysql");
            stmt = connection.createStatement();
            int count = stmt.executeUpdate(sql);//影响的行数
            System.out.println(count);
            if (count >0 ){
                System.out.println("success");
            }else{
                System.out.println("failed");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
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
