package com.cg.vinitha.dao;

import java.util.Map;

import com.cg.vinitha.bean.TransportBean;

public interface ITransportDao {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);

}
