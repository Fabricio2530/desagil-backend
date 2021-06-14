package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> listaDeArtistas) {
		super(artist, name, duration);
		this.collaborators = listaDeArtistas;
	}
	
	@Override
	public String getFullArtistName() {
		String nomeCompleto = this.getArtist().getName() + " (feat. ";
		
		List<String> listaNomes = new ArrayList<>();
		
		for (Artist artista: this.collaborators) {
			listaNomes.add(artista.getName());
		}
		
		String features = String.join(", ", listaNomes);
		
		nomeCompleto += (features + ')');
		
		return nomeCompleto;
		
	}

}
