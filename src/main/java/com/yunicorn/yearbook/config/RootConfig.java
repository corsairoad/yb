package com.yunicorn.yearbook.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

import javax.sql.DataSource;

/**
 * Created by fadlymunandar on 8/26/17.
 */

@Configuration
@ComponentScan("com.yunicorn.yearbook.dao")
public class RootConfig {

    @Bean("dataSource")
    public DataSource dataSource() {
        JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
        return dataSourceLookup.getDataSource("jdbc/yearbook");
    }
}
