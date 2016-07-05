package com.ssh.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDAOImpl<T> implements BaseDAO<T> {
	
	    private SessionFactory sessionFactory;  
	  
	    //sessionFactory 的getter 和 setter 方法
	    public SessionFactory getSessionFactory() {  
	        return sessionFactory;  
	    }
	    public void setSessionFactory(SessionFactory sessionFactory) {  
	        this.sessionFactory = sessionFactory;  
	    }  
	  
	    private Session getCurrentSession() {
	    	// TODO 取得Session
	        return this.getSessionFactory().getCurrentSession();  
	    }  
	  
	    
	    public Serializable save(T o) {
	    	// TODO 取得Serializable ，同时保存数据
	        return this.getCurrentSession().save(o);  
	    }  
	  
	    public void delete(T o) {
	    	// TODO  删除数据
	        this.getCurrentSession().delete(o);  
	    }  
	  
	    public void update(T o) {
	    	// TODO 更新数据
	        this.getCurrentSession().update(o);  
	    }  
	  
	    public void saveOrUpdate(T o) {  
	    	// TODO 
	        this.getCurrentSession().saveOrUpdate(o);  
	    }  
	  
	    public List<T> find(String hql) {  
	    	// TODO 查询数据集合（根据 HQL）
	        return this.getCurrentSession().createQuery(hql).list();  
	    }  
	  
	    public List<T> find(String hql, Object[] param) { 
	    	// TODO 查询数据集合（根据 HQL，及相关属性值）
	        Query q = this.getCurrentSession().createQuery(hql);  
	        if (param != null && param.length > 0) {  
	            for (int i = 0; i < param.length; i++) {  
	                q.setParameter(i, param[i]);  
	            }  
	        }  
	        return q.list();  
	    }  
	  
	    public List<T> find(String hql, List<Object> param) {  
	        Query q = this.getCurrentSession().createQuery(hql);  
	        if (param != null && param.size() > 0) {  
	            for (int i = 0; i < param.size(); i++) {  
	                q.setParameter(i, param.get(i));  
	            }  
	        }  
	        return q.list();  
	    }  
	  
	    public List<T> find(String hql, Object[] param, Integer page, Integer rows) {  
	        if (page == null || page < 1) {  
	            page = 1;  
	        }  
	        if (rows == null || rows < 1) {  
	            rows = 10;  
	        }  
	        Query q = this.getCurrentSession().createQuery(hql);  
	        if (param != null && param.length > 0) {  
	            for (int i = 0; i < param.length; i++) {  
	                q.setParameter(i, param[i]);  
	            }  
	        }  
	        return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();  
	    }  
	  
	    public List<T> find(String hql, List<Object> param, Integer page, Integer rows) {  
	        if (page == null || page < 1) {  
	            page = 1;  
	        }  
	        if (rows == null || rows < 1) {  
	            rows = 10;  
	        }  
	        Query q = this.getCurrentSession().createQuery(hql);  
	        if (param != null && param.size() > 0) {  
	            for (int i = 0; i < param.size(); i++) {  
	                q.setParameter(i, param.get(i));  
	            }  
	        }  
	        return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();  
	    }  
	  
	    public T get(Class<T> c, Serializable id) {  
	        return (T) this.getCurrentSession().get(c, id);  
	    }  
	  
	    public T get(String hql, Object[] param) {  
	        List<T> l = this.find(hql, param);  
	        if (l != null && l.size() > 0) {  
	            return l.get(0);  
	        } else {  
	            return null;  
	        }  
	    }  
	  
	    public T get(String hql, List<Object> param) {  
	        List<T> l = this.find(hql, param);  
	        if (l != null && l.size() > 0) {  
	            return l.get(0);  
	        } else {  
	            return null;  
	        }  
	    }  
	  
	    public Long count(String hql) { 
	    	// TODO 根据HQL语句，统计相关数据的个数
	        return (Long) this.getCurrentSession().createQuery(hql).uniqueResult();  
	    }  
	  
	    public Long count(String hql, Object[] param) {  
	        Query q = this.getCurrentSession().createQuery(hql);  
	        if (param != null && param.length > 0) {  
	            for (int i = 0; i < param.length; i++) {  
	                q.setParameter(i, param[i]);  
	            }  
	        }  
	        return (Long) q.uniqueResult();  
	    }  
	  
	    public Long count(String hql, List<Object> param) {  
	        Query q = this.getCurrentSession().createQuery(hql);  
	        if (param != null && param.size() > 0) {  
	            for (int i = 0; i < param.size(); i++) {  
	                q.setParameter(i, param.get(i));  
	            }  
	        }  
	        return (Long) q.uniqueResult();  
	    }  
	  
	    public Integer executeHql(String hql) {  
	        return this.getCurrentSession().createQuery(hql).executeUpdate();  
	    }  
	  
	    public Integer executeHql(String hql, Object[] param) {  
	        Query q = this.getCurrentSession().createQuery(hql);  
	        if (param != null && param.length > 0) {  
	            for (int i = 0; i < param.length; i++) {  
	                q.setParameter(i, param[i]);  
	            }  
	        }  
	        return q.executeUpdate();  
	    }  
	    
	    public Integer executeHql(String hql, List<Object> param) {  
	        Query q = this.getCurrentSession().createQuery(hql);  
	        if (param != null && param.size() > 0) {  
	            for (int i = 0; i < param.size(); i++) {  
	                q.setParameter(i, param.get(i));  
	            }  
	        }  
	        return q.executeUpdate();  
	    }
		@SuppressWarnings("unchecked")
		@Override
		public List<String> findIp(String hql) {
			  return this.getCurrentSession().createQuery(hql).list();  
		}
		@SuppressWarnings("unchecked")
		@Override
		public List<T> findTopRownum(String hql,int rownum) {
			// TODO Auto-generated method stub
			Query setFirstResult = this.getCurrentSession().createQuery(hql).setFirstResult(0);
			if(setFirstResult.list().isEmpty()){
				
				return new ArrayList<T>();
			}
			return setFirstResult.setMaxResults(rownum).list();
		}
	  
	}