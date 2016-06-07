package com.dastaan.testing;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import com.dastaan.entities.RequestBean;
import com.dastaan.utilities.CMSUtility;

public class Test {

	
	public static void main(String[] args) throws Exception {

		CMSUtility cms= new CMSUtility();
		File f = new File("resources/Links.txt");
		System.out.println("procedding");
		ArrayList<RequestBean> rbList=(ArrayList<RequestBean>) cms.getRbListfromFile(f);
		for(RequestBean r:rbList){
			System.out.println(r);
		}
		
		
		
		}
	}

