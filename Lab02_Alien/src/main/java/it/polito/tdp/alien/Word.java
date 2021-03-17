package it.polito.tdp.alien;

public class Word {
	private String alienWord;
	private String translation;
	
	
	public Word(String alienWord, String translation) {
		
		this.alienWord = alienWord;
		this.translation = translation;
	}


	@Override
	public boolean equals(Object obj) {
		String s= (String) obj;
		if (this.alienWord.compareTo(s.toLowerCase())==0) 
			return true;
		else return false;
	
	}


	public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public String getTranslation() {
		return translation;
	}


	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	

}
