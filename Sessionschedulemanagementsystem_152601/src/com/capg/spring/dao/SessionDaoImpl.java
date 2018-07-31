package com.capg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capg.spring.dto.ScheduledSessions;
@Repository("sessiondao") 
public class SessionDaoImpl implements SessionDao {

	@Autowired 			
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<ScheduledSessions> showAllSessions() {
		
		List<ScheduledSessions> list = new ArrayList<>();
		Query query=entityManager.createQuery("FROM ScheduledSessions");
		list= query.getResultList();
		return list;
	}

}
