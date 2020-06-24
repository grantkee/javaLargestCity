import java.util.Scanner;

public class Continents {
  String continent;

  public Continents(String num){
    continent = num;
  }

  public String largestCity(){
    String largestCity;
    switch (continent){
      case "1":
        largestCity = "North America: Mexico City, Mexico";
        break;
      case "2":
        largestCity = "South America: Sao Paulo, Brazil";
        break;
      case "3":
        largestCity = "Europe: Moscow, Russia";
        break;
      case "4": 
        largestCity = "Africa: Lagos, Nigeria";
        break;
      case "5":
        largestCity = "Asia: Shanghai, China";
        break;
      case "6":
        largestCity = "Australia: Sydney, Australia";
        break;
      case "7":
        largestCity = "Antarctica: McMurdo Station, US";
        break;
      default:
        largestCity = "Undefined continent!";
        break;
    }
    return largestCity;
  }

  //take a number and return a city and continent
	public static void main(String[] args) {
    System.out.println("Enter a number to find out the largest city on that continent!");
    System.out.println("1 - North America");
    System.out.println("2 - South America");
    System.out.println("3 - Europe");
    System.out.println("4 - Africa");
    System.out.println("5 - Asia");
    System.out.println("6 - Australia");
    System.out.println("7 - Antarctica");
    Scanner x = new Scanner(System.in);
    String input = x.nextLine();
    Continents first = new Continents(input);
    System.out.println(first.largestCity());
	}
}