package practical1;
import java.util.Scanner;
public class string {
	public static void main(String arg[]) {
		
      
      Scanner sc=new Scanner(System.in);
      StringBuilder s=new StringBuilder(sc.nextLine().replaceAll("\\s", "").toLowerCase());
      StringBuilder re=new StringBuilder(s).reverse();
      if(s.toString().equals(re.toString()))
       System.out.println("Palindrom");
       else
    	   System.out.println("Not a palindrom");
      
     
  
	}

}
