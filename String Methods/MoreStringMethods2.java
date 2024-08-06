import java.util.Arrays;

public class MoreStringMethods2 {
  
  public static void main(String [] args) {
    
    int [] array = letterCount("abyz");
    
    for (int i = 0; i < array.length; i++) {
      System.out.print( (char)(i+97) + "'s: ");
      System.out.println(array[i]);
    }
    
    
    //System.out.println(isPalindrome("anitalavalatina"));    //true
    //System.out.println(areAnagrams("hola", "laho"));    //true
    //System.out.println(canSpell("helo","hello"));    //false
    
  }
  
  public static boolean isPalindrome(String word) {
    String reversed = "";
    for (int i = 0; i < word.length(); i++) {
      reversed = word.charAt(i) + reversed;           
    }
    
    if (word.equals(reversed)) {
      return true;
    } 
    return false;
  }
  
  public static boolean areAnagrams(String input1, String input2) {
    int [] word1 = letterCount(input1);
    int [] word2 = letterCount(input2);
    
    if (Arrays.equals(word1, word2)) {
      return true;
    } 
    return false;
  }
  
  public static int [] letterCount(String input ) {
    int [] a = new int[26];
    input = input.toLowerCase();
    int ascii;
    
    for (int i = 0; i < input.length(); i++) {  
      ascii = (int) input.charAt(i);
      if (ascii >= 97 && ascii <= 123) {
        a[ascii - 97] ++;
      } 
    }
    
    
    /* for (char n = 'a'; n <= 'z'; n++) 
     * 
     if (input.charAt(i) == n) {
     a[n-'a'] = a[n-'a'] + 1;      //'a' is 97 in ASCII
     }
     }*/
    
    return a;
  }
  
  public static boolean canSpell(String input1, String input2) {
    int [] word1 = letterCount(input1);
    int [] word2 = letterCount(input2);
    boolean check = true;
    
    for (int i = 0; i < word1.length; i++) {
      
      if (word1[i] >= word2[i]) {
        check = true;
      } else {
        return false;
      }
    } return check;
  }
}