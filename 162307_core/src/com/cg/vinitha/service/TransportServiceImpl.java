package com.cg.vinitha.service;

import java.util.Map;

import com.cg.vinitha.bean.TransportBean;
import com.cg.vinitha.dao.ITransportDao;
import com.cg.vinitha.dao.TransportDaoImpl;

public class TransportServiceImpl implements ITransportService {

	ITransportDao dao = new TransportDaoImpl();
	@Override
	public Map<String, String> getTransportDetails() {
	
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean bean) {
		dao.addTransport(bean);
		
	}

}
