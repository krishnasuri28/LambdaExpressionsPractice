package io.lambda.expressions;

public class RunnableLambdaExample {
	
	public static void main(String args[]) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printing inside runnable");
			}
		});
		thread.run();
	}

}
