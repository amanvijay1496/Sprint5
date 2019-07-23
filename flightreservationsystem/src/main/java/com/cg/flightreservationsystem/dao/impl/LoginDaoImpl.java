package com.cg.flightreservationsystem.dao.impl;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.flightreservationsystem.dao.LoginDao;
import com.cg.flightreservationsystem.entity.LoginEntity;
import com.cg.flightreservationsystem.entity.UserEntity;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.utility.ExceptionMessagesUtils;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {
	@PersistenceContext
	private EntityManager entityManager;

	public boolean findUser(UserEntity user) throws FRSException {
		System.out.println(user + "before operation");
		TypedQuery<UserEntity> typedQuery = entityManager.createQuery(
				"SELECT u FROM UserEntity u WHERE u.password=:password and u.roleid=:roleid and u.username=:username",
				UserEntity.class);
		typedQuery.setParameter("password", user.getPassword());
		typedQuery.setParameter("roleid", user.getRoleid());
		typedQuery.setParameter("username", user.getUsername());
		try {
			typedQuery.getSingleResult();
		} catch (NoResultException e) {
			throw new FRSException(ExceptionMessagesUtils.MESSAGE3);
		}
		return true;

	}

	public boolean addLoginInstance(LoginEntity loginEntity) {
		entityManager.persist(loginEntity);
		return true;

	}

	@Override
	public List<Object[]> viewLoginDetail(LocalDate date) {
			int day = date.getDayOfMonth();
			int month = date.getMonthValue();
		System.out.println("inside dao"+date.getDayOfMonth());
		System.out.println("inside dao"+date.getMonthValue());
		 TypedQuery<Object[]> query = entityManager.createQuery(
			      "SELECT c.username, count(c.username) FROM LoginEntity c  where EXTRACT(DAY FROM c.inTime)=:day AND EXTRACT(MONTH FROM c.inTime)=:month group by c.username", Object[].class);
		 query.setParameter("day", day);
		 query.setParameter("month", month);
		 
		 
		 List<Object[]> results = query.getResultList();
		 System.out.println(results.size());
			  for (Object[] result : results) {
			      System.out.println("Username: " + result[0] + ", Login Count: " + result[1]);
			  }
			return results;
		
	}
}
