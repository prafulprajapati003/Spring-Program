package com.boot.sbean;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public class Flipkart {
	@Autowired
	@Qualifier("shipment")
	private Courier courier;// Has-A Property


	// business method
	public String shopping(String items[], Double[] prices) {
		// calculate bill
		double billAmount = 0.0;
		for (double p : prices) {
			billAmount += p;
		}
		// generate order id
		int oid = new Random().nextInt(10000);

		String msg = courier.deliver(oid);

		return Arrays.toString(items) + " items and prices" + Arrays.toString(prices) + " with BillAmount:::"
				+ billAmount + " " + msg;
	}

}
