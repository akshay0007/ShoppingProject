package com.example.nextProject.BackhandCode;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by ubuntu on 17/12/17.
 */
@Configuration
@ComponentScan(value = "com.example")
public class HiberanateConfig {
    private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/test";
    private final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQLDialect";
    private final static String DATABASE_USERNAME = "root";
    private final static String DATABASE_PASSWORD = "root";

    @Bean("dataSource")
    public DataSource getDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(DATABASE_DRIVER);
        basicDataSource.setUrl(DATABASE_URL);
        basicDataSource.setUsername(DATABASE_USERNAME);
        basicDataSource.setPassword(DATABASE_PASSWORD);
        return basicDataSource;
    }

    @Bean
    public SessionFactory getSessionFactory(DataSource ds) {
        LocalSessionFactoryBuilder localSessionFactoryBuilder
                = new LocalSessionFactoryBuilder(ds);
        localSessionFactoryBuilder.addProperties(getHibernateProperties());
        localSessionFactoryBuilder.scanPackages("com.example");
        return localSessionFactoryBuilder.buildSessionFactory();
    }

    private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", DATABASE_DIALECT);
        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "update");
        return properties;
    }

    @Bean
    public HibernateTransactionManager getTxnMnger(SessionFactory sessfactory) {
        HibernateTransactionManager txnmng = new HibernateTransactionManager(sessfactory);
        return txnmng;

    }
}
