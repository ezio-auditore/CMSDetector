package com.dastaan.entities;

public class RequestBean {
	
	private String url;
	private String finalUrl;
	
	private boolean isDrupal;

	public boolean isDrupal() {
		return isDrupal;
	}

	public void setDrupal(boolean isDrupal) {
		this.isDrupal = isDrupal;
	}
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
		this.url = url;
	}

	
	public static  String checkAndSetProperUrl(String url){
		
		if(url.startsWith("http://")){
			return url;
		}
		else{
			return("http://"+url);
		}
	}
	public RequestBean(String url) {
		this.isDrupal=false;
		this.url = url;
	}
	
	public RequestBean() {
	}

	@Override
	public String toString() {
		return "RequestBean [url=" + url + ", finalUrl=" + finalUrl + ", isDrupal=" + isDrupal + "]";
	}

	

}
