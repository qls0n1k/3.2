  // import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

  import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Podaj tekst: ");
      String tekst = scanner.nextLine();
      String wynik = ""; 

      for (int i = 0; i < tekst.length(); i++){
        char znak = tekst.charAt(i);

        if (Character.isLowerCase(znak)){
          wynik += Character.toUpperCase(znak);
        }
        else {
          wynik += Character.toLowerCase(znak);
        }
      }
      System.out.println("Tekst ze zmienioną wielkością liter: " + wynik);
        
    }
  }