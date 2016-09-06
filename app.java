import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class app {
  public static void main(String[] args) {
    Console console = System.console();

    Integer day1 = Integer.parseInt(console.readLine("How many hours did you code two days ago?"));
    Integer day2 = Integer.parseInt(console.readLine("How many hours did you code yesterday?"));
    Integer day3 = Integer.parseInt(console.readLine("How many hours did you code today?"));


    List<Integer> codeHours = new ArrayList<Integer>();
     codeHours.add(day1);
     codeHours.add(day2);
     codeHours.add(day3);

     Integer totalHours = day1 + day2 + day3;
     System.out.println(totalHours);

     if (totalHours > 12) {
       System.out.println ("You are on your way to being a pro!!");

     } else {
       System.out.println ("You need to get back to work!");
     }
  }
}
