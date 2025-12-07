/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Collection;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      
      //s.addStudent(new Student("Krzysztof", 20));
      //s.addStudent(new Student("Janusz", 40));
      String name = "";
      while(true){
           name = System.console().readLine("Wpisz imie studenta: ");
          if(name.matches("[a-zA-Z]+") && !name.contains(" ")){
            break;
          }
          System.out.println("Imie nie moze zawierac cyfr ani spacji");
      }
      int age = 0;
      while(true){
        try {
           age = Integer.parseInt(System.console().readLine("Wpisz wiek studenta: "));
           if(age > 0 && age < 120){
            break;
          }
          System.out.println("Wiek musi byc liczba z przedzialu 1-120");
        } catch (NumberFormatException e) {
           System.out.println("Wiek musi byc liczba");
        }
      }
      
      // int age = Integer.parseInt(System.console().readLine("Wpisz wiek studenta: "));
      s.addStudent(new Student(name, age));
      
      Collection<Student> students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
}