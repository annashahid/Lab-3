public class MultipleObjects{
     public static void main(String args[]){
    Student s1=new Student();
    Student s2=new Student();

  s1.id=101;
  s1.name="Ali";
  s1.completedCredits=5;

  s2.id= 102;
  s2.name="Asif";
  s2.completedCredits=9;
  
  System.out.println();
  s1.printSummary();
  s2.printSummary();

  s1.name="Arif";
  s1.completedCredits=10;
  
  System.out.println();
  s1.printSummary();
  s2.printSummary();

  s1.addCredits(5);

System.out.println();
  s1.printSummary();
  s2.printSummary();
 }
}