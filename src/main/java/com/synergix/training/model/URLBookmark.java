package com.synergix.training.model;



public class URLBookmark {
	String url;

	public URLBookmark(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return url;
	}
	
}
