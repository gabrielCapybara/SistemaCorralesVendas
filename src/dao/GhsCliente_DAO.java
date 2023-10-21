/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

;
import bean.GhsCliente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class GhsCliente_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Transaction transaction = session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
      session.flush();
      session.clear();
      session.update(object);
      session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
          session.flush();
      session.clear();
      session.delete(object);
      session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GhsCliente.class);
        criteria.add(Restrictions.eq("idghsCliente", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }

    @Override
    public List listAll() {
    Criteria criteria = session.createCriteria(GhsCliente.class);
    List lista = criteria.list();
    return lista;
    }

}
