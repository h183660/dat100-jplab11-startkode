package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String URL;

	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.URL = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.URL = url;
	}

	public String getUrl() {
		return URL;

	}

	public void setUrl(String url) {
		this.URL = url;
	}

	@Override
	public String toString() {
		return "BILDE"
		+ "\n" + getId()
		+ "\n" + getBruker()
		+ "\n" + getDato()
		+ "\n" + getLikes()
		+ "\n" + getTekst()
		+ "\n" + getUrl() + "\n";

	}

	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}