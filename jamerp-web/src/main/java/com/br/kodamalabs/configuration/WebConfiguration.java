package com.br.kodamalabs.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = "com.br.jamerp.domain")
@EnableMongoRepositories(basePackages = "com.br.kodamalabs.repository")
public class WebConfiguration {

}
