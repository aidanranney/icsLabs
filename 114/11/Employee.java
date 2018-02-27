/* Define a class for representing employees
 * of a company.
 */

public class Employee {

    /* attributes */

    private String firstName;
    private String lastName;
    private String jobTitle;
    private String department;
    private int officeNumber;

    /* constructors */

    public Employee(String first, String last, int office) {
        this.firstName = first;
        this.lastName = last;
        this.officeNumber = office;
    }
    public Employee(String firstName, String lastName, String jobTitle, String department, int officeNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.officeNumber = officeNumber;
    }

    /* methods */
    
    public int floorNumber(int officeNumber){
    	int number = officeNumber/100;
    	return number;
    }
    
    public String toString(){
		return this.firstName + " " + this.lastName + " is a " + this.jobTitle + " in the " + this.department + " department " + "whose office number is " + this.officeNumber + ".";
	}
}
// end of Employee class definition