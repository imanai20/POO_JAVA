package fin;

public class Personnages {
String nom;
int PV;
int dégats;
int défense;

public Personnages(String n , int pv,int dg,int df) {
this.nom = n;
this.PV = pv;
this.dégats = dg;
this.défense = df;}


	
public void attaquer(Personnages a) {
    int degats = this.PV - a.getDefense();
    if (degats > 0) {
        a.subirDegats(degats);
    }
}
protected int getDefense() {
	return PV;

}

public void subirDegats(int degats) {
    this.PV -= degats;
}
}


 
    
    