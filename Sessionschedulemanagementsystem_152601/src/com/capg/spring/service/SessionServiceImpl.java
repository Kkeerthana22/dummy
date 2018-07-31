package com.capg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.spring.dao.SessionDao;
import com.capg.spring.dto.ScheduledSessions;
@Service("sessionservice")
@Transactional
public class SessionServiceImpl implements SessionService {
 @Autowired
 SessionDao sessionDao;
 
	@Override
	public List<ScheduledSessions> showAllSessions() {
		return sessionDao.showAllSessions();
		
	}

}
