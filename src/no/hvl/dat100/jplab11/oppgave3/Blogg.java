package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggTabell;
	private int nesteLedig;

	public Blogg() {
		innleggTabell = new Innlegg[20];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}

	public Innlegg[] getSamling() {
		return innleggTabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig;) {
			if (innleggTabell[i].erLik(innlegg)) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig;) {
			if (innleggTabell[i].erLik(innlegg)) {
				return true;
			} else {
				i++;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		if (nesteLedig < innleggTabell.length) {
			return true;
		} else {
			return false;
		}
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg) == -1;
		if(ny && nesteLedig < innleggTabell.length){
			innleggTabell[nesteLedig] = innlegg;
			nesteLedig++;
		}
		return ny;
	}

	public String toString() {
		String s = nesteLedig + "\n";
		for (int i = 0; i < nesteLedig; i++) {
			s += innleggTabell[i].toString();
		}
		return s;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}