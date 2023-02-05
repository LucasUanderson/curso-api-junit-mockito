package br.com.superest.api.resources;

import br.com.superest.api.domain.dto.UsuarioDto;
import br.com.superest.api.services.UserServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResources {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserServices service;

    @RequestMapping(value ="/{id}")
    public ResponseEntity<UsuarioDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(mapper.map(service.findById(id),UsuarioDto.class));
    }

}
