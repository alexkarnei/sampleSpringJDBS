package by.itStep.karnei.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.activation.DataSource;

@Configuration
public class ConfigurationController {

        @Bean
        public DriverManagerDataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("org.postgresql.Driver");
            dataSource.setUrl("jdbc:postgresql://localhost:5432/Academy");
            dataSource.setUsername("postgres");
            dataSource.setPassword("korareyt7841248");
            return dataSource;
        }

//        @Bean
//        public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//            return new JdbcTemplate((javax.sql.DataSource) dataSource);
//        }

    }
