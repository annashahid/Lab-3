public class student1{
      int id;
      String name;
      int completedCredits;
     public void printSummary(){
      System.out.println(id+ " "+name+" "+completedCredits);
}
     public void addCredits(int amount){
      completedCredits=completedCredits + amount;
}
} 