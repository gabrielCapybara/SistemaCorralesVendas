/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.GhsUsuarios;
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
public class GhsUsuarios_DAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(GhsUsuarios.class);
        criteria.add(Restrictions.eq("idgbsUsuarios", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
       session.beginTransaction();
        Criteria criteria = session.createCriteria(GhsUsuarios.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
}

    public GhsUsuarios login(String usuarios, String senha){
    session.beginTransaction();
    Criteria criteria = session.createCriteria(GhsUsuarios.class);
    criteria.add(Restrictions.eq("gbsApelido", usuarios));
    GhsUsuarios usuarioAprovado = (GhsUsuarios) criteria.uniqueResult();
    session.getTransaction().commit();
        return usuarioAprovado;
    }
    
    public List listNome(String nome){
        
    session.beginTransaction();
    Criteria crit = session.createCriteria(GhsUsuarios.class);
    crit.add(Restrictions.ilike("gbsNome", nome, MatchMode.ANYWHERE));
    List results = crit.list();
    session.getTransaction().commit();
    return results;
    
    }
    
    public List listCpf(String cpf){
        
    session.beginTransaction();
    Criteria crit = session.createCriteria(GhsUsuarios.class);
    crit.add(Restrictions.ilike("gbsCpf", cpf, MatchMode.ANYWHERE));
    List results = crit.list();
    session.getTransaction().commit();
    return results;
    
    }
    
    public List listNomeECpf(String nome, String cpf){
        
    session.beginTransaction();
    Criteria crit = session.createCriteria(GhsUsuarios.class);
    crit.add(Restrictions.ilike("gbsNome", nome, MatchMode.ANYWHERE));
    crit.add(Restrictions.ilike("gbsCpf", cpf, MatchMode.ANYWHERE));
    List results = crit.list();
    session.getTransaction().commit();
    return results;
    
    }
}