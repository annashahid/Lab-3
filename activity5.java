public class Student {
    int id;
    String name;
    int completedCredits;

    void rename(String name) {
        this.name = name;
    }

    void addCredits(int amount) {
        this.completedCredits += amount;
    }

    void printSummary() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Completed Credits: " + completedCredits);
        System.out.println();
    }
}
public class ThisKeyword {

    public static void main(String args[]) {

        
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Ali";
        s1.completedCredits = 20;

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Sara";
        s2.completedCredits = 25;

        s1.rename("Ahmed");
        s1.addCredits(5);

      
        System.out.println("Student 1:");
        s1.printSummary();

        System.out.println("Student 2:");
        s2.printSummary();
    }
}