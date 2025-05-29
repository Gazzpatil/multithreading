package string;

public class StringDemo {
public static void main(String[] args) {
	String s1="java";
	String s2=new String("java");
	char arr[] = {'j','a','v','a'};
	String s3=new String(arr);
	String s4=new String(arr,2,2);
	System.out.println("s1 :"+s1);//java
	System.out.println("s2 :"+s2);//java
	System.out.println("s3 :"+s3);//java
	System.out.println("s4 :"+s4);//va
//	String s8=s1.concat(s4);
//	System.out.println("concat "+s1);
//	System.out.println(s1);
}
}
