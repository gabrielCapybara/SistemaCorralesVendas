/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.GhsProdutos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class GhsProdutos_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(GhsProdutos.class);
        criteria.add(Restrictions.eq("idghsProdutos", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(GhsProdutos.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
        
}

public List listNome(String nome){
        
    session.beginTransaction();
    Criteria crit = session.createCriteria(GhsProdutos.class);
    crit.add(Restrictions.like("ghsNome", nome, MatchMode.ANYWHERE));
    List results = crit.list();
    session.getTransaction().commit();
    return results;
    
    }
    
    public List listQuantidade(int quantidade){
        
    session.beginTransaction();
    Criteria crit = session.createCriteria(GhsProdutos.class);
    crit.add(Restrictions.ge("ghsQuantidade", quantidade));
    List results = crit.list();
    session.getTransaction().commit();
    return results;
    
    }
    
    public List listNomeEQuantidade(String nome, int quantidade){
        
    session.beginTransaction();
    Criteria crit = session.createCriteria(GhsProdutos.class);
    crit.add(Restrictions.like("ghsNome", nome, MatchMode.ANYWHERE));
    crit.add(Restrictions.ge("ghsQuantidade", quantidade));
    List results = crit.list();
    session.getTransaction().commit();
    return results;
    
    }
    
    

}