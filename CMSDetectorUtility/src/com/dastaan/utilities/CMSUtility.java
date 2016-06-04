package com.dastaan.utilities;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.dastaan.entities.RequestBean;

public class CMSUtility {
	
	private boolean isDrupal;

	public boolean isDrupal() {
		return isDrupal;
	}

	public void setDrupal(boolean isDrupal) {
		this.isDrupal = isDrupal;
	}
	
	public static  boolean checkDrupal(RequestBean rb) {
		Document doc=null;
		if(rb.getUrl()!=null){
			
			try {
				doc = Jsoup.connect(rb.getUrl()).get();
			} catch (IOException e) {
				System.err.println("Service unavailable");
				e.printStackTrace();
			}
			if(doc.getElementById("likely")!=null){
				return true;
			}
			
		}
		return false;
	}
	public static boolean isConnected(){
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.err.println("No internet connection");
			return false;
		}
		return true;
	}
}
