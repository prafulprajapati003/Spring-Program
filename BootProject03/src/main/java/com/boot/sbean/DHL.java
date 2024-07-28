package com.boot.sbean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier{

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid + " Order items are kept for delivery by DHL";
	}

}
