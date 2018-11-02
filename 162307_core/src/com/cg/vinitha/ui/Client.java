package com.cg.vinitha.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.vinitha.bean.TransportBean;
import com.cg.vinitha.service.ITransportService;
import com.cg.vinitha.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) {
		TransportBean bean = new TransportBean();
		ITransportService service = new TransportServiceImpl();
		Map<String, String> transportDetails = service.getTransportDetails();
		System.out.println("MODE OF TRANSFER");

		int count = 1;
		for (Map.Entry<String, String> entryset : transportDetails.entrySet()) {
			System.out.println(count + ". " + entryset.getValue());
			count++;
		}
		System.out.println("Enter Option");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		int count1 = 1;

		//
		for (Map.Entry<String, String> entryset : transportDetails.entrySet()) {
			if (choice == count1) {
				bean.setTransportCategoryId(entryset.getKey());
			}

			count1++;
		}
		
		int id = (int) (Math.random()*10000);
		bean.setId(id);
		System.out.println("Enter Reason : ");
		scanner.nextLine();
		String reason = scanner.nextLine();
		bean.setReason(reason);
		System.out.println("When:\n1.This Week\n2. Next Week\n3.Next Month");
		int whenchoice = scanner.nextInt();
		if(whenchoice==1)
		{
			bean.setWhen("This Week");
		}
		if (whenchoice ==2) {
			bean.setWhen("Next Week");	
		}
		if (whenchoice ==3) {
			bean.setWhen("Next Month");	
		}
		
		service.addTransport(bean);
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a");
		System.out.println("Booked with id "+ id + "on "+ ldt.format(f));
		
		scanner.close();
		
	}

}
