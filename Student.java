/** class Student
 * with 4 instance variables,
 * 3 constructors, a print method,
 * and a main method to test them.
 */
 public class Student
 {
     // Write 4 instance variables
  
    private String Name;
    private String Email;
    private String PhoneNumber;
    private String School;
  

     // Write 3 constructors to initialize the instance variables
public Student(String theFirst, String theLast) {
       Name = "James";
       Email = "james@patelhs.org";
       PhoneNumber = "813-256-3317";
       School = "Dr. Kiran C Patel";
     }
     //  1. no parameters using default values
public Student()
{
   Name = "James";
   Email = "james@patelhs.org";
   PhoneNumber = "813-256-3317";
   School = "Dr. Kiran C Patel";
}
     //  2. 1 parameter and the rest default values
public Student(String Name, String Email, String PhoneNumber, String initschool)
{
   Name = "James";
   Email = "james@patelhs.org";
   PhoneNumber = "813-256-3317";
   School = initSchool;
}
     //  3. 4 parameters
     public Student(String initName, String initEmail, String initPhoneNumber,initString initSchool)
     {
       Name = initName;
       Email = initEmail;
       PhoneNumber = initPhoneNumber;
       School = initSchool;
     }

     // Write a print method that prints all the instance variables
     public void print()
     {
      System.out.println("my name is " + Name);
      System.out.println("my email is " + Email);
      System.out.println("My phone number is" + PhoneNumber);
      System.out.println("i go to school at " + School);
     }

    // main method
    public static void main(String[] args)
    {
       // Construct 3 Student objects using the 3 different constructors
 Name n1 = new Name();
 Name n2 = new Name("James");
 Email e1 = new Email();
 Email e2 = new Email("james@patelhs.org");
 PhoneNumber pn1 = new PhoneNumber();
 PhoneNumber pn2 = new PhoneNumber("813-256-3317");
School s1 = new School();
School s2 = new School("Dr. Kiran C Patel");
       // call their print() methods

    }
 }