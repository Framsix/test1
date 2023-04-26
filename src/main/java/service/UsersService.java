package service;

import model.Users;

import java.util.List;

public interface UsersService {

    void add (Users user);
    void delete (Users user);
    List<Users> read();
    void update (Users user);

}
