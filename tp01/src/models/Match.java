package models;


public class Match {


	private Joueur joueur1;
	private Joueur joueur2;
	private Joueur vainqueur;
	private Joueur vaincu;
	
    // constructeur de match
	
	public Match(Joueur joueur1, Joueur joueur2) {
		super();
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
	}

    // getters et setters

	

	public Joueur getJoueur1() {
		return joueur1;
	}


	public Joueur getJoueur2() {
		return joueur2;
	}



    // methode setVainqueur

	public Joueur setVainqueur(Joueur joueur1 , Joueur joueur2) throws java.lang.IllegalArgumentException {
		
		if (joueur1.getNombrePoint() >joueur2.getNombrePoint()) {
			return joueur1;
		}
		else if(joueur1.getNombrePoint() < joueur2.getNombrePoint()) {
			return joueur2;
		}
		else {
			return null;
		}
		
	}

    // methode getVainqueur 



	public Joueur getVainqueur  ()throws java.lang.IllegalStateException {
		
			return this.vainqueur;
		
		
	}

    // methode getVaincu
	
	public Joueur getVaincu() throws java.lang.IllegalStateException{
		
		return this.vaincu;
		
		
	}

}