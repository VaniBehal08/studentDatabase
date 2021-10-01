package studentdatabaseapp;

import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID ;
	private String courses= null;
	private int tuitionBalance;
	private static int costOfCourse =600;
	private static int id = 1000;
	
	//constructor : prompt user to enter name and year
	public student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name :");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name :");
		this.lastName = in.nextLine();
		
		System.out.println("1 - frehsmen\n2 - sophmore\n3-junior\n4-senior\nEnter student class level :");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
		
	}
		
		//generate an ID
		private void setStudentID() {
			//grade level + ID
			id++;
			this.studentID= gradeYear + "" +id;
			
			
			
		}
		
		//enroll in courses
		public void enroll() {
			//get inside a loop, user hits 0
			do {
			System.out.print("Enter course to enroll (Q to quit):");
			Scanner in = new Scanner (System.in);
			String course = in.nextLine();
			if (course.equals("Q")) {
				courses = courses + "\n " +course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				System.out.println("BREAK1!");
				break;
				
			}
		}while (1!=0);
			
		
			
			
		    
		}
		
		
		
		//view balance
		public void viewBalance() {
			System.out.println("your balance is : $" + tuitionBalance);
			
		}
		
		//pay tuition
		public void payTuition( ) {
			viewBalance();
			System.out.print("enter your payment :");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
			tuitionBalance = tuitionBalance- payment;
			System.out.println("thank you for your payment of $" +payment);
			viewBalance();
		}
		
		//show status
		public String showinfo() {
			return "Name :" + firstName + " " + lastName +
					"\ngrade level :" + gradeYear +
					"\nStudent ID :" + studentID +
					"\nCourses Enrolled :" +  courses +
					"\nBalance : $" + tuitionBalance;
					
					
	 
					
		}
		
       
	   }
		
		
	
	
	