package com.synergix.bean;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import org.apache.commons.validator.UrlValidator;

import com.synergix.training.model.URLBookmark;


@FacesConverter("com.synergix.bean.URLConvert")
public class URLConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String HTTP = "http://";
		StringBuilder url = new StringBuilder();
		
		//if not start with http://, then add it
		if (!value.startsWith(HTTP, 0)){
			url.append(HTTP);
		}
		url.append(value);
		System.out.println("url input: "+url);
		
		//use Apache common URL validator to validate URL
		UrlValidator urlValidator = new UrlValidator();
		//if url is invalid
//		if(!urlValidator.isValid(url.toString())){
		if(!url.toString().equals("http://123.com")){
			FacesMessage msg = new FacesMessage("URL Conversion error.",
					"Invalid URL format");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ConverterException(msg);
		}
		
		URLBookmark urlBookmark = new URLBookmark(url.toString());
		return urlBookmark;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		return value.toString();
	}

}
