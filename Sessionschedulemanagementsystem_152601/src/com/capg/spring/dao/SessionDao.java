package com.capg.spring.dao;

import java.util.List;

import com.capg.spring.dto.ScheduledSessions;

public interface SessionDao {
	public List<ScheduledSessions> showAllSessions();
}
