package com.googlecode.jwhois;

import java.io.IOException;

/**
 * 
 * @author Denis Migol
 * 
 */
public class Whois {

	public static final boolean isDomainAvailable(final String domain)
			throws IOException {
		
		return false;
	}

	/**
	 * Test
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.out.println(isDomainAvailable("asdfasdfasdasdfasdf.ru"));
	}
}
