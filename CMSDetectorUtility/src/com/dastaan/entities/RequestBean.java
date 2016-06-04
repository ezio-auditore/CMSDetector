package com.dastaan.entities;

public class RequestBean {
	
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = checkAndGetProperUrl(url);
	}

	
	public String checkAndGetProperUrl(String url){
		
		if(url.startsWith("http://")){
			return url;
		}
		else{
			return("http://"+url);
		}
	}
	public RequestBean(String url) {
		this.url = url;
	}
	
	public RequestBean() {
	}
	

}
