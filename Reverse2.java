
/**
 * Write a description of class Reverse2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse2
{
  public static final String SECRET_PASSWORD = "CAR";
  
  static String obfuscate(String input) {
      return input .replace('C', 'M').concat("DEER").replace('T', 'R').concat("DOG");
  }
  
  public static void main (String [] args) 
  {
      if (args.length != 1)
      {
        System.out.println("Wrong! You have to run this program with one arguement:\njavaReverse <arguements>");
        return;
      }
      if (args[0].equals(obfuscate(SECRET_PASSWORD)))
      {
          System.out.println("You win! Congratulations!");
      } else 
      {
          System.out.println("Wrong password, try again");
      }
  }
}
