package com.dastaan.testing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.dastaan.entities.RequestBean;
import com.dastaan.utilities.CMSUtility;

public class Test {

	
	public static void main(String[] args) throws Exception {
		if(CMSUtility.isConnected()){
			System.out.println("Connection made....");
		}
		RequestBean rb= new RequestBean("www.facebook.com");
		//rb.setUrl("www.conversantmedia.com");
		System.out.println(rb.getFinalUrl());
		Document doc = Jsoup.connect(rb.getFinalUrl()).get();
		Elements aList = doc.select("a");
		System.out.println(aList);
	
			if(doc.getElementById("likely")!=null){
				System.out.println("Yes");
			}
			else{
				System.out.println("NO");
			}
		}
	}

