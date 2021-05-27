
package studentlistlive;

/**
 * This class creates an array of Student Objects
 * and prints out their names 
 * @author Liz Dancy, 2021
 */
public class StudentListLive {

    /**
     * Creates an array of student Objects
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Student[] studentList = new Student[5];
       Student ola = new Student("Ola");
       studentList[0] = ola;
       //System.out.println(studentList[0].getStudentID());
       studentList[1] = new Student("Chi");
       //System.out.println(studentList[1]);
       studentList[2] = new Student("Nadia");
       studentList[3] = new Student("Markus");
       studentList[4]= new Student("Vitalii");
       
       for(Student s: studentList)
       {
           System.out.println(s.getName());
       }
    }

}
