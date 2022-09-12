package org.thomas.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/thomas/backend/ApiApplication;", "", "()V", "mini-api"})
@org.springframework.data.jpa.repository.config.EnableJpaRepositories(basePackages = {"org.thomas.database.repositories"})
@org.springframework.boot.context.properties.ConfigurationPropertiesScan(value = {"org.thomas.backend.config"})
@org.springframework.context.annotation.ComponentScan(value = {"org.thomas.backend", "org.thomas.database"})
@org.springframework.boot.autoconfigure.domain.EntityScan(value = {"org.thomas.database.models"})
@org.springframework.boot.autoconfigure.SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class ApiApplication {
    
    public ApiApplication() {
        super();
    }
}