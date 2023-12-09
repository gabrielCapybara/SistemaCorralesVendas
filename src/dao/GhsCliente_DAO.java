/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.GhsCliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class GhsCliente_DAO extends DAO_Abstract{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
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
        criteria.add(Restrictions.eq("drfIdcompraProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GhsCliente.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNome(String nome) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(GhsCliente.class);
        crit.add(Restrictions.like("ghsNome", nome, MatchMode.ANYWHERE));
        List results = crit.list();
        session.getTransaction().commit();
        return results;
    }

    public List listIdade(int idade) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(GhsCliente.class);
        crit.add(Restrictions.ge("gbsIdade", idade));
        List results = crit.list();
        session.getTransaction().commit();
        return results;
    }

    public List listNomeEIdade(String nome, int idade) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(GhsCliente.class);
        crit.add(Restrictions.like("ghsNome", nome, MatchMode.ANYWHERE));
        crit.add(Restrictions.ge("gbsIdade", idade));
        List results = crit.list();
        session.getTransaction().commit();
        return results;
    }



}