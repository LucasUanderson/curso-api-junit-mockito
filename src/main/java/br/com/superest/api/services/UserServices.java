package br.com.superest.api.services;

import br.com.superest.api.domain.Usuario;
import br.com.superest.api.domain.dto.UsuarioDto;

import java.util.List;

public interface UserServices {

    Usuario findById(Integer id);
    List<Usuario> findAll();
    Usuario create (UsuarioDto obj);
    Usuario update(UsuarioDto obj);



}
