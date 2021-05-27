
package studentlistlive;

/**
 * This class models Students. Students have a name and
 * a studentID.
 * @author Liz Dancy, 2021
 */
public class Student 
{
    private String name;
    private String studentID;

    public Student(String givenName, String givenstudentID) 
    {
        name = givenName;
        studentID = givenstudentID;
    }
    
    public Student(String givenName)
    {
        name = givenName;
    }
    
    public Student()
    {
        //intentionally left blank
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
