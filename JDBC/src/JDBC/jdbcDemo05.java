package JDBC;

import util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDemo05 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt1 = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);//开启事务

            String sql1 = "update student set salary = salary - ? where id = ?";
            String sql2 = "update student set salary = salary + ?  where id = ?";
            pstmt = connection.prepareStatement(sql1);
            pstmt1 = connection.prepareStatement(sql2);
            pstmt.setDouble(1,500);
            pstmt.setInt(2,1);

            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,2);
            //执行资源
            pstmt.executeUpdate();
            pstmt1.executeUpdate();

            connection.commit();//提交事务
        } catch (Exception throwables) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally {
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(pstmt1 != null){
                try {
                    pstmt1.close();
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
            //JDBCUtils.close(pstmt,connection);
            //JDBCUtils.close(pstmt1,null);

        }
    }
}
