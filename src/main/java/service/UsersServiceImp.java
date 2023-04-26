package service;

import dao.UsersDao;
import model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UsersServiceImp implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Transactional
    @Override
    public void add(Users user) {
        usersDao.add(user);
    }

    @Transactional
    @Override
    public void delete(Users user) {
        usersDao.delete(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Users> read() {
        return usersDao.read();
    }

    @Transactional
    @Override
    public void update(Users user) {
        usersDao.update(user);
    }
}
