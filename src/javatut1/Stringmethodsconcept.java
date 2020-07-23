package javatut1;
import java.lang.Integer;
public class Stringmethodsconcept {

	public Stringmethodsconcept() {
		String str="We are learning Java,in constructor";
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		//Stringmethodsconcept smc=new Stringmethodsconcept();
        
		String str="Hello world";
		int a=str.length();
		System.out.println(a);
		System.out.println(str.indexOf(2));
		System.out.println(str.indexOf('l',2));
		//second occurence
		System.out.println(str.indexOf('l', str.indexOf('l')+1));
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.charAt(1));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(str.indexOf('l'),str.lastIndexOf('l')));
		System.out.println(str.replace('l','o'));
		//split data
		//used in splitting username passwords in database
		String data[]=str.split("l");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			
		}
		//another example of split
		String userdetails="myname;mypassword;1234";
		//if its is abcd in place of 1234 then parseInt will give exception
		String username=userdetails.split(";")[0];
		String pwd=userdetails.split(";")[1];
		//dataconverting
		int id=Integer.parseInt((userdetails.split(";")[2]));
		System.out.println(username+" "+pwd+" "+id);
		

	}

}
