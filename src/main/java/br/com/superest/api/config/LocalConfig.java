package br.com.superest.api.config;

import br.com.superest.api.domain.User;
import br.com.superest.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

/*
  CONFIGURAÇÃO DO PERFIL DE TESTE
 */
@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){

        User u1 = new User(null, "lucas", "lucas@gmail.com", "123");
        User u2 = new User(null, "bia", "bia@gmail.com", "123");

        repository.saveAll(List.of(u1 , u2));

    }
}
