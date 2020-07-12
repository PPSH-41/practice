package JDBC;

import domain.t_course;
import util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//2 演示jdbc工具类
//t_course表封装成对象，装载集合，返回
public class jdbcDemo04 {
    public static void main(String[] args) {
        List<t_course> list = new jdbcDemo04().findAll2();
        System.out.println(list);
        System.out.println(list.size());
    }

    public List<t_course> findAll(){
        Statement stmt =null;
        Connection connection =null;
        ResultSet rs = null;
        List<t_course> list = null;
        t_course t_course =new t_course();
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String sql = "select * from t_course";
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true", "root","mysql");
        stmt = connection.createStatement();
        rs = stmt.executeQuery(sql);
        list = new ArrayList<t_course>();
            while (rs.next()) {
                ;//游标向下移动一行
                int id = rs.getInt(1);
                String name = rs.getString("coursename");
                String name1 = rs.getString("coursestate");
                System.out.println(id + "   " + name + "    " + name1);
                //创建对象并赋值
                t_course.setCourseid(id);
                t_course.setCoursename(name);
                t_course.setCoursestate(name1);
                //装载集合
                list.add(t_course);
            }

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
        return list;
    }

    public List<t_course> findAll2(){
        Statement stmt =null;
        Connection connection =null;
        ResultSet rs = null;
        List<t_course> list = null;
        t_course t_course =new t_course();
        try{
            connection = JDBCUtils.getConnection();
            String sql = "select * from t_course";
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            list = new ArrayList<t_course>();
            while (rs.next()) {
                ;//游标向下移动一行
                int id = rs.getInt(1);
                String name = rs.getString("coursename");
                String name1 = rs.getString("coursestate");
                System.out.println(id + "   " + name + "    " + name1);
                //创建对象并赋值
                t_course.setCourseid(id);
                t_course.setCoursename(name);
                t_course.setCoursestate(name1);
                //装载集合
                list.add(t_course);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.close(rs,stmt,connection);
        }
        return list;
    }
}
