
public class Cube {
    private TailleCube Taille;

    public TailleCube getTaille() {
        // Automatically generated method. Please do not modify this code.
        return this.Taille;
    }

    private void setTaille(TailleCube value) {
        // Automatically generated method. Please do not modify this code.
        this.Taille = value;
    }

    private Couleur Couleur;

    private Couleur getCouleur() {
        // Automatically generated method. Please do not modify this code.
        return this.Couleur;
    }

    private void setCouleur(Couleur value) {
        // Automatically generated method. Please do not modify this code.
        this.Couleur = value;
    }

    private int Numero;

    private int getNumero() {
        // Automatically generated method. Please do not modify this code.
        return this.Numero;
    }

    private void setNumero(int value) {
        // Automatically generated method. Please do not modify this code.
        this.Numero = value;
    }

    private Cube dessous;

    public Cube getDessous() {
        // Automatically generated method. Please do not modify this code.
        return this.dessous;
    }

    public void setDessous(Cube value) {
        // Automatically generated method. Please do not modify this code.
        this.dessous = value;
    }

    private Cube dessus;

    public Cube getDessus() {
        // Automatically generated method. Please do not modify this code.
        return this.dessus;
    }

    public void setDessus(Cube value) {
        // Automatically generated method. Please do not modify this code.
        this.dessus = value;
    }

    public void suivant(Cube cube) {
    	setDessous(cube);
    }

    public void precedent(Cube cube) {
    	setDessus(cube);
    }

    public boolean correspond(Couleur couleur, TailleCube taille) {
    	return (getCouleur().equals(couleur) && getTaille().equals(taille));
    }

    public Cube() {
    	setCouleur(Couleur.rouge);
    	setTaille(TailleCube.grand);
    }

    public Cube(TailleCube taille, Couleur couleur) {
    	setTaille(taille);
    	setCouleur(couleur);
    	
    }
    
    public void afficherCube() {
    	
    }

}
