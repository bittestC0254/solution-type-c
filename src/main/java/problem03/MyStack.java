package problem03;

public class MyStack {
	
	private String[] buffer;
<<<<<<< HEAD
 	int top;
 	int stack_size;
	
	public MyStack( int size ) {
		stack_size = size; //생성하면서 사이즈 초기화.
		
		top=-1; //top 초기화
		buffer = new String[size]; //받아온 size만큼 스택의 버퍼 size를 초기화시켜줌.
	}
	
	
	public void push(String item) {
	//	System.out.println("들어오는거"+item);
		top++;
		if(top>=stack_size) {
			//0,1,2까지 들어가고 3이 들어가려고 하면, 현재 스택의 버퍼 크기를 재설정해야한다.
			
		//	System.out.println("초과");
			//스택의 버퍼 크기 재설정->
			//1개 늘어난 임시버퍼 만들고
			
			String[] temp_buffer = new String[stack_size+1];
			
			// 원래 내용을 임시 버퍼로 옮기고
			for(int j=0;j<buffer.length;j++) {
				temp_buffer[j]=buffer[j];
			}

	//		System.out.println("원래 버퍼 크기"+buffer.length+"새로운 버퍼 크기"+temp_buffer.length);
			
			// 현재 mystack의 buffer를 buffer를 임시 버퍼로 바꿔준다.
			buffer = temp_buffer;
//			System.out.println("바뀐 버퍼 크기"+buffer.length);

		}
			
		buffer[top]=item;
	}

	public String pop() {
		String ans;
		
		if(top>=0) { //0번까지만 뽑을 수 있음.
			ans = buffer[top];  
			top--;
			return ans;
		}
		
		else { //top<0
			return null;
		}
	}

	public boolean isEmpty() {
		if(top<0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {			System.out.printf("");
=======

	public MyStack( int size ) {
	}
	
	public void push(String item) {
	}

	public String pop() {
		return null;
	}

	public boolean isEmpty() {
		return false;
	}
	
	public int size() {
>>>>>>> branch 'master' of https://github.com/bittestC0254/solution-type-c.git
		return 0;
	}
}