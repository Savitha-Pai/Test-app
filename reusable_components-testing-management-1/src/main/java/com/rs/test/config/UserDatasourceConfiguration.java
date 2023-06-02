package com.rs.test.config;

import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = {"com.rs.um.entity.*"})
@EnableJpaRepositories(
    entityManagerFactoryRef = "userEntityManagerFactory",
    transactionManagerRef = "userTransactionManager",
    basePackages = {"com.rs.um.dataaccess.rds.repository"})

public class UserDatasourceConfiguration {

  @Primary
  @Bean(name = "userProperties")
  @ConfigurationProperties("spring.datasource.user")
  public DataSourceProperties dataSourceProperties() {
    return new DataSourceProperties();
  }

  @Primary
  @Bean(name = "userDatasource")
  @ConfigurationProperties(prefix = "spring.datasource.user")
  public DataSource datasource(@Qualifier("userProperties") DataSourceProperties properties) {
    return properties.initializeDataSourceBuilder().build();
  }

  @Primary
  @Bean(name = "userEntityManagerFactory")
  public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
      (EntityManagerFactoryBuilder builder,
       @Qualifier("userDatasource") DataSource dataSource) {
    return builder.dataSource(dataSource)
        .packages("com.rs.um.entity")
        .persistenceUnit("user_management").build();
  }

  @Primary
  @Bean(name = "userTransactionManager")
  @ConfigurationProperties("spring.jpa")
  public PlatformTransactionManager transactionManager(
      @Qualifier("userEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
    return new JpaTransactionManager(entityManagerFactory);
  }
}
