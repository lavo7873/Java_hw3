/**
 * @author Lam Vinh Vong
 *
 */
package com.example;
public class StudentTest {

	
	public static void main(String[] args) {
		
        Course course = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");

		
		Student student = new Student(" John", "Smith", 20 , 3.6, "Computer Science",
									"School of Computer Science", course);
		Student cloneStudent = null;
		
		 try {
	            cloneStudent = (Student) student.clone();
	   
		 
		// Check
	     
	        student.printInfo();
	        System.out.println("");
	        cloneStudent.printInfo();
	        
	        System.out.println("\nChecking if deep copy\n");

	        cloneStudent.setFirstName("Anna");
	        cloneStudent.setLastName("Mia");
	        student.setCourse(course);
	        
	        cloneStudent.printInfo();
	        
		 }

	        catch (CloneNotSupportedException e) {
	        	e.printStackTrace();
	        }
	}
}

		
	

