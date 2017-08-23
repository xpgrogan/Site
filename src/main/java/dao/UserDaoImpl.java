package dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.DistinctRootEntityResultTransformer;

import beans.User;
import config.HibernateUtil;

public class UserDaoImpl implements UserDao{

    HibernateUtil hu = new HibernateUtil();

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        Session sess = hu.getSession();
        User user = (User) sess.get(User.class, userId);
        sess.close();
        return user;
    }

    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        Session sess = hu.getSession();
        Criteria cr = sess.createCriteria(User.class);
        //cr.setResultTransformer(DistinctRootEntityResultTransformer.INSTANCE);
        List<User> userList = cr.list();
        System.out.println("in user dao: \n" + userList);
        sess.close();
        return userList;
    }

    public void addNewUser(User user) {
        // TODO Auto-generated method stub
        Session sess = hu.getSession();
        Transaction tx;
        try
        {
            tx = sess.beginTransaction();
            sess.saveOrUpdate(user);
            tx.commit();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
        finally
        {
            sess.close();
        }
    }

    public boolean updateUser(User user) {
        Session sess = hu.getSession();
        Transaction tx;

        try {
            tx = sess.beginTransaction();

            sess.merge(user);

            tx.commit();
            return true;

        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {

            sess.close();
        }
    }
}
