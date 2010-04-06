package com.googlecode.jwhois;

/**
 * 
 * @author Denis Migol
 * 
 */
public class WhoisServer {

	public static final int DEFAULT_PORT = 43;

	/**
	 * domain name for connect
	 */
	final String domain;

	/**
	 * port for connect
	 */
	final int port; // = DEFAULT_PORT

	/**
	 * contains "available" text
	 */
	final String response;

	/**
	 * 
	 * @param domain
	 * @param response
	 */
	public WhoisServer(final String domain, final String response) {
		this(domain, DEFAULT_PORT, response);
	}

	/**
	 * 
	 * @param domain
	 * @param port
	 * @param response
	 */
	public WhoisServer(final String domain, final int port,
			final String response) {
		super();
		this.domain = domain;
		this.port = port;
		this.response = response;
	}
}
