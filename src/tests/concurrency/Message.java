package tests.concurrency;

public abstract class Message {

	public String recipient;
	public abstract void sendMessage();
	
	static class TextMessage extends Message{

		public final void sendMessage() {
			System.out.println("Text Message to " + recipient);
		}
		
	}
	
	public static void main(String[] args) {
		Message m = new TextMessage();
		m.recipient = "123456";
		m.sendMessage();
	}

}
