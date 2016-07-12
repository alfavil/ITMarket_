package Dao;

import entities.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by kiumars-pc on 7/2/2016.
 */

@Stateless
public class UserDao {
    @PersistenceContext(unitName = "COLIBRI")
    private EntityManager em;


    public void save(User user){
        em.persist(user);
    }

    public List<User> findAll(){
        return em.createQuery("select u from User u")
                .getResultList();
    }
}
