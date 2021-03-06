import in.keyboard.Keyboard;

public class Monde {
	
	public static final int rouge = 31;
	public static final int vert = 32;
	public static final int jaune = 33;
	public static final int bleu = 34;
	public static final int violet = 35;
	public static final int cyan = 36;
	public static final int gris = 37;
	public static final int noir = 38;
	
	public static void ecrire(Couleur coul, String s) {
		System.out.printf("\033[%d;1m%s\033[0m\n", coul.ordinal()+31, s);
		// System.out.printf(s);
	}
	
	public static void main(String[] args) {
//		Couleur.testCouleur();
		Table tab = new Table();
		Robot POC3 = new Robot(tab);
		int choix = 1;
		Couleur coul;
		TailleCube tc;
		do {
		System.out.println("1 - creer un cube");
		System.out.println("2 - detruire un cube");
		System.out.println("3 - prendre un cube");
		System.out.println("4 - poser un cube sur la table");
		System.out.println("5 - poser un cube sur un autre cube");
		System.out.println("6 - fin du monde");
		System.out.print("Votre choix : ");
		choix = Keyboard.getInt();
		System.out.println("");
		switch (choix) {
		case 1: 
			System.out.print("Couleur du cube : ");
			coul = Couleur.getCouleur(Keyboard.getString());
			ecrire (coul, "couleur saisie");
			System.out.print("Taille (grand/moyen/petit) : ");
			tc = TailleCube.getTaille(Keyboard.getString());
			POC3.creerCube(tc, coul);
			break;
		case 2:
			System.out.println("Le cube tenu par le robot va etre detruit ");
			Keyboard.pause();
			POC3.detruireCube();
			break;
		case 3:
			System.out.print("Couleur du cube : ");
			coul = Couleur.getCouleur(Keyboard.getString());
			ecrire (coul, "couleur saisie");
			System.out.print("Taille (grand/moyen/petit) : ");
			tc = TailleCube.getTaille(Keyboard.getString());
			POC3.prendreCube(tc, coul);
			break;
		case 4:
			System.out.println("Le cube tenu par le robot va etre pose sur la table ");
			Keyboard.pause();
			POC3.poserCubeSurTable();
			break;
		case 5:
			System.out.print("Couleur du cube : ");
			coul = Couleur.getCouleur(Keyboard.getString());
			ecrire (coul, "couleur saisie");
			System.out.print("Taille (grand/moyen/petit) : ");
			tc = TailleCube.getTaille(Keyboard.getString());
			POC3.poserCubeSurCube(tc, coul);
			break;
		}
		afficherMonde(POC3, tab);
		} while (choix != 6);
	}

	private static void afficherMonde(Robot R, Table T) {
		ecrire(Couleur.noir, "Etat du monde : ");
		R.afficherRobot();
		T.afficherTable();
//		Keyboard.pause();
	
	}
}