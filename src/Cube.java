import com.sun.org.apache.xpath.internal.operations.Bool;

public class Cube {
    private TailleCube Taille;

    private TailleCube getTaille() {
        // Automatically generated method. Please do not modify this code.
        return this.Taille;
    }

    private void setTaille(TailleCube value) {
        // Automatically generated method. Please do not modify this code.
        this.Taille = value;
    }

    private String Couleur;

    private String getCouleur() {
        // Automatically generated method. Please do not modify this code.
        return this.Couleur;
    }

    private void setCouleur(String value) {
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
    	// On part du principe que l'on set le suivant de la liste mais que c'est celui en dessous physiquement
    	this.setDessous(cube);
    }

    public void precedent(Cube cube) {
    	// On part du principe que l'on set le precedent de la liste mais que c'est celui en dessus physiquement
    	this.setDessus(cube);
    }

    public Bool correspond(String couleur, TailleCube taille) {
    	return this.getCouleur().equals(couleur) && this.getTaille().equals(taille);
    }

}
