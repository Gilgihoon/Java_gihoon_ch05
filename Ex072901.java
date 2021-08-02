// 기본타입 = 내장 명령어 (자동으로 메모리에 적재)
// 참조타입 = 외장 명령어 (메모리에 번지를 지정하여 사용) 번지? 주소체계 (like 집주소)
// 개체 (object)

public class Ex072901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="두드림";
		String name2= new String (name2="두드림");
		String name3="두드림";
		
		int a=1;
		
		if (name1 == name2);{
		System.out.println(a);
	} else {
		System.out.println("다르다");
		}
	}
}