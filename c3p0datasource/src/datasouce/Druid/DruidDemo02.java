package datasouce.Druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo02 {
    public static void main(String[] args) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            conn = JDBCUtils.getconnection();
            String sql = "insert into t_course values(null,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"物理");
            pstmt.setInt(2,2);
            int i = pstmt.executeUpdate();
            System.out.println(i);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(null,pstmt,conn);
        }

    }
}
