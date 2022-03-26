package JavaProject;


import java.util.Random;
import java.util.Scanner;


public class Email 
{
	    private String firstName;
	    private String lastName;
	    private String password;
	    private String department;
	    private String email;
	    private int defaultPasswordLength=10;
	    private int mailBoxCapacity = 1000;
	    private String companySuffix = "edubrigde.com";

	    
	    public Email(String firstName, String lastName){
	        this.firstName = firstName;
	        this.lastName = lastName;

	        
	        this.department = setDepartment();
	        System.out.println("Department : " + this.department);

	        email = firstName.toLowerCase()+"."+lastName.toLowerCase()
	                 +"@"+ department + "." + companySuffix;

	        this.password = random_Password(defaultPasswordLength);
	        System.out.println("Your New Password is " + this.password);

	        System.out.println("Your Mail box capacity is " + mailBoxCapacity);


	    }

		private String setDepartment(){
	         
	     	System.out.print("New Employee : " + firstName +lastName+
	     			"\nDepartment Codes\n 1 for Android \n 2 for Backend"
	     			+ "\n 3 for  FrontEnd  \n 4 for Testing : ");
	         Scanner in = new Scanner(System.in);
	         int deptChoice = in.nextInt();
	         if (deptChoice == 1){ return "Android";}
	         else if (deptChoice == 2){ return "Backend"; }
	         else if (deptChoice == 3){ return "Frondend";}
	         else{ return "Testing";}
	     }
		 private String random_Password(int length){
		        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$&";
		        char [] password = new char[length];
		        for (int i = 0; i < length; i++){
		            int rand = (int) (Math.random() * passwordSet.length());
		            password[i] = passwordSet.charAt(rand);
		        }
		        return new String(password);
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String showInfo(){
	        return "Employee Name : " + firstName + " " + lastName + "\nCompany Email : " + email +  "\nMailbox Capacity : " + mailBoxCapacity + "mb";
	    }
}