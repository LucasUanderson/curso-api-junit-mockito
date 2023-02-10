package br.com.superest.api.services.impl;

import br.com.superest.api.domain.Usuario;
import br.com.superest.api.domain.dto.UsuarioDto;
import br.com.superest.api.repositories.UserRepository;
import br.com.superest.api.services.UserServices;
import br.com.superest.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Usuario> findAll(){
        return repository.findAll();
    }

    @Override
    public Usuario create(UsuarioDto obj) {
        return repository.save(mapper.map(obj,Usuario.class));
    }
}

