/** class Student
 * with 4 instance variables,
 * 3 constructors, a print method,
 * and a main method to test them.
 */
 public class Student
 {
     // Write 4 instance variables
  
    private String name;
    private String email;
    private String phoneNumber;
    private String school;
  

     // Write 3 constructors to initialize the instance variables
public Student(String theFirst, String theLast) {
       name = "James";
       email = "james@patelhs.org";
       phoneNumber = "813-256-3317";
       school = "Dr. Kiran C Patel";
     }
     //  1. no parameters using default values
public Student()
{
   name = "James";
   email = "james@patelhs.org";
   phoneNumber = "813-256-3317";
   school = "Dr. Kiran C Patel";
}
     //  2. 1 parameter and the rest default values
public Student(String name, String email, String phoneNumber, String initschool)
{
   name = "James";
   email = "james@patelhs.org";
   phoneNumber = "813-256-3317";
   school = initschool;
}
     //  3. 4 parameters
     public Student(String initname, String initemail, String initphoneNumber, initString initschool)
     {
       name = initname;
       email = initemail;
       phoneNumber = initphoneNumber;
       school = initschool;
     }

     // Write a print method that prints all the instance variables
     public void print()
     {
      System.out.println("my name is " + name);
      System.out.println("my email is " + email);
      System.out.println("My phone number is" + phoneNumber);
      System.out.println("i go to school at " + school);
     }

    // main method
    public static void main(String[] args)
    {
       // Construct 3 Student objects using the 3 different constructors
 name n1 = new name();
 name n2 = new name("James");
 email e1 = new email();
 email e2 = new email("james@patelhs.org");
 phoneNumber pn1 = new phoneNumber();
 phoneNumber pn2 = new phoneNumber("813-256-3317");
school s1 = new school();
school s2 = new school("Dr. Kiran C Patel");
       // call their print() methods

    }
 }
 