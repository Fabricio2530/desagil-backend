package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		double divididoPorSessenta = (double) this.duration/60;
		
		int inteiro = (int) divididoPorSessenta;
		double decimal = divididoPorSessenta - inteiro;
		int resto = 0;
		
		if (decimal > 0.001) {
			 resto = (int) (decimal*60.01); //multipliquei por 60.01 porque estava arredondando sempra pra baixo
		}
		
		String inteiroString = Integer.toString(inteiro);
		String restoString;
		
		if (resto < 10) {
			restoString = '0'+ Integer.toString(resto);
		} else {
			restoString = Integer.toString(resto);
		}
		
		return inteiroString + ':' + restoString;
		
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}
	
	

}
