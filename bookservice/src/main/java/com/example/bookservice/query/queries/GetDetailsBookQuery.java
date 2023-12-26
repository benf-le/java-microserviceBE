package com.example.bookservice.query.queries;

public class GetDetailsBookQuery {
	private String bookId;

	
	
	public GetDetailsBookQuery(String bookId) {
		super();
		this.bookId = bookId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
}
