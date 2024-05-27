import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
	    String temp="";
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
		String s=sc.nextLine();
		if(s.length()<4){
		    System.out.println(s+" is an invalid number");
		}
		else{
		for(int i=s.length()-1;i>=0;i--)
		{
		    char ch=s.charAt(i);
		    if(ch=='0'){
		        continue;
		    }
		    temp=temp+ch;
		}
		System.out.println("Reversed number is" +temp);
		if(temp.length()==4){
		    System.out.println(s.charAt(3)+"000"+"+"+s.charAt(2)+"00"+"+"+s.charAt(1)+"0"+"+"+s.charAt(0));
		}
		else if(temp.length()==3){
		    System.out.println(s.charAt(2)+"00"+"+"+s.charAt(1)+"0"+"+"+s.charAt(0));
		}
		else if(temp.length()==2){
		    System.out.println(s.charAt(1)+"0"+"+"+s.charAt(0));
		}
		else {
		    System.out.println(s.charAt(0));
		}
		}
	}
}
