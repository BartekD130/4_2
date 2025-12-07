public class Student {

  private String Name;
  private int Age;
  private String Surname;
  private String Email;

  public Student(String name, int age, String surname, String email) {
    Name = name;
    Age = age;
    Surname = surname;
    Email = email;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSurname() {return Surname;}
  public String GetEmail() {return Email;}
  
  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age) + " " + Email;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", -1, "Parse Error", "Parse Error");
    return new Student(data[0], Integer.parseInt(data[2]), data[1], data[3]);
  }
}