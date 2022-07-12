package com.springrest.springrest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parent")
public class Parent {
	@Id
	public long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "problem_id", referencedColumnName = "id")
	public Problem problem;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "problem_evidence_id", referencedColumnName = "id")
	public Problem_Evidence problem_evidence;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "problem_stage_id", referencedColumnName = "id")
	public Problem_Stage problem_stage;
	public Parent( long id, Problem problem, Problem_Evidence problem_evidence, Problem_Stage problem_stage) {
		super();
		this.id = id;
		this.problem = problem;
		this.problem_evidence = problem_evidence;
		this.problem_stage = problem_stage;
	}
	
	public Parent() {
		
	}
	public Problem getProblem() {
		return problem;
	}
	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	public Problem_Evidence getProblem_evidence() {
		return problem_evidence;
	}
	public void setProblem_evidence(Problem_Evidence problem_evidence) {
		this.problem_evidence = problem_evidence;
	}
	public Problem_Stage getProblem_stage() {
		return problem_stage;
	}
	public void setProblem_stage(Problem_Stage problem_stage) {
		this.problem_stage = problem_stage;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
