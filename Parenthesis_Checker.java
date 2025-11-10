//  Class author:  name of programmer
//  Date created:  date that the class was initially created.
//  General description: a brief summary of what this particular class does.
//
public class Parenthesis_Checker{
public static boolean isValid(String s1)
{
for(int i=0;i<=s1.length()-1;i++){
    String opening = s1.replaceFirst("[{[(]","");
    int count = 0;
    if(s1!=opening){
        return false;
    }
    else
    {
     count++;
    }
    
    

    String newString = s1.substring(1);

    
}
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