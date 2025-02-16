public class BooleanExpressionsDemo{
	public static void main(String[] args) {
		
		//boolean
		boolean isJavaFun = true;
		boolean isHomeworkTiring = false;
		
		//integer
		int a = 15;
		int b = 20;
		
		boolean isAGreater = a > b; //Flase
		boolean areEqual = a == b; //False
		boolean bothTrue = isJavaFun && (a < b); //True
		boolean eitherTrue = isJavaFun || isHomeworkTiring; //True
		boolean notTrue = !isHomeworkTiring; //True
		boolean exclusiveOr = isJavaFun ^ isHomeworkTiring; //True             
		System.out.println("Is Java fun? " + isJavaFun); 
		System.out.println("Is homework tiring? " + isHomeworkTiring); 
		System.out.println("Is 'a' greater than 'b'? " + isAGreater);
		System.out.println("Are 'a' and 'b' equal? " + areEqual);
		System.out.println("Both conditions (isJavaFun && a<b): " + bothTrue);
		System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
		System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
		System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);
		   
	   
	}
}


/* OUTPUT
Is Java fun? true
Is homework tiring? false
Is 'a' greater than 'b'? false
Are 'a' and 'b' equal? false
Both conditions (isJavaFun && a<b): true
Either condition (isJavaFun || isHomeworkTiring): true
Logical NOT of isHomeworkTiring: true
Exclusive OR (isJavaFun ^ isHomeworkTiring): true
*/