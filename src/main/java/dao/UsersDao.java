package dao;

import model.Users;

import java.util.List;

public interface UsersDao {

    void add (Users user);
    void delete (Users user);
    List<Users> read();
    void update (Users user);

}
