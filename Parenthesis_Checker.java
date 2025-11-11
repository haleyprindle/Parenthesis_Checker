//  Class author:  Haley Prindle
//  Date created:  11/10/25
//  General description: Given a String s1 containing just the characters '(', ')', '{', '}', '[' and ']', the program will determine if the input string is valid.
//


//
//  Pre-condition: The input has to be the characters '(', ')', '{', '}', '[' and ']' 
//  for the method to work.
//  Post-condition: The result of this method is true or false being returned based on the input for s1
//  If the input for s1 is valid, meaning open brackets must be closed by the same type of brackets,
//  closed brackets have to have an open bracket pair of the same type, 
//  and open brackets must be closed in the correct order,then the program will return true. 
//  If it's invalid, it will return false.
//

public class Parenthesis_Checker{
public static boolean isValid(String s1)
{
 String newString;
 do{
    newString = s1;
    s1 = s1.replace("()","")
            .replace("{}","")
            .replace("[]","");
 }   
    while(!s1.equals(newString));
    return s1.isEmpty();

}

public static void main(String[] args){
System.out.println(isValid("(){}[]")); //true
System.out.println(isValid("(]")); //false
System.out.println(isValid("([{({})}])")); //true
System.out.println(isValid("(([]){})")); //true
System.out.println(isValid("{}[())()(]")); //false
System.out.println(isValid("(){}{"));  //false
System.out.println(isValid("([)]")); //false
System.out.println(isValid("([{}([)])]")); //false
}
}