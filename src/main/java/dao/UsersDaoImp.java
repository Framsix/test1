package dao;

import model.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UsersDaoImp implements UsersDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Users user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void delete(Users user) {

    }

    @Override
    public List<Users> read() {
        return null;
    }

    @Override
    public void update(Users user) {

    }
}
