import java.util.Scanner;

public class TestStudent
{

	public static void main(String[] args)
	{
		// create Student instance using default values
		Student stu;
		
		String name = "";
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter Student's Name (DONE to quit): ");
			name = scan.nextLine();
			
			if(!name.equalsIgnoreCase("DONE"))
			{
				// create student object
				stu = new Student();
				
				// set the student object to the given name
				stu.setName(name);
				
				System.out.print("Enter Student's Birth Year: ");
				int birthYear = scan.nextInt();
				scan.nextLine();  //skips enter key
				stu.setAgeUsingBirthYear(birthYear);
				
				System.out.print("Enter Student's Gender (M/F): ");
				char gender = scan.nextLine().charAt(0);
				gender = Character.toUpperCase(gender);
				stu.setGender(gender);
				
				System.out.print("Enter Student's Major: ");
				String major = scan.nextLine();
				stu.setMajorIT(major);
				
				System.out.println();
				System.out.println(stu.toString());
				System.out.println();
				
			}
		}
		while(!name.equalsIgnoreCase("DONE"));
		
		// display number of students in class
		System.out.println();
		System.out.println("Number of Students: " + Student.getNumberOfStudents());
		scan.close();
	}	

}
