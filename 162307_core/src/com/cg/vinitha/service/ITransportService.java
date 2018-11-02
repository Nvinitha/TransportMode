package com.cg.vinitha.service;

import java.util.Map;

import com.cg.vinitha.bean.TransportBean;

public interface ITransportService 
{

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);
	

}
