// Student class
// Student version
// You must complete the compareTo method properly

/**
 * Students have a name, age, grade (Freshman, Sophomore, Junior or Senior), and a parkingSticker flag.
 */
class Student implements Comparable
{
	private String name;
	private int age;
	private Rank grade;
	private boolean parkingSticker;
	
	/*
	 * Creates a student with a specified name, age and grade
	 * parkingSticker is set to false initially
	 * @param n name
	 * @param a age
	 * @param g grade
	 */
	public Student(String n, int a, Rank g)
	{
		name  = n;
		age   = a;
		grade = g;
		parkingSticker = false;
	}
	
	// accessors and modifiers
	public String  getName()           { return name;           }
	public int     getAge()            { return age;            }
	public Rank    getGrade()          { return grade;          }
	public boolean getParkingSticker() { return parkingSticker; }
	public void  issueParkingSticker() { parkingSticker = true; }

	/**
	 * Compares 2 students based on their grade.  If they are in the same grade,
	 * they are compared based on age.  Since this compareTo is being used in 
	 * a priority queue, Seniors should return lower values, and older students
	 * should return lower values.  Enumerated types (such as grade) can be compared
	 * with .equals and .compareTo.
	 */
    public int compareTo (Object source)
    {

      Student other = (Student) source;
      
      if(grade.equals(other.grade)) return other.age - age;
      else return grade.compareTo(other.grade);
      
    }	
    
	/**
	 * returns a detailed String version of the student
	 * @return the String version of the student
	 */
    public String toString()
    {
    	return "{ " + name + ",  " + age + ",  " + grade + ",  " + parkingSticker + " } \n";
    }
}
