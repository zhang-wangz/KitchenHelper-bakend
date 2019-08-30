package com.kitchen.demo.control;

import model.BeanOperator;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.BaseException;

import java.util.List;

import static util.HibernateUtil.getSession;

// login resetpwd sigup
public class OperatorController {

    public BeanOperator login(String username, String pwd) throws BaseException {

        Session session = getSession();
        String hql = "from BeanOperator b where b.opName = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name",username);
        if(query.list().size()==0){
            throw new BaseException("�û�������");
        }
        BeanOperator beanOperator = (BeanOperator) query.list().get(0);
        if(beanOperator.getOpPwd().equals(pwd)){
           return beanOperator;
        }else{
            throw new BaseException("�˺����벻ƥ��");
        }
    }

    public BeanOperator register(String username, String pwd1, String pwd2) throws BaseException {

        if(username.length() < 5){
            throw  new BaseException("�û�������С��5");
        }

        if(!pwd1.equals(pwd2)){
            System.out.println(pwd1+" "+pwd2);
            throw new BaseException("�����������벻һ��");
        }

        if(pwd1.length() < 6){
            throw new BaseException("���볤��С��6");
        }

        Session session = getSession();
        Transaction tx = session.beginTransaction();
        String hql = "from BeanOperator b where b.opName = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name",username);
        BeanOperator beanOperator = (BeanOperator) query.uniqueResult();
        BeanOperator beanOperator1 = null;
        if(beanOperator == null){
            beanOperator1 = new BeanOperator();
            beanOperator1.setOpLevel(1);
            beanOperator1.setOpName(username);
            beanOperator1.setOpPwd(pwd1);
            session.save(beanOperator1);
        }else{
            throw new BaseException("���û����ѱ�ʹ��");
        }
        tx.commit();
        session.close();
        return beanOperator1;
    }

    public List<BeanOperator> loadAll() {
        List<BeanOperator> list = null;
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from BeanOperator ");
        list = query.list();
        tx.commit();
        session.close();
        return list;
    }

    public void delOperator(String id) throws BaseException {
        if(BeanOperator.currentOperator.getOpId().equals(id)){
            throw new BaseException("��ǰ����Ա��в���ɾ��");
        }
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("delete BeanOperator b where b.opId = :id");
        query.setParameter("id",id);
        query.executeUpdate();

        query = session.createQuery("delete BeanRecipeColl u where u.collUserId = :id");
        query.setParameter("id",id);
        query.executeUpdate();

        query = session.createQuery("delete BeanRecipeBrow u where u.browUserId = :id");
        query.setParameter("id",id);
        query.executeUpdate();

        query = session.createQuery("delete BeanRecipeComment u where u.userId = :id");
        query.setParameter("id",id);
        query.executeUpdate();

        tx.commit();
        session.close();
    }

    public BeanOperator findOperatorById(String id) {
        BeanOperator operator = null;
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from BeanOperator b where b.opId = :id");
        query.setParameter("id", id );
        operator = (BeanOperator) query.list().get(0);
        tx.commit();
        session.close();
        return operator;
    }

    public void addOperator(BeanOperator operator) throws BaseException {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from BeanOperator b where b.opName = :name");
        query.setParameter("name", operator.getOpName());
        if(query.list().size()!=0)
            throw new BaseException("�û����ѱ�ռ��");
        else
            session.save(operator);
        tx.commit();
        session.close();
    }

    public static void main(String[] args) {
        try{
            BeanOperator b = new BeanOperator();
            b.setOpLevel(1);
            b.setOpPwd("12345678");
            b.setOpName("amdin");
            new OperatorController().addOperator(b);
        }catch (BaseException e){
            System.out.println(e.getMessage());
        }
    }

    public void levOperator(BeanOperator operator,int i) throws BaseException {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        int j = operator.getOpLevel()+i;
        operator.setOpLevel(j);
        if(j==0)
            throw new BaseException("���Ϊ1");
        else
            session.update(operator);

        tx.commit();
        session.close();
    }

    public BeanOperator findOperatorByName(String userName) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from BeanOperator b where b.opName = :name");
        query.setParameter("name", userName);
        BeanOperator operator = (BeanOperator) query.list().get(0);
        tx.commit();
        session.close();
        return operator;
    }

    public List<BeanOperator> search(String text) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from BeanOperator b where b.opName like :text");
        query.setParameter("text","%"+text+"%");
        List<BeanOperator> list = query.list();
        transaction.commit();
        session.close();
        return list;
    }


}
