package br.com.felipe.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
            .title("REST API's RESTful from 0 java, spring boot, docker, kubernetes and Docker")
            .version("v1")
            .description("RESTful from 0 java, spring boot, docker, kubernetes and Docker")
                .termsOfService("http://swagger.io/terms/")
                .license(new License()
                    .name("Apache 2.0")
                    .url("http://springdoc.org")));
    }
}
