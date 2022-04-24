package com.tns.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//public class Student {
	
	@Entity
	@Table(name="students")
	public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int studentId;
	private String name;
	
	public int getStudentId1() {
	return studentId;
	}

	public void setStudentId1(int studentId) {
		this.studentId = studentId;
		}
	
		public String getName1() {
		return name;
		}
		
		public void setName1(String name) {
		this.name = name;
		}
		
	

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStudentId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setStudentId(int i) {
		// TODO Auto-generated method stub
		
	}

	




	
}

