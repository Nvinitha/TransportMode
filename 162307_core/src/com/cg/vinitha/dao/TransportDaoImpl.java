package com.cg.vinitha.dao;

import java.util.Map;

import com.cg.vinitha.bean.TransportBean;
import com.cg.vinitha.util.DataBase;

public class TransportDaoImpl implements ITransportDao 
{

	
	@Override
	public Map<String, String> getTransportDetails() {
		
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) {
		DataBase.addTransport(bean);
		
	}

}
