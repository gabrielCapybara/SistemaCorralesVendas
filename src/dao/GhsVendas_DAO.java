/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.GhsVendas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class GhsVendas_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(GhsVendas.class);
        criteria.add(Restrictions.eq("idghsVendas", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(GhsVendas.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
}

public List listFormaPagamento(String formaPagamento) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GhsVendas.class);
        criteria.add(Restrictions.like("ghsFormaPagamento", "%" + formaPagamento + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;

    }
    
    public List listData(Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GhsVendas.class);
        criteria.add(Restrictions.eq("ghsDataVenda", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listFormaPagamentoEData(String formaPagamento, Date data) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GhsVendas.class);
        criteria.add(Restrictions.like("ghsFormaPagamento", "%" + formaPagamento + "%"));
        criteria.add(Restrictions.eq("ghsDataVenda", data));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
}