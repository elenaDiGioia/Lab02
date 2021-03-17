package it.polito.tdp.alien;

import java.util.HashMap;
import java.util.Map;

public class AlienDictionary {
	Map<String,Word> parole= new HashMap<String,Word>();
	
	
	public void addWord(String alienWord, String translation) {
		if (parole.get(alienWord)==null) {
			Word daAggiungere= new Word(alienWord, translation);
			parole.put(alienWord, daAggiungere);
		}
		else {
			parole.get(alienWord).setTranslation(translation);
		}
}
	
	public String translateWord(String alienWord) {
		if (parole.get(alienWord)!=null) 
			return parole.get(alienWord).getTranslation();
		else return null;
	}
}