package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;

	@BeforeEach
	void setUp() {
	}

	@Test
	void testRoundDownToZero() {
		Artist loona = new Artist("LOONA");
		Track butterfly = new Track(loona, "Butterfly", 255);
		
		Playlist maisOuvidas = new Playlist(0);
		maisOuvidas.addTrack(butterfly);
		maisOuvidas.putRating("Joao", 2);
		maisOuvidas.putRating("Jonas", 1);
		maisOuvidas.putRating("Ana", 3);
		maisOuvidas.putRating("Eduardo", 3);
		assertEquals(2.0, maisOuvidas.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		Artist loona = new Artist("LOONA");
		Track butterfly = new Track(loona, "Butterfly", 255);
		
		Playlist maisOuvidas = new Playlist(0);
		maisOuvidas.addTrack(butterfly);
		maisOuvidas.putRating("Joao", 2);
		maisOuvidas.putRating("Jonas", 1);
		maisOuvidas.putRating("Eduardo", 1);
		
		assertEquals(1.5, maisOuvidas.averageRatings(), DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		Artist loona = new Artist("LOONA");
		Track butterfly = new Track(loona, "Butterfly", 255);
		
		Playlist maisOuvidas = new Playlist(0);
		maisOuvidas.addTrack(butterfly);
		maisOuvidas.putRating("Joao", 2);
		maisOuvidas.putRating("Jonas", 2);
		maisOuvidas.putRating("Eduardo", 1);
		
		assertEquals(1.5, maisOuvidas.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToOne() {
		Artist loona = new Artist("LOONA");
		Track butterfly = new Track(loona, "Butterfly", 255);
		
		Playlist maisOuvidas = new Playlist(0);
		maisOuvidas.addTrack(butterfly);
		maisOuvidas.putRating("Joao", 2);
		maisOuvidas.putRating("Jonas", 1);
		maisOuvidas.putRating("Eduardo", 1);
		maisOuvidas.putRating("Fabricio", 3);
		
		assertEquals(2.0, maisOuvidas.averageRatings(), DELTA);
	}
}
