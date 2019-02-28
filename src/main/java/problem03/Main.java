package problem03;

public class Main {

	public static void main(String[] args) {
		MyStack stack = new MyStack(3);
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		stack.push("java");
<<<<<<< HEAD
		//stack.push(".");

		while (stack.isEmpty() == false) {
			String s = stack.pop(); // 스택 
			System.out.println(s);
		}
		System.out.println("gg");

		System.out.println("======================================");
		//MyStack stack = new MyStack(3); //삭제
		stack = new MyStack(3);
		stack.push("Hello");
		stack.push("Hello2");
		stack.push("Hello3");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		

=======
		stack.push(".");

		while (stack.isEmpty() == false) {
			String s = stack.pop();
			System.out.println(s);
		}

		System.out.println("======================================");

		stack = new MyStack(3);
		stack.push("Hello");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
>>>>>>> branch 'master' of https://github.com/bittestC0254/solution-type-c.git
	}
}