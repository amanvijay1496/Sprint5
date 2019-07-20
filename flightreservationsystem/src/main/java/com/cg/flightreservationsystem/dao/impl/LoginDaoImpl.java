package com.cg.flightreservationsystem.dao.impl;

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
		System.out.println(user+"before operation");
		TypedQuery<UserEntity> typedQuery = entityManager.createQuery(
				"SELECT u FROM UserEntity u WHERE u.password=:password and u.roleid=:roleid and u.username=:username", UserEntity.class);
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
}
