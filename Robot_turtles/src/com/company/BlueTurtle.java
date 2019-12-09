package com.company;

import java.util.ArrayList;
import java.util.List;

public class BlueTurtle extends Turtle{
	private char color;
	private int x; // pos ligne
	private int y; // pos colonne
	private List<Integer> pos = new ArrayList<>();
	private char direction; // t -> top , b -> bot , l -> left , r -> right
	
	public BlueTurtle(char color) {
		super(color);
		this.color='b';
		if(nbJoueur==3) {
			this.pos=pos[7,3]; // Position par d�faut quand 3 joueurs
		}
		else if(nbJoueur==4) {
			this.pos=pos[7,2]; // Position par d�faut quand 4 joueurs
		}
		this.direction='b';
	}
	
}
