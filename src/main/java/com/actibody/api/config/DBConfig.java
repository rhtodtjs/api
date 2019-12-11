//package com.actibody.api.config;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.AdviceMode;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement(proxyTargetClass = false, mode = AdviceMode.ASPECTJ)
//@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = { "com.actibody.api" })
//public class DBConfig {
//
//
//    private PlatformTransactionManager tm;
//
//
//    @Bean(name = "dataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "entityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
//                                                                       @Qualifier("dataSource") DataSource dataSource) {
//        return builder.dataSource(dataSource).packages("com.actibody.api").persistenceUnit("actibody").build();
//    }
//
//
//
//    @Bean(name = "transactionManager")
//    public PlatformTransactionManager transactionManager(
//            @Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
//
//        if(tm == null) {
//            JpaTransactionManager jtm = new JpaTransactionManager(entityManagerFactory);
//            jtm.setDefaultTimeout(30);
//            tm = jtm;
//
//        }
//        return tm;
//
//    }
//
//}
