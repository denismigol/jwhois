package com.googlecode.jwhois;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @author Denis Migol
 * 
 */
public class Whois {

	static final String doQuery(final WhoisServer server,
			final String query) throws UnknownHostException, IOException {
		final Socket socket = new Socket(server.domain, server.port);
		final String lineSeparator = "\r\n";

		final PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println(query);
		out.flush();
//		out.close();

		final BufferedReader in = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		final StringBuilder ret = new StringBuilder();
		String line;
		while ((line = in.readLine()) != null) {
			ret.append(line + lineSeparator);
		}
		socket.close();
		return ret.toString();
	}

	public static final boolean isDomainAvailable(final String domain) throws UnknownHostException, IOException {
		final WhoisServer server = WhoisServers.getServer(domain);
		return doQuery(server, domain).contains(server.response);
	}

	/**
	 * Test
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
//		System.out.println(isDomainAvailable("google.ru"));
//		System.out.println(isDomainAvailable("migool.net.ru"));
//		System.out.println(isDomainAvailable("migol.ru"));
//		System.out.println(isDomainAvailable("asdfasdfasdasdfasdf.ru"));
		System.out.println(isDomainAvailable("amigo.net.ru"));
	}
}
