package br.com.superest.api.services;

import br.com.superest.api.domain.User;
import br.com.superest.api.domain.dto.UserDto;

import java.util.List;

public interface UserServices {

    User findById(Integer id);
    List<User> findAll();
    User create (UserDto obj);
    User update(UserDto obj);
    void delete(Integer id);


}
