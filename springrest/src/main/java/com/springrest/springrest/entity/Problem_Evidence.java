package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Problem_Evidence {
@Id
        private long id;
		private long code;
		private String detail;
		public Problem_Evidence(long id, long code, String detail) {
			super();
			this.id = id;
			this.code = code;
			this.detail = detail;
		}
		public Problem_Evidence() {
			super();
			// TODO Auto-generated constructor stub
		}
		public long getCode() {
			return code;
		}
		public void setCode(long code) {
			this.code = code;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
//		@Override
//		public String toString() {
//			return "Problem_Evidence [code=" + code + ", detail=" + detail + "]";
//		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}

		
		

	}
