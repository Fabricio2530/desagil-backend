package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		super();
		this.id = id;
		this.ratings = new HashMap<>();
		this.tracks = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}
	
	public void addTrack(Track faixa) {
		this.tracks.add(faixa);
	}
	
	public void putRating(String nome, int avaliacao) {
		this.ratings.put(nome, avaliacao);
	}
	
	public double averageRatings() {
		double soma = 0;
		
		for(String nome: this.ratings.keySet()) {
			soma += this.ratings.get(nome);
		}
		
		double media = soma/this.ratings.size();
		
		int inteiro = (int) media;
		double decimal = media - inteiro;
		
		if (decimal < 0.26) {
			return (media - decimal);
		} else if (decimal >= 0.26 && decimal < 0.74) {
			return (inteiro + 0.5);
		} else {
			return (inteiro + 1.0);
		}
	}
}
