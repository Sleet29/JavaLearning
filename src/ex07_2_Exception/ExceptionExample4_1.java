// unchecked exception을 던지는 메소드
// throws 절이 없어도 try ~ catch 문으로 예외처리 가능
// 정수는 0으로 나누는 것이 금지되어 ArithmeticException 발생합니다.
package ex07_2_Exception;

class ExceptionExample4_1 {
	public static void main(String args[]) {
		int result = devide(3,0);
		System.out.println(result);
	}

	static int devide(int a, int b) {
		int result = a/b;
		return result;
	}
}