package com.taskList.TaskList.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.taskList.TaskList.entity.Task;

@Repository
@Transactional
public class TaskDao {

	@PersistenceContext
	EntityManager eManager;

	public Task update(Task t) {

		return eManager.merge(t);
		// notice the merge returns a TYPE of object
	}
	
	public List<Task> findAll() {

		TypedQuery<Task> namedQuery = eManager.createNamedQuery("find_all_tasks", Task.class);
		// first param is a query name that im going to use in the POJO eventually
		// second param is the PJOJ reference that the query is going to live in

		return namedQuery.getResultList();
	}
	
	public Task findById(int id1) {

		return eManager.find(Task.class, id1);
		// this find methods only works when searching for a primary key
		// first param is the POJO, second is the thing you're trying to match against
	}
	
	

}
