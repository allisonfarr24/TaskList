package com.taskList.TaskList.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository 
@Transactional
public class UserDao {
	
	@PersistenceContext
	EntityManager eManager;

}
