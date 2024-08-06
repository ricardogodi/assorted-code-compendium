public class NoteGenerator {
  
  public static void main (String [] args) { 
    
    //String [][] chromatic = { {"Do", "Do#", "Re","Re#","Mi", "Fa",  "Fa#", "Sol","Sol#","La","La#","Si"}, 
    // {"Si#", "Reb", null,"Mib","Fab","Mi#","Solb", "Fax,"Lab", "Fax","Sib","Dob"} }; 
    
    String [][] chromaticEnglish = { {"C", "C#", "D","D#","E", "F",  "F#", "G","G#","A","A#","B"}, 
      {"B#", "Db", null ,"Eb","Fb","E#","Gb", "Fx","Ab", null,"Bb","Cb"} }; 
    
    //crear array multidimensional para todas las escalas... 12x7. Luego a partir de ahi, generar acordes
    
    String [][] majorScales = new String [12][7];
    String [][] minorScales = new String [12][7];
    String [][] harmonicMinorScales = new String [12][7];
    String [][] melodicMinorScales = new String [12][7];
    
    for (int i = 0; i <= 11; i ++) {
      melodicMinorScale(i,chromaticEnglish,melodicMinorScales);
      harmonicMinorScale(i,chromaticEnglish,harmonicMinorScales);
      majorScale (i,chromaticEnglish,majorScales);
      minorScale ((i+9)%12,chromaticEnglish,minorScales);
    } 
    
    int fifthIntMajor = 0;
    int fifthIntMinor = 9;
    
    for (int i = 1; i <= 4; i ++) { 
      if (i == 1) {
        System.out.println("Major Scales");
      } 
      
      if (i == 2) {
        System.out.println("Minor Scales");
      }
      
      if (i == 3) {
        System.out.println("Harmonic Minor Scales");
      } 
      
      if (i == 4) {
        System.out.println("Melodic Minor Scales");
      }
      
      fifthIntMajor = 0;
      fifthIntMinor = 9;
      
      for (int row = 0; row <= 11; row ++) {
        System.out.print((row+1) + ".    ");
        for (int column = 0; column <= 6; column ++) {
          
          if (i == 1) {
            System.out.printf("%-5s",majorScales[fifthIntMajor][column]);
          } 
          
          if (i == 2) {
            System.out.printf("%-5s",minorScales[fifthIntMinor][column]);
          }
          
          if (i == 3) {
            System.out.printf("%-5s",harmonicMinorScales[fifthIntMinor][column]);
          } 
          
          if (i == 4) {
            System.out.printf("%-5s",melodicMinorScales[fifthIntMinor][column]);
          }
        }
        fifthIntMajor = (fifthIntMajor + 7)%12;
        fifthIntMinor = (fifthIntMinor + 7)%12;
        System.out.println("\n");
      }
    }
    
    System.out.println("\n");
    
    fifthIntMajor = 0;
    fifthIntMinor = 9;
    
    for (int i = 1; i <= 4; i ++) {
      
      if (i == 1) {
        System.out.println("CHORDS FOR MAJOR TONES");
      }
      if (i == 2) {
        System.out.println("CHORDS FOR MINOR TONES");
      }
      if (i == 3) {
        System.out.println("CHORDS FOR HARMONIC MINOR TONES");
      }
      if (i == 4) {
        System.out.println("CHORDS FOR MELODIC MINOR TONES");
      }
      
      
      for (int k = 0; k <= 11; k ++) {   //print major 
        
        if (i == 1) {
          System.out.print((k + 1) + ". " + majorScales[fifthIntMajor][0] + " Major: ");
          
          for (int column = 0; column <= 6; column ++) {        
            System.out.print(majorScales[fifthIntMajor][column] + " ");
          }
          System.out.println("\n");
          
          chordsMajor(fifthIntMajor,majorScales);
          System.out.println();
        }
        
        if (i == 2) {
          System.out.print((k + 1) + ". " + minorScales[fifthIntMinor][0] + " Minor: ");
          
          for (int column = 0; column <= 6; column ++) {        
            System.out.print(minorScales[fifthIntMinor][column] + " ");
          }
          System.out.println("\n");
          chordsMinor(fifthIntMinor,minorScales);
          System.out.println();
        }
        
        if (i == 3) {
          System.out.print((k + 1) + ". " + harmonicMinorScales[fifthIntMinor][0] + " Harmonic Minor: ");
          
          for (int column = 0; column <= 6; column ++) {        
            System.out.print(harmonicMinorScales[fifthIntMinor][column] + " ");
          }
          System.out.println("\n");
          chordsHarmonicMinor(fifthIntMinor,harmonicMinorScales);
          System.out.println();
        }
        
        if (i == 4) {
          System.out.print((k + 1) + ". " + melodicMinorScales[fifthIntMinor][0] + " Melodic Minor: ");
          
          for (int column = 0; column <= 6; column ++) {        
            System.out.print(melodicMinorScales[fifthIntMinor][column] + " ");
          }
          System.out.println("\n");
          chordsMelodicMinor(fifthIntMinor,melodicMinorScales);
          System.out.println();
        }
        
        
        fifthIntMajor = (fifthIntMajor + 7)%12;
        fifthIntMinor = (fifthIntMinor + 7)%12;
      } 
    }
  }
  
  public static void majorScale (int tonic, String [][] chromatic, String [][] majorScales) {
    
    int tone = 2;
    int semitone = 1;
    int nextNote = tonic;
    boolean flag = false;
    String previous = "";
    
    
    if ((tonic % 2 == 0) && tonic <= 4) {   //For 1st 2nd, and 3rd 
      flag = true; 
    }
    
    if ((tonic % 2 != 0) && tonic > 4) { //For 4th, 5th, 6th 
      flag = true; 
    }  
    
    for (int i = 1; i <= 7; i++) {
      
      if ((i == 1 ) && flag) { //For first note, and either C D E F G A OR B 
        previous = chromatic[0][nextNote];  //guardar nota justo imprimida
        majorScales[tonic][i-1] = chromatic[0][nextNote];
      } else if ((i == 1) && !flag) {       //For first note, and any other flatted note
        previous = chromatic[1][nextNote];
        majorScales[tonic][i-1] = chromatic[1][nextNote];
      } else if(chromatic[0][nextNote].charAt(0) == previous.charAt(0)) {  //from i > 1 the first two conditions are not gonna be met...Si la primera letra iguala la primera letra de la anterior..
        // System.out.print(chromatic[1][nextNote] + " ");   //ENHARMONICA
        previous = chromatic[1][nextNote];  //guardarla
        majorScales[tonic][i-1] = chromatic[1][nextNote];
      } else {
        previous = chromatic[0][nextNote];
        majorScales[tonic][i-1]=chromatic[0][nextNote];
      }
      
      if (i == 3) {             //next note
        nextNote = (nextNote + semitone)%12;  //index in the array of the next note of the scale   %12
      } else {
        nextNote = (nextNote + tone)%12;
      }
      
    }
    //System.out.println();
  }
  
  public static void minorScale (int tonic, String [][] chromatic,String [][] minorScales) {
    
    int tone = 2;
    int semitone = 1;
    int nextNote = tonic;
    boolean flag = false;
    String previous = "";
    
    if ((tonic != 3) && (tonic != 10)) {     //para mib y sib 
      flag = true; 
    }
    
    for (int i = 1; i <= 7; i++) {
      
      if ((i == 1 ) && flag) {
        //System.out.println(chromatic[0][nextNote] + " minor:");
        
        //System.out.print(chromatic[0][nextNote].toLowerCase() + " "); 
        previous = chromatic[0][nextNote];
        minorScales[tonic][i-1] = chromatic[0][nextNote];
      } else if ((i == 1) && !flag) {
        // System.out.println(chromatic[1][nextNote] + " minor:");
        
        //System.out.print(chromatic[1][nextNote].toLowerCase() + " "); 
        previous = chromatic[1][nextNote];
        minorScales[tonic][i-1] = chromatic[1][nextNote];
      } else if(chromatic[0][nextNote].charAt(0) == previous.charAt(0)) {
        // System.out.print(chromatic[1][nextNote].toLowerCase() + " ");
        previous = chromatic[1][nextNote];
        minorScales[tonic][i-1] = chromatic[1][nextNote];
      } else {
        //System.out.print(chromatic[0][nextNote].toLowerCase() + " ");
        previous = chromatic[0][nextNote];
        minorScales[tonic][i-1]=chromatic[0][nextNote];
      }
      
      if ((i == 2) || (i == 5) ) {             //next note
        nextNote = (nextNote + semitone)%12; 
      } else {
        nextNote = (nextNote + tone)%12;
      }
      
    }
    // System.out.println();
  }
  
  public static void harmonicMinorScale (int tonic, String [][] chromatic,String [][] minorScales) {
    
    int tone = 2;
    int semitone = 1;
    int aumTone = 3;
    int nextNote = tonic;
    boolean flag1 = false;
    String previous = "";
    
    boolean flag2 = false;
    
    if ((tonic != 3) && (tonic != 10) ) {  //excepciones (sib y mib)... c# f# g#    1,6,8
      flag1 = true; 
    }
    
    if ((tonic == 1) || (tonic ==  6) || (tonic == 8)) {
      flag2 = true; 
    }
    
    for (int i = 1; i <= 7; i++) {
      
      if ((i == 1 ) && flag1) {
        //System.out.println(chromatic[0][nextNote] + " harmonic minor:");
        
        //System.out.print(chromatic[0][nextNote].toLowerCase() + " "); 
        previous = chromatic[0][nextNote];
        minorScales[tonic][i-1] = chromatic[0][nextNote];
      } else if ((i == 1) && !flag1) {
        //System.out.println(chromatic[1][nextNote] + " harmonic minor:");
        
        //System.out.print(chromatic[1][nextNote].toLowerCase() + " "); 
        previous = chromatic[1][nextNote];
        minorScales[tonic][i-1] = chromatic[1][nextNote];
      } else if ((chromatic[0][nextNote].charAt(0) == previous.charAt(0)) || (flag2 && i==7)) {        //OJO
        // System.out.print(chromatic[1][nextNote].toLowerCase() + " ");
        previous = chromatic[1][nextNote];
        minorScales[tonic][i-1] = chromatic[1][nextNote];
      } else {
        //System.out.print(chromatic[0][nextNote].toLowerCase() + " ");
        previous = chromatic[0][nextNote];
        minorScales[tonic][i-1] = chromatic[0][nextNote];
      }
      
      if ((i == 2) || (i == 5) ) {             //next note
        nextNote = (nextNote + semitone)%12; 
      } else if (i == 6){
        nextNote = (nextNote + aumTone)%12;
      } else {
        nextNote = (nextNote + tone)%12;
      }
      
    }
    // System.out.println();
  }
  
  public static void melodicMinorScale (int tonic, String [][] chromatic,String [][] minorScales) {
    
    int tone = 2;
    int semitone = 1;
    int nextNote = tonic;
    boolean flag1 = false;
    String previous = "";
    
    boolean flag2 = false;
    
    boolean flag3 = false;   //para el sexto grado de g#
    
    if ((tonic != 3) && (tonic != 10) ) {  //excepciones (sib y mib)... c# f# g#    1,6,8
      flag1 = true; 
    }
    
    if ((tonic == 1) || (tonic ==  6) || (tonic == 8)) {
      flag2 = true; 
    }
    
    if ((tonic == 8)) {
      flag3 = true; 
    }
    
    for (int i = 1; i <= 7; i++) {
      
      if ((i == 1 ) && flag1) {
        
        
        
        previous = chromatic[0][nextNote];
        minorScales[tonic][i-1] = chromatic[0][nextNote];
      } else if ((i == 1) && !flag1) {
        
        
        
        previous = chromatic[1][nextNote];
        minorScales[tonic][i-1] = chromatic[1][nextNote];
      } else if ((chromatic[0][nextNote].charAt(0) == previous.charAt(0)) || (flag2 && (i==7)) || (flag3 && (i==6))) {        //OJO
        
        previous = chromatic[1][nextNote];
        minorScales[tonic][i-1] = chromatic[1][nextNote];
      } else {
        
        previous = chromatic[0][nextNote];
        minorScales[tonic][i-1] = chromatic[0][nextNote];
      }
      
      if ((i == 2) ) {             //next note
        nextNote = (nextNote + semitone)%12; 
      }  else {
        nextNote = (nextNote + tone)%12;
      }
      
    }
    
  }
  
  
  public static void chordsMajor (int row, String [][] majorScales) {
    
    int nextNote = 0;
    
    for (int i = 0; i <= 6; i++) {
      nextNote = i;
      
      if (i==0) {
        System.out.printf("%-14s","I Maj7.");
      }
      if (i==1) {
        System.out.printf("%-14s","ii m7.");
      }
      if (i==2) {
        System.out.printf("%-14s","iii m7.");
      }
      if (i==3) {
        System.out.printf("%-14s","IV Maj7.");
      }
      if (i==4) {
        System.out.printf("%-14s","V7.");
      }
      if (i==5) {
        System.out.printf("%-14s","vi m7.");
      }
      if (i==6) {
        System.out.printf("%-14s","vii ø7.");
      }
      
      for (int k = 1; k <= 4; k++) {
        
        System.out.printf("%5s", majorScales[row][nextNote] + " ");
        
        nextNote = (nextNote + 2)%7;
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  public static void chordsMinor (int row, String [][] minorScales) {
    
    int nextNote = 0;
    
    for (int i = 0; i <= 6; i++) {
      nextNote = i;
      
      if (i==0) {
        System.out.printf("%-14s","i m7.");
      }
      if (i==1) {
        System.out.printf("%-14s","ii ø7.");
      }
      if (i==2) {
        System.out.printf("%-14s","III Maj7.");
      }
      if (i==3) {
        System.out.printf("%-14s","iv m7.");
      }
      if (i==4) {
        System.out.printf("%-14s","v m7.");
      }
      if (i==5) {
        System.out.printf("%-14s","VI Maj7.");
      }
      if (i==6) {
        System.out.printf("%-14s","VII7.");
      }
      
      for (int k = 1; k <= 4; k++) {
        
        System.out.printf("%5s", minorScales[row][nextNote] + " ");
        
        nextNote = (nextNote + 2)%7;
      }
      System.out.println();
    }
    System.out.println();
  }
  
  public static void chordsHarmonicMinor (int row, String [][] minorScales) {
    
    int nextNote = 0;
    
    
    for (int i = 0; i <= 6; i++) {
      nextNote = i;
      
      if (i==0) {
        System.out.printf("%-14s","i m7+.");
      }
      if (i==1) {
        System.out.printf("%-14s","ii ø7.");
      }
      if (i==2) {
        System.out.printf("%-14s","III+ Maj7.");
      }
      if (i==3) {
        System.out.printf("%-14s","iv m7.");
      }
      if (i==4) {
        System.out.printf("%-14s","V7.");
      }
      if (i==5) {
        System.out.printf("%-14s","VI Maj7.");
      }
      if (i==6) {
        System.out.printf("%-14s","vii o7.");
      }
      
      for (int k = 1; k <= 4; k++) {
        
        System.out.printf("%5s", minorScales[row][nextNote] + " ");
        
        nextNote = (nextNote + 2)%7;
      }
      System.out.println();
    }
    System.out.println();
  }
  
  public static void chordsMelodicMinor (int row, String [][] minorScales) {
    
    int nextNote = 0;
    
    for (int i = 0; i <= 6; i++) {
      nextNote = i;
      
      if (i==0) {
        System.out.printf("%-14s","i m7+.");
      }
      if (i==1) {
        System.out.printf("%-14s","ii m7.");
      }
      if (i==2) {
        System.out.printf("%-14s","III+ Maj7.");
      }
      if (i==3) {
        System.out.printf("%-14s","IV7.");
      }
      if (i==4) {
        System.out.printf("%-14s","V7.");
      }
      if (i==5) {
        System.out.printf("%-14s","vi ø7.");
      }
      if (i==6) {
        System.out.printf("%-14s","vii ø7.");
      }
      
      for (int k = 1; k <= 4; k++) {
        
        System.out.printf("%5s", minorScales[row][nextNote] + " ");
        
        nextNote = (nextNote + 2)%7;
      }
      System.out.println();
    }
    System.out.println();
  }
}





