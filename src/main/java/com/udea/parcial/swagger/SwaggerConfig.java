package com.udea.parcial.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(apiEndPointsInfo());
    }

    private Info apiEndPointsInfo(){
        return new Info()
                .title("Spring Boot REST API")
                .description("Sistema de Gestión de Vuelos")
                .contact(new Contact()
                        .name("Natalia García")
                        .email("natalia.garcia9@udea.edu.co"))
                .license(new License()
                        .name("Apache 2.0")
                        .url("http://www.apache.org/licenses/LICENSE-2.0.html"))
                .version("1.0.0");
    }
}
