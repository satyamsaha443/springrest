package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Problem_Stage {
    @Id
    public long id;
	private long summary;
	private String assessment;
	private String type;
	public Problem_Stage(long id, long summary, String assessment, String type) {
		super();
		this.id = id;
		this.summary = summary;
		this.assessment = assessment;
		this.type = type;
	}
	public Problem_Stage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getSummary() {
		return summary;
	}
	public void setSummary(long summary) {
		this.summary = summary;
	}
	public String getAssessment() {
		return assessment;
	}
	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
//	@Override
//	public String toString() {
//		return "Problem_Stage [summary=" + summary + ", assessment=" + assessment + ", type=" + type + "]";
//	}
//	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
	