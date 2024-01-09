// checked exception에 해당 - 컴파일 에러 발생
// 해결책 : try-catch 문으로 처리 또는 메서드 밖으로 던짐
package ex07_2_Exception;
public class ExceptionExample2_3 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		
		try {
		int result = num1 / num2;
		System.out.println(result);
		} catch (ArithmeticException e){
			// ArithmeticException객체에 있는 에러 메시지를 가져옵니다.
			String message = e.getMessage();
			// e.getMessage() - 에러의 원인을 출력
			System.out.println(message);
		}
	}
}