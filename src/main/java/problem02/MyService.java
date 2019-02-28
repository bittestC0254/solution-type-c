package problem02;

public class MyService extends BaseService {

	public String afternoon() {
<<<<<<< HEAD
		return "오후";
	} 
	
	public void service(String state) { //baseservice의 service함수를 재사용
		//부모께 맞으면 부모의 result 사용
		System.out.printf("");
		String result;
		
		if( state.equals("오후")) { 
			result = afternoon();
			System.out.println(result);
		}
		else {
			super.service(state);
		}
		System.out.println("서비스 시작");
=======
		return null;
>>>>>>> branch 'master' of https://github.com/bittestC0254/solution-type-c.git
	}
}
