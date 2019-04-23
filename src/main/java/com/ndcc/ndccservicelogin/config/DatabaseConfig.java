package com.ndcc.ndccservicelogin.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory",
        basePackages = {"com.ndcc.ndccservicelogin.repository"})
public class DatabaseConfig {
    @Bean(name="mysqlds")
    @ConfigurationProperties(prefix="ndcc.mysql.ds")
    @Primary
    public DataSource createMySqlDatasource(){
        return DataSourceBuilder.create().build();
    }



}
