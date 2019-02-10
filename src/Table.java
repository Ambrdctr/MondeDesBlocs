import java.util.ArrayList;
import java.util.List;

public class Table {
    public List<Cube> sommetDePile = new ArrayList<Cube> ();

    public Cube existeSommet(TailleCube Taille, Couleur Couleur) {
    	Cube currentCube;
    	for (int i = 0; i < sommetDePile.size(); i++) {
    		currentCube = sommetDePile.get(i);
    		if (currentCube.correspond(Couleur, Taille)) {
    			return currentCube;
    		}
    	}
    	return null;
    }

    public Cube retireSommet(TailleCube Taille, Couleur Couleur) {
    	Cube findedCube = existeSommet(Taille, Couleur);
    	if (findedCube != null) {
    		lacherSommet(findedCube);
    	}
    	return findedCube;
    }

    public boolean lacherSommet(Cube cube) {
    	return sommetDePile.remove(cube);
    }

    public boolean nouveauSommet(Cube cube) {
    	return sommetDePile.add(cube);
    }

    public boolean poserCubeSurCube(TailleCube taille, Couleur couleur, Cube cube) {
    	if (poserPossible(taille, cube.getTaille())) {
    		Cube findedCube = retireSommet(taille, couleur);
        	if (findedCube != null) {
        		cube.precedent(findedCube);
        		nouveauSommet(cube);
        		return true;
        	}
    	}
    	return false;
    }

    public boolean poserPossible(TailleCube taille1, TailleCube taille2) {
    	if (taille1.equals(TailleCube.grand)) {
    		return true;
    	} else if (taille1.equals(TailleCube.moyen) && !taille2.equals(TailleCube.grand)) {
    		return true;
    	} else if (taille1.equals(TailleCube.petit) && taille2.equals(TailleCube.petit)) {
    		return true;
    	}
    	return false;
    }

    public boolean poserCubeSurTable(Cube cube) {
    	return nouveauSommet(cube);
    }

    public Table() {
    	
    }

}
