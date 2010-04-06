import java.io.IOException;
import java.net.UnknownHostException;

import com.googlecode.jwhois.Whois;

public class TestDomains {

	private Object[] source;
	private int variationLength;

	public TestDomains(Object[] source, int variationLength) {
		this.source = source;
		this.variationLength = variationLength;
	}

	public Object[][] getVariations() {
		int srcLength = source.length;
		int permutations = (int) Math.pow(srcLength, variationLength);

		Object[][] table = new Object[permutations][variationLength];

		for (int i = 0; i < variationLength; i++) {
			int t2 = (int) Math.pow(srcLength, i);
			for (int p1 = 0; p1 < permutations;) {
				for (int al = 0; al < srcLength; al++) {
					for (int p2 = 0; p2 < t2; p2++) {
						table[p1][i] = source[al];
						p1++;
					}
				}
			}
		}

		return table;
	}

	private static final String toString(final Object[] array) {
		final StringBuilder ret = new StringBuilder();
		for (final Object object : array) {
			ret.append(object);
		}
		return ret.toString();
	}

	private static final boolean doWhileException(final String testDomain) {
		boolean ret = false;
		boolean isExit = false;
		while (!isExit) {
			try {
				ret = Whois.isDomainAvailable(testDomain);
				isExit = true;
			} catch (IOException e) {
			}
		}
		return ret;
	}

	private static final void testDomain(final String domain,
			final String[] tlds) throws UnknownHostException, IOException {
		final StringBuilder ret = new StringBuilder();

		String testDomain;
		for (final String tld : tlds) {
			testDomain = domain + '.' + tld;
			// System.out.println("testing: " + testDomain);
			// if (Whois.isDomainAvailable(testDomain)) {
			if (doWhileException(testDomain)) {
				ret.append(testDomain + ' ');
			}
		}

		if (ret.length() > 0) {
			ret.deleteCharAt(ret.length() - 1);
			System.out.println(ret);
		}
	}

	public static void main(String[] args) throws Exception {
		//final String[] tlds = { "com", "org", "net", "info", "name" };
		final String[] tlds = { "com", "org", "net", };

		final TestDomains gen = new TestDomains(new Character[] { 'a', 'b',
				'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }, 3);

		final Object[][] variations = gen.getVariations();

		for (final Object[] s : variations) {
			// System.out.println(toString(s));
			testDomain(toString(s), tlds);
		}
	}
}
