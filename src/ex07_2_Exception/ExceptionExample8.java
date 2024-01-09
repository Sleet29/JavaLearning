// unchecked exception을 던지는 메소드
// throws 절이 없어도 try ~ catch 문으로 예외처리 가능
// 정수는 0으로 나누는 것이 금지되어 ArithmeticException 발생합니다.
package ex07_2_Exception;
import java.io.*;
class ExceptionExample8 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}