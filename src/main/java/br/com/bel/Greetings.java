package br.com.bel;

public class Greetings {
	private final long id;
	private final String content;

	public Greetings(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public long getId() {
		return id;
	}
}
