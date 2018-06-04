package com.taskList.TaskList.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="task")
@NamedQuery(name = "find_all_tasks", query = "select t from Task t")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	@Column(name="idemail")
	private String idemail;
	private String description;
	@Column(name="duedate")
	private String duedate;
	private boolean complete;
	
	public Task() {
		
	}

	public Task(int id, String idemail, String description, String duedate, boolean complete) {
		super();
		this.id = id;
		this.idemail = idemail;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
	}
	
	public Task(String idemail, String description, String duedate, boolean complete) {
		super();
		this.idemail = idemail;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
	}
	
	public Task(String description, String duedate, boolean complete) {
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdemail() {
		return idemail;
	}

	public void setIdemail(String idemail) {
		this.idemail = idemail;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "Task: " + id + ", idEmail:" + idemail + ", description: " + description + ", dueDate: "
				+ duedate + ", complete: " + complete + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
