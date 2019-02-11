
public class Robot {
    public Cube cubeTenu;
    private Table table;

    public boolean creerCube(TailleCube taille, Couleur couleur) {
    	if (pinceLibre()) {
    		return tenirCube(new Cube(taille,couleur));
    	}
    	return false;
    }

    public boolean pinceLibre() {
    	return (cubeTenu == null);
    }

    public boolean tenirCube(Cube CubeATenir) {
    	cubeTenu = CubeATenir;
    	return true;
    }

    public boolean detruireCube() {
    	return (!pinceLibre() && lacherCube());
    }

    public boolean lacherCube() {
    	cubeTenu = null;
    	return true;
    }

    public boolean prendreCube(TailleCube taille, Couleur couleur) {
    	if (pinceLibre()) {
    		return tenirCube(table.retireSommet(taille, couleur));
    	}
    	return false;
    }

    public boolean poserCubeSurCube(TailleCube taille, Couleur couleur) {
    	if (!pinceLibre()) {
    		table.poserCubeSurCube(taille, couleur, cubeTenu);
    		return lacherCube();
    	}
    	return false;
    }

    public boolean poserCubeSurTable() {
    	if (!pinceLibre()) {
    		table.poserCubeSurTable(cubeTenu);
    		return lacherCube();
    	}
    	return false;
    }

    public Robot() {
    	cubeTenu = null;
    	table = null;
    }

    public Robot(Table table) {
    	cubeTenu = null;
    	this.table = table;
    }
    
    public void afficherRobot() {
    	System.out.println("Robot : ");
    	if (!pinceLibre()) {
    		System.out.println(cubeTenu.getTaille() + ", " + cubeTenu.getCouleur());
    	}
    	
    }

}
