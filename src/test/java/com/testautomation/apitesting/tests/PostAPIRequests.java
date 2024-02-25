package com.testautomation.apitesting.tests;

import org.testng.annotations.Test;

import net.minidev.json.JSONObject;

public class PostAPIRequests {

	@Test
	public void createBooking() {
		
		//prepare request body
		//also create with pojo method 
		JSONObject booking = new JSONObject();
		JSONObject bookingDates = new JSONObject();
		
		booking.put("firstname", "api testing");
		booking.put("lastname", "tutorial");
		booking.put("totalprice", 1000);
		booking.put("depositpaid", true);
		booking.put("additionalneeds", "breakfast");
		booking.put("bookingdates", bookingDates);
		
		bookingDates.put("checkin", "2023-03-25");
		bookingDates.put("checkout", "2023-03-30");
					
		
		
	}
}
