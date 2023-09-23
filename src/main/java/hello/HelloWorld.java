package hello;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {

      LocalDate currentTime = LocalDate.now();
      System.out.println("La hora es: " + currentTime);
      Greeter greeter = new Greeter();
      System.out.println(greeter.sayHello());
    }
}
