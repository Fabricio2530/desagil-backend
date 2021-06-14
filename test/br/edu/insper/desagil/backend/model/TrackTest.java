package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	@BeforeEach
	void setUp() {
	}

	@Test
	void testZeroSeconds() {
		Artist anitta = new Artist("Anitta");
		Track vaiMalandra = new Track(anitta, "Vai Malandra", 0);
		assertEquals("0:00", vaiMalandra.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		Artist paramore = new Artist("Paramore");
		Track playingGod = new Track(paramore, "Playing God", 5);
		assertEquals("0:05", playingGod.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		Artist cardiB = new Artist("Cardi B");
		Track up = new Track(cardiB, "Up", 25);
		assertEquals("0:25", up.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Artist dojaCat = new Artist("Doja Cat");
		Track saySo = new Track(dojaCat, "Say So", 60);
		assertEquals("1:00", saySo.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Artist titans = new Artist("Titãs");
		Track epitafio = new Track(titans, "Epitafio", 65);
		
		assertEquals("1:05", epitafio.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Artist txt = new Artist("Tomorrow x Together");
		Track blueHour = new Track(txt, "Blue Hour", 85);
		assertEquals("1:25", blueHour.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Artist loona = new Artist("LOONA");
		Track whyNot = new Track(loona, "Why Not", 120);
		assertEquals("2:00", whyNot.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Artist fromisNine = new Artist("Fromis 9");
		Track weGo = new Track(fromisNine, "We Go", 140);
		assertEquals("2:20", weGo.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Artist oliviaRodrigo = new Artist("Olivia Rodrigo");
		Track dejaVu = new Track(oliviaRodrigo, "Deja Vu", 145);
		assertEquals("2:25", dejaVu.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		Artist anitta = new Artist("Anitta");
		Artist beckyG = new Artist("Becky G");
		
		List<Artist> listaDeArtistas = new ArrayList<>();
		listaDeArtistas.add(beckyG);
		
		CollaborationTrack anittaBeckyG = new CollaborationTrack(anitta, "Medicina", 240, listaDeArtistas);
		assertEquals("Anitta (feat. Becky G)", anittaBeckyG.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		Artist anitta = new Artist("Anitta");
		Artist ludmilla = new Artist("Ludmilla");
		Artist  snoopDog = new Artist("Snoop Dog");
		
		List<Artist> listaDeArtistas = new ArrayList<>();
		listaDeArtistas.add(ludmilla);
		listaDeArtistas.add(snoopDog);
		
		CollaborationTrack anittaLudmillaSnoopDog = new CollaborationTrack(anitta, "Paradinha", 240, listaDeArtistas);
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", anittaLudmillaSnoopDog.getFullArtistName());
	}
}
