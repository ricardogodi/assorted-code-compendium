import java.util.Scanner;

public class PlayerRoster {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char selection;
    int [] jerseys = new int[5];
    int [] ratings = new int[5];
    
    int i = 0;
    for (i = 0; i < 5; i++) {
      jerseys[i] = getJersey(scan, "Enter player " + (i+1) + "'s jersey number:", jerseys);
      ratings[i] = getRating(scan, "Enter player " + (i+1) + "'s rating:");
      System.out.println();
    }
    
    do {
      selection = menu(scan);
      if (selection == 'u' ){
        int n = update(scan, jerseys);
        ratings[n] = getRating(scan, "Enter a new rating for player:");
      }
      if (selection == 'a' ) {
        aboveRating(scan, jerseys, ratings);
      }
      if (selection == 'o') {
        displayRoster(jerseys, ratings);
      }
      if (selection == 'r') {
        int m = update(scan, jerseys);
        jerseys[m] = getJersey(scan, "Enter a new jersey number:", jerseys);
        ratings[m] = getRating(scan, "Enter a rating the new player:");
      }
    } while (selection != 'q');
    System.out.println("Good bye!"); 
  }
  
  public static char menu(Scanner scan) {
    char choice;
    System.out.println("MENU");
    System.out.println("u - Update player rating");
    System.out.println("a - Output players above a rating");
    System.out.println("r - Replace player");
    System.out.println("o - Output roster");
    System.out.println("q - Quit");
    System.out.println();
    System.out.println("Choose an option:");
    String input = scan.nextLine();
    input = input.toLowerCase();
    choice = input.charAt(0);
    return choice;
  }
  
  public static void displayRoster(int [] jerseys, int [] ratings) {
    int i = 0;
    for (i = 0; i < 5; i++) {
      System.out.printf("Player %d -- Jersey Number:", i+1);
      System.out.printf("%3d, Rating:%2d%n", jerseys[i], ratings[i]); 
    }
    System.out.println();
  }
  








  public static int getJersey (Scanner scan, String prompt, int [] jerseys) {
    int number;
    int isRepeated;
    
    do {
      System.out.println(prompt); 
      number = scan.nextInt();
      scan.nextLine();
      isRepeated = 0;
      
      for (int i = 0; i < jerseys.length; i++) {
        if (number == jerseys[i]) {
          isRepeated = 1;
        }
      }
      
      if (number < 0 || number > 99) {
        System.out.println("The jersey's number must be between 0 and 99, inclusive\n");
      }
      
      if (isRepeated == 1) {
        System.out.println("The jersey's number is already used\n");
      }
      
    } while (number < 0 || number > 99 || isRepeated == 1);
    return number;
  }
  
  public static int getRating(Scanner scan, String prompt) {
    int rating;
    do {
      System.out.println(prompt); 
      rating = scan.nextInt();
      scan.nextLine();
      if (rating < 1 || rating > 9) {
        System.out.println("The rating must be between 1 and 9, inclusive\n");
      }
    } while (rating < 1 || rating > 9);
    return rating;
  }
  
  public static int update(Scanner scan, int [] jerseys) {
    int index = -1;
    int input;
    
    do {
      System.out.println("Enter jersey number"); 
      input = scan.nextInt();
      scan.nextLine();
      int i = 0;
      for (i = 0; i < jerseys.length; i++) {
        if (input == jerseys[i]) {
          index = i;
        }
      }
      if (index == -1 ){
        System.out.println("Jersey number not found"); 
      }
    } while (index == -1 );
    return index;
  }
  








  public static void aboveRating(Scanner scan, int [] jerseys, int [] ratings) {
    int input;
    System.out.println("Enter a rating:"); 
    input = scan.nextInt();
    scan.nextLine();
    System.out.println("ABOVE " + input); 
    int i = 0;
    for (i = 0; i < ratings.length; i++) {
      if (ratings[i] > input) {
        System.out.printf("Player %d -- Jersey Number:", i+1);
        System.out.printf("%3d, Rating:%2d%n", jerseys[i], ratings[i]); 
      }
    }
  }
}