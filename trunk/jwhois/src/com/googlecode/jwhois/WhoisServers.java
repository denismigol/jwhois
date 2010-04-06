package com.googlecode.jwhois;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Denis Migol
 * 
 */
public final class WhoisServers {

	/**
	 * Don't let anyone instantiate this class.
	 */
	private WhoisServers() {
	}

	private static final Map<String, WhoisServer> SERVERS = new HashMap<String, WhoisServer>();

	static {
		SERVERS.put("com", new WhoisServer("whois.verisign-grs.com", ""));
	}
}
