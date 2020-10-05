package br.ganhara.springliquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"br.ganhara.springliquibase.repository"})
public class SpringLiquibaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLiquibaseApplication.class, args);
    }

}
