/**
 * 
 */
package OOPS1;

/**
 * @author virat
 *
 */
public class Student {

	// Class is an template.
	// right now it's only have property
	String name;
	private int rollNumber;
	public void set_id(int id)
    {
        if(id>0)
        rollNumber=id;
        else 
        System.out.println("Invalid id");
    }
    public int get_id()
    {
        return rollNumber;
    }
    public void set_name(String n)
    {
        name=n;
    }
	
}
