import java.io.*;

public enum Couleur
{
 rouge, vert, jaune, bleu, violet, cyan, blanc, noir, reset;
 
 public static Couleur getCouleur(String coulSaisie) {
		for (Couleur c:Couleur.values())
			if (c.name().equalsIgnoreCase(coulSaisie))
				return c;		
		return Couleur.rouge;
 }

 public static String getANSI(Couleur c) {
	switch(c) {
		case rouge: return "\u001B[31m";
		case vert: return "\u001B[32m";
		case jaune: return "\u001B[33m";
		case bleu: return "\u001B[34m";
		case violet: return "\u001B[35m";
		case cyan: return "\u001B[36m";
		case blanc: return "\u001B[37m";
		case noir: return "\u001B[30m";
		default:
			return "\u001B[0m";
	}
 }


}

