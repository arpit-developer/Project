public class StringBUilderExamples {
    public static void main(String[] args) {
        String fname = "Arpit";
        String lname = "Bhatnagar";
        String fullName = fname+lname;
        //Concatenation (Joining 2 strings)
        System.out.println(fname+" "+lname);
       //Print length of a String
       System.out.println(fullName.length());
       //Access characters of a string
       for(int i=0;i<fullName.length();i++){
        System.out.println(fullName.charAt(i));
       }
       //Compare 2 strings
       if(fname.compareTo(lname)==0){
        System.out.println("Strings are Equal ");
       }
       else{
        System.out.println("Strings are not equal");
       }
       //Substring
       System.out.println(fullName.substring(0, 5));
       //ParseInt Method of Integer class
       String age = "27";
       int num = Integer.parseInt(age);
       System.out.println(num);
        //ToString Method of String class
        num = 28;
        String str = Integer.toString(num);
        System.out.println(str.length());

        //ALWAYS REMEMBER : Java Strings are Immutable.

        //Declaration
        StringBuilder sb = new StringBuilder("My First String");
        System.out.println("String is : " +sb);
        //Get A Character from Index
        char index = sb.charAt(0);
        System.out.println("Character from Index : " +index);
        //Set a Character at Index
        sb.setCharAt(0, 'T');
        System.out.println(sb);
        //Insert a Character at Some Index
        sb.insert(1, 'h');
        sb.insert(2, 'e');
        System.out.println(sb);
        //Delete char at some Index
        sb.delete(3, 10);
        System.out.println(sb);
        //Append a char 
        sb.append(" ");
        sb.append("Second");
        System.out.println(sb);
        //Print Length of String
        System.out.println(sb.length());
        //Capacity
        sb.capacity();
        System.out.println(sb.capacity());
        //Reverse a String (using StringBuilder class)
        System.out.println(sb.reverse());
        //Reverse a String in a detailed way(using StringBuilder class)
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;
             char frontChar = sb.charAt(front);
             char backChar =  sb.charAt(back);
             sb.setCharAt(front, backChar);
             sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
        
    }
}
