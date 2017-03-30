package com.synergix.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="urlbean")
@SessionScoped
public class URLBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String bookmarkURL;

	public String getBookmarkURL() {
		return bookmarkURL;
	}

	public void setBookmarkURL(String bookmarkURL) {
		this.bookmarkURL = bookmarkURL;
	}
	

}
