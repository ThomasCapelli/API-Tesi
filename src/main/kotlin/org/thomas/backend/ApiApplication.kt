package org.thomas.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
@EntityScan("org.thomas.database.models")
@ComponentScan("org.thomas.backend", "org.thomas.database")
@ConfigurationPropertiesScan("org.thomas.backend.config")
@EnableJpaRepositories(basePackages = ["org.thomas.database.repositories"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}