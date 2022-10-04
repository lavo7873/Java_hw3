/**
 * Exercise 1
 * @author Lam Vinh vong
 *
 */
package com.example;
public class Student implements Cloneable{
	private String firstName, lastName, major, department;
	private int age;
	private double gpa;
	private Course course; 
	
	public Student(String firstName, String lastName, int age, double gpa, String major, String department, Course course) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.gpa = gpa;
	        this.major = major;
	        this.department = department;
	        this.course = course;
	    }
	 public void printInfo() {
		 System.out.println("Student: " + firstName+ " " + lastName + "\nAge: "+ 
	 age + " years old" + "\nGPA: " + gpa + "\nMajor: " + major + "\nDepartment: "+ 
		 department + "\nCourse: " + course.getCourseName());
	 }
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	  public Course getCourse() {
	        return course;
	    }

	    public void setCourse(Course course) {
	        this.course = course;
	    }
	
	
	/**
	 * Overrides the object's clone() method. 
	 * Throws CloneNotSupportedException
	 */
	@Override
	  protected Object clone() throws CloneNotSupportedException{
        Student student = (Student) super.clone();
        return student;
    }

}
