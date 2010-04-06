package com.googlecode.jwhois;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Denis Migol
 * 
 */
public final class WhoisServers {

	private static final String WHOIS_AFILIAS_INFO = "whois.afilias.info";
	private static final String WHOIS_EDUCAUSE_NET = "whois.educause.net";
	private static final String WHOIS_NEULEVEL_BIZ = "whois.neulevel.biz";
	private static final String WHOIS_NIC_AC = "whois.nic.ac";
	private static final String WHOIS_RIPN_RU = "whois.ripn.ru";
	private static final String WHOIS_VERISIGN_GRS_COM = "whois.verisign-grs.com";

	/**
	 * Don't let anyone instantiate this class.
	 */
	private WhoisServers() {
	}

	private static final Map<String, WhoisServer> WHOIS_SERVERS = new HashMap<String, WhoisServer>();

	static {
		WHOIS_SERVERS.put(WHOIS_RIPN_RU, new WhoisServer(WHOIS_RIPN_RU,
				"No entries found for the selected source(s)."));
		WHOIS_SERVERS.put(WHOIS_VERISIGN_GRS_COM, new WhoisServer(
				WHOIS_VERISIGN_GRS_COM, "No match for"));
		WHOIS_SERVERS.put(WHOIS_NIC_AC, new WhoisServer(WHOIS_NIC_AC,
				"- Available"));
		WHOIS_SERVERS.put(WHOIS_NEULEVEL_BIZ, new WhoisServer(
				WHOIS_NEULEVEL_BIZ, "Not found:"));
		WHOIS_SERVERS.put(WHOIS_EDUCAUSE_NET, new WhoisServer(WHOIS_EDUCAUSE_NET, "No Match"));
		// TODO
		WHOIS_SERVERS.put(WHOIS_AFILIAS_INFO, new WhoisServer(WHOIS_AFILIAS_INFO, "NOT FOUND"));
	}

	private static final Map<String, WhoisServer> DOMAIN_WHOIS_SERVERS = new HashMap<String, WhoisServer>();

	static {
		// TODO
		// ac whois.nic.ac WHOIS_NIC_AC
		DOMAIN_WHOIS_SERVERS.put("ac", WHOIS_SERVERS.get(WHOIS_NIC_AC));
		// ae whois.nic.ae
		// af whois.nic.af
		// ag whois.nic.ag
		// al whois.ripe.net
		// am whois.amnic.net
		// as whois.nic.as
		// at whois.nic.at
		// au whois.aunic.net
		// az whois.ripe.net
		// ba whois.ripe.net
		// be whois.dns.be
		// bg whois.register.bg
		// bi whois.nic.bi
		// biz whois.neulevel.biz
		DOMAIN_WHOIS_SERVERS.put("biz", WHOIS_SERVERS.get(WHOIS_NEULEVEL_BIZ));
		// bj www.nic.bj
		// br whois.nic.br
		// bt whois.netnames.net
		// by whois.ripe.net
		// bz whois.belizenic.bz
		// ca whois.cira.ca
		// cc whois.nic.cc
		// cd whois.nic.cd
		// ch whois.nic.ch
		// ck whois.nic.ck
		// cl nic.cl
		// cn whois.cnnic.net.cn
		// co.nl whois.co.nl
		// com whois.verisign-grs.com
		DOMAIN_WHOIS_SERVERS.put("com", WHOIS_SERVERS
				.get(WHOIS_VERISIGN_GRS_COM)); // "whois.crsnic.net",
		// cx whois.nic.cx
		// cy whois.ripe.net
		// cz whois.nic.cz
		// de whois.denic.de
		// dk whois.dk-hostmaster.dk
		// dm whois.nic.cx
		// dz whois.ripe.net
		// edu whois.educause.net
		DOMAIN_WHOIS_SERVERS.put("edu", WHOIS_SERVERS.get(WHOIS_EDUCAUSE_NET));
		// ee whois.eenet.ee
		// eg whois.ripe.net
		// es whois.ripe.net
		// eu whois.eu
		// fi whois.ficora.fi
		// fo whois.ripe.net
		// fr whois.nic.fr
		// gb whois.ripe.net
		// ge whois.ripe.net
		// gl whois.ripe.net
		// gm whois.ripe.net
		// gov whois.nic.gov
		// gr whois.ripe.net
		// gs whois.adamsnames.tc
		// hk whois.hknic.net.hk
		// hm whois.registry.hm
		// hn whois2.afilias-grs.net
		// hr whois.ripe.net
		// hu whois.ripe.net
		// ie whois.domainregistry.ie
		// il whois.isoc.org.il
		// in whois.inregistry.net
		// info whois.afilias.info
		DOMAIN_WHOIS_SERVERS.put("info", WHOIS_SERVERS.get(WHOIS_AFILIAS_INFO));
		// int whois.isi.edu
		// iq vrx.net
		// ir whois.nic.ir
		// is whois.isnic.is
		// it whois.nic.it
		// je whois.je
		// jp whois.jprs.jp
		// kg whois.domain.kg
		// kr whois.nic.or.kr
		// la whois2.afilias-grs.net
		// li whois.nic.li
		// lt whois.domreg.lt
		// lu whois.restena.lu
		// lv whois.nic.lv
		// ly whois.lydomains.com
		// ma whois.iam.net.ma
		// mc whois.ripe.net
		// md whois.nic.md
		// me whois.nic.me
		// mil whois.nic.mil
		// mk whois.ripe.net
		// mobi whois.dotmobiregistry.net
		// ms whois.nic.ms
		// mt whois.ripe.net
		// mu whois.nic.mu
		// mx whois.nic.mx
		// my whois.mynic.net.my
		// name whois.nic.name
		// net whois.verisign-grs.com
		DOMAIN_WHOIS_SERVERS.put("net", WHOIS_SERVERS
				.get(WHOIS_VERISIGN_GRS_COM));
		// nf whois.nic.cx
		// nl whois.domain-registry.nl
		// no whois.norid.no
		// nu whois.nic.nu
		// nz whois.srs.net.nz
		// org whois.pir.org
		// pl whois.dns.pl
		// pr whois.nic.pr
		// pro whois.registrypro.pro
		// pt whois.dns.pt
		// ro whois.rotld.ro
		// ru whois.ripn.ru
		DOMAIN_WHOIS_SERVERS.put("ru", WHOIS_SERVERS.get(WHOIS_RIPN_RU));
		// sa saudinic.net.sa
		// sb whois.nic.net.sb
		// sc whois2.afilias-grs.net
		// se whois.nic-se.se
		// sg whois.nic.net.sg
		// sh whois.nic.sh
		// si whois.arnes.si
		// sk whois.sk-nic.sk
		// sm whois.ripe.net
		// st whois.nic.st
		// su whois.ripn.net
		// tc whois.adamsnames.tc
		// tel whois.nic.tel
		// tf whois.nic.tf
		// th whois.thnic.net
		// tj whois.nic.tj
		// tk whois.nic.tk
		// tl whois.domains.tl
		// tm whois.nic.tm
		// tn whois.ripe.net
		// to whois.tonic.to
		// tp whois.domains.tl
		// tr whois.nic.tr
		// travel whois.nic.travel
		// tw whois.apnic.net
		// tv whois.nic.tv
		// ua whois.ripe.net
		// uk whois.nic.uk
		// gov.uk whois.ja.net
		// us whois.nic.us
		// uy nic.uy
		// uz whois.cctld.uz
		// va whois.ripe.net
		// vc whois2.afilias-grs.net
		// ve whois.nic.ve
		// vg whois.adamsnames.tc
		// ws www.nic.ws
		// yu whois.ripe.net
	}

	/**
	 * Gets top-level domain
	 * 
	 * @param domain
	 * @return
	 */
	public static String getTLD(final String domain) {
		final int index;
		return (domain == null || (index = domain.lastIndexOf('.') + 1) < 1) ? domain
				: (index < (domain.length())) ? domain.substring(index) : "";
	}

	/**
	 * 
	 * @param domain
	 * @return
	 */
	public static WhoisServer getServer(final String domain) {
		return DOMAIN_WHOIS_SERVERS.get(getTLD(domain));
	}

	public static void main(String[] args) throws Exception {
		final String domain = "hello.info";
		System.out.println(Whois.doQuery(getServer(domain), domain));
	}
}
