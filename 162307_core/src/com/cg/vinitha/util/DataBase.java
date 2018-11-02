package com.cg.vinitha.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.vinitha.bean.TransportBean;

public class DataBase 
{
	private static Map<String, String> transportDetails = new HashMap<>();
	private static Map<Integer,TransportBean> bookTransport = new HashMap<>();
	public static Map<String, String> getTransportDetails() 
	{
		transportDetails.put("F-1", "Flight");
		transportDetails.put("T-2", "Train");
		transportDetails.put("Ta-1", "Taxi");
		
		return transportDetails;
	}
	public static void addTransport(TransportBean bean) 
	{
		bookTransport.put(bean.getId(), bean);
		
	}
	

}
