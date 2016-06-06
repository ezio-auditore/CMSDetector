package com.dastaan.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.dastaan.entities.RequestBean;

public class CMSUtility {
	

	
	public static  boolean checkDrupal(String url) {
		Document doc=null;
		
		if(url!=null){
			
			try {
				System.out.println(url);
				doc = Jsoup.connect(url).get();
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
	
	public List<RequestBean> getRbListfromFile(File f) throws IOException{
		List<RequestBean> rbList = new ArrayList<RequestBean>();
			Scanner read = new Scanner (f);
			read.useDelimiter("\n");
			while(read.hasNext()){
				String nextUrl= read.next();
				System.out.println(nextUrl);
				if(CMSUtility.checkDrupal("http://isthissitebuiltwithdrupal.com/"+"http://"+nextUrl+"/")){
					System.out.println("is a drupal");
					rbList.add(new RequestBean(nextUrl));
					}
			}
			read.close();
		return rbList;
		
	}
}
