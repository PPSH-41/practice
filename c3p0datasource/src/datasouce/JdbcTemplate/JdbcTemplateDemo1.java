package datasouce.JdbcTemplate;

import datasouce.Druid.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcTemplateDemo1 {

    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update t_course set coursestate = 0 where courseid = ?";
        int count = template.update(sql, 5);
        System.out.println(count);
    }
}
