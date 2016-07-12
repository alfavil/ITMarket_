package Dao;

import entities.Item;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


/**
 * Created by kiumars-pc on 7/12/2016.
 */
@Stateless
public class ItemDao {
    @PersistenceContext(unitName = "COLIBRI")
    private EntityManager em;

    public void Save(Item f){em.persist(f);}

    public List<Item> findAll(){
        return em.createQuery("select u from Item u")
                .getResultList();
    }
}
