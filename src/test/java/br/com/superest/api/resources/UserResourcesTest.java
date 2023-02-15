package br.com.superest.api.resources;

import br.com.superest.api.domain.User;
import br.com.superest.api.domain.dto.UserDto;
import br.com.superest.api.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserResourcesTest {

    public static final Integer ID = 1;
    public static final String NAME = "lucas";
    public static final String EMAIL = "lucas@gmail.com";
    public static final String PASSWORD = "123";
    public static final int INDEX = 0;

    private User user;
    private UserDto userDto;


    @InjectMocks
    private UserResources resource;

    @Mock
    private UserServiceImpl service;

    @Mock
    private ModelMapper mapper;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private  void startUser(){
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDto = new UserDto(ID, NAME, EMAIL, PASSWORD);

    }
}