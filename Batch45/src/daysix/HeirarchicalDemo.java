package daysix;

public class HeirarchicalDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("......person details.....");
		System.out.println(p1);
		
		Person p;
		p=new Person ("Dhruv", "Mumbai");
		if (p instanceof Person)
			System.out.println("person Deatils "+p);
		
		p= new Employee ("Nikhil", "Mumabi", 101, 67000, "Sales");
		 if (p instanceof Employee)
			 System.out.println("Employee Details"+ p);
		 
		 p= new Student ("Pankaj", "pune", "FE", 88);
		 if (p instanceof Student)
			 System.out.println("Student Details "+p);
		 

	}

}
