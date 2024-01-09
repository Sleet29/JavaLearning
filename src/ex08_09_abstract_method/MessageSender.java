package ex08_09_abstract_method;

abstract class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title, String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	// 추상 메서드 - 메시지를 송신한다.
	abstract void sendMessage(String recipient); 

}
