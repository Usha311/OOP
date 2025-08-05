package skill1;

public class Stringmanupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Hello,World!";
		System.out.println("Length:"+str.length());
		System.out.println("Trimmed:"+str.trim()+"'");
	    System.out.println("UpperCase: "+str.toUpperCase());
	    System.out.println("LowerCase: "+str.toLowerCase());
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        System.out.println("Contains 'World'? " + str.contains("World"));
        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));
        System.out.println("Starts with ' Hello'? " + str.startsWith(" Hello"));
        System.out.println("Ends with '!'? " + str.endsWith("!"));
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Index of 'o': " + str.indexOf("o"));
        System.out.println("Equals ' Hello, World! '? " + str.equals(" Hello, World! "));

       

	    
	}

}
