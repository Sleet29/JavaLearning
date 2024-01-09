// checked exception에 해당 - 컴파일 에러 발생
// 해결책 : try-catch 문으로 처리 또는 메서드 밖으로 던짐
package ex07_2_Exception;
public class ExceptionExample2_4 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 10;
		
		try {
		int result = num1 / num2;
		System.out.println(result);
		} catch (ArithmeticException e){
			// 괄호 내부는 JVM이 처리
			String message = e.getMessage();
			// e.getMessage() - 에러의 원인을 출력
			System.out.println(message);
		}finally {
			System.out.println("여기까지 왔어요~");
		}
	}
}