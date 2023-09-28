package lecture_activity_3_2;

import java.time.LocalDate;

public class Student
{
	// attributes
	private String name;
	private int age;
	private boolean majorIT;
	private char gender;
	private static int numberOfStudents = 0;
	
	// constructors
	public Student()
	{
		name = "unknown";
		age = 0;
		majorIT = false;
		gender = '\u0000';
		numberOfStudents++;
	}
	
	public Student(String name, int birthYear, String major, char gender)
	{
		this.name = name;
		this.computeAge(birthYear);
		this.setMajorIT(major);
		this.gender = gender;
		numberOfStudents++;
	}
	
	// behaviors
	private void computeAge(int birthYear)
	{
		int currentYear = LocalDate.now().getYear();
		this.age = currentYear - birthYear;
	}
	
	// getters & setters
	public void setMajorIT( String major)
	{
		if( major.equalsIgnoreCase("IT") || major.equalsIgnoreCase("Information Technology"))
			this.majorIT = true;
		else
			this.majorIT = false;
	}

	@Override
	public String toString()
	{
		return "Student [name=" + name + ", age=" + age + ", majorIT=" + majorIT + ", gender=" + gender + "]";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setAgeUsingBirthYear(int birthYear)
	{
		this.computeAge(birthYear);
	}

	public boolean isMajorIT()
	{
		return majorIT;
	}

	public void setMajorIT(boolean majorIT)
	{
		this.majorIT = majorIT;
	}

	public char getGender()
	{
		return gender;
	}

	public void setGender(char gender)
	{
		this.gender = gender;
	}

	public static int getNumberOfStudents()
	{
		return numberOfStudents;
	}

	
}
