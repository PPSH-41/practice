package datasouce.Druid;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo01 {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        InputStream res = DruidDemo01.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(res);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }
}
