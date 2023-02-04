package br.com.superest.api.resources;

import br.com.superest.api.domain.Usuario;
import br.com.superest.api.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResources {

    @Autowired
    private UserServices services;

    @RequestMapping(value ="/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(services.findById(id));
    }

}
