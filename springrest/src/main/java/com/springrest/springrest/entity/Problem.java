package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Problem {
@Id


	    private long id;
		private String verifiacationstatus;
		private String category;
		private String bodysite;
		private String clinicalstatus;
		private String note;
@ManyToOne
		public Problem_Evidence problem_evidence;
		public Problem(long id, String verifiacationstatus, String category, String bodysite, String clinicalstatus,
				String note, Problem_Evidence problem_evidence) {
			super();
			this.id = id;
			this.verifiacationstatus = verifiacationstatus;
			this.category = category;
			this.bodysite = bodysite;
			this.clinicalstatus = clinicalstatus;
			this.note = note;
			this.problem_evidence= problem_evidence;
		}
		
		
//		public Problem(Identifier identifier, long problemmid, String verifiacationstatus, String category, String bodysite,
//				String clinicalstatus, String note) {
//			super();
//			this.identifier = identifier;
//			this.problemmid = problemmid;
//			this.verifiacationstatus = verifiacationstatus;
//			this.category = category;
//			this.bodysite = bodysite;
//			this.clinicalstatus = clinicalstatus;
//			this.note = note;
//		}
		public Problem() {
			super();
			// TODO Auto-generated constructor stub
		}
		
//		public long getIdentifier() {
//			
//			return identifier.getId();
//		}
//		public void setIdentifier(long Id) {
//			this.identifier.setId(Id);
//		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		public String getVerifiacationstatus() {
			return verifiacationstatus;
		}
		public void setVerifiacationstatus(String verifiacationstatus) {
			this.verifiacationstatus = verifiacationstatus;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getBodysite() {
			return bodysite;
		}
		public void setBodysite(String bodysite) {
			this.bodysite = bodysite;
		}
		public String getClinicalstatus() {
			return clinicalstatus;
		}
		public void setClinicalstatus(String clinicalstatus) {
			this.clinicalstatus = clinicalstatus;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		
//		@Override
//		public String toString() {
//			return "Problem [identifier=" + identifier + ", problemmid=" + problemmid + ", verifiacationstatus=" + verifiacationstatus
//					+ ", category=" + category + ", bodysite=" + bodysite + ", clinicalstatus=" + clinicalstatus + ", note="
//					+ note + "]";
//		}
	
		public Problem_Evidence getProblem_evidence() {
			return problem_evidence;
		}

       
		public void setProblem_evidence(Problem_Evidence problem_evidence) {
			this.problem_evidence = problem_evidence;
		}


//		@Override
//		public String toString() {
//			return "Problem [problem_evidence=" + problem_evidence + ", problemmid=" + problemmid + ", verifiacationstatus="
//					+ verifiacationstatus + ", category=" + category + ", bodysite=" + bodysite + ", clinicalstatus="
//					+ clinicalstatus + ", note=" + note + "]";
//		}
		
//		@Override
//		public String toString() {
//			return "Problem [problemmid=" + problemmid + ", verifiacationstatus=" + verifiacationstatus + ", category="
//					+ category + ", bodysite=" + bodysite + ", clinicalstatus=" + clinicalstatus + ", note=" + note + "]";
//		}
		
		
		
		
	}


		

		
		

	

