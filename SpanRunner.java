//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn Savas

import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
 public static void main( String args[] ) throws IOException
 {
   SpanishToEnglish trans = new SpanishToEnglish();
   Scanner data = new Scanner(new File("spantoeng.dat"));
   int num = data.nextInt();
   data.next();
   for(int i=0; i <= num; i++){
     trans.putEntry(data.nextLine());
   }
   while(data.hasNext()){
     System.out.println(trans.translate(data.nextLine()));
   }
 }
}