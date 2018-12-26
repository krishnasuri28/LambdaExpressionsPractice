package io.lambda.expressions;

public class Greeter {

	public static void main(String[] args) {
		
		LambdaExpression lambdaExpression = s -> s.length();
		AddLambdaExpression addLambdaExpression = (a , b) -> a+b;
		System.out.println(lambdaExpression.getLength("Hello Lambda"));
		System.out.println(addLambdaExpression.addIntegers(10,20));
             
	}
	
	interface LambdaExpression {
		int getLength (String s);
	}
	
	interface AddLambdaExpression {
		int addIntegers(int a, int b);
	}
}
