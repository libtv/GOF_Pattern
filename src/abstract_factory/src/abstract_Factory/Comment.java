package abstract_Factory;

public class Comment {
	String title; //제목
	String head; //헤드
	String body; //바디
	
	Comment(String title, String head, String body) {
		this.title = title;
		this.head = head;
		this.body = body;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}