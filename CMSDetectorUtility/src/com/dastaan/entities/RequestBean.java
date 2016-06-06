package com.dastaan.entities;

public class RequestBean {
	
	private String url;
	private String finalUrl;
	public String getFinalUrl() {
		return finalUrl;
	}
	public void setFinalUrl(String finalUrl) {
		this.finalUrl = finalUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = checkAndSetProperUrl(url);
	}

	
	public String checkAndSetProperUrl(String url){
		
		if(url.startsWith("http://")){
			return url;
		}
		else{
			return("http://"+url);
		}
	}
	public RequestBean(String url) {
		this.url = url;
		this.finalUrl="http://isthissitebuiltwithdrupal.com/"+checkAndSetProperUrl(url)+"/";
	}
	
	public RequestBean() {
	}
	

}
