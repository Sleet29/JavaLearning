// checked exception을 던지는 메솓
// 컴파일 에러 발생
// throws Exception을 가진 메서드 호출시 try~catch문으로 처리
// 해결책 : try-catch 문으로 처리 또는 메서드 밖으로 던짐
package ex07_2_Exception;
public class ExceptionExample3_1 {
	public static void main(String args[]) throws Exception {
		int result = add(1,-2);
		System.out.println(result);
	}
	
	// 메인 메서드 내부에 add가 들어가지 않음!!
	
	// throws Exception : throw에 의해 발생한 에러를 호출한 메서드로 넘깁니다.
	static int add(int a, int b) throws Exception {
								 //
		int result = a + b;
		if (result < 0)
			throw new Exception("0보다 작아 에러 발생합니다.");
		return result;
	}
}