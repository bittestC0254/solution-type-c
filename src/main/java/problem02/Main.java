package problem02;

public class Main {
	/*수정 금지*/
	
	public static void main(String[] args) {
		BaseService base = new MyService();

		base.service("낮");
		base.service("오후");
		base.service("밤");
	}
}