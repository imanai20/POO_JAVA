package fin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Personnages p = new Personnages("Tito",20,35,9);
Personnages p1 = new Personnages("Bobby",90,33,78);
Personnages p2 = new Personnages("SO",100,97,67);
Personnages p3 = new Personnages("Fresh",900,900,55);
Personnages p4 = new Personnages("ATH",149,35,80);

objet o = new objet ("bâton");
objet o1 = new objet ("épée");
objet o2 = new objet ("potion");
objet o3 = new objet ("lame");
objet o4 = new objet ("bouteille");


salle s = new salle ("Platine");
salle s1 = new salle ("Or");
salle s2 = new salle ("Bronze");


donjon d = new donjon ("les Grottes de Culte Froid");




boss b = new boss(null, 0, 0, 0);

RFC r = new RFC (null,0,0,0);

SIR si = new SIR (null,0,0,0);

ArrayList<String> obj = new ArrayList<>();
obj.add("bâton");
obj.add("épée");
obj.add("potion");
obj.add("lame");
obj.add("bouteille");
System.out.println("Au cours de votre aventure vous devrez récuperer tous ces objets pour pouvoir gagner : "+ obj);

String userName;
do {
Scanner myObj = new Scanner(System.in);
System.out.println("Choisit entre les différents personnages :Tito // Bobby // SO // Fresh // ATH"); 
userName = myObj.nextLine();
System.out.println("Personnages chosit est" +" "+ userName);

if (userName.contains("Tito")) {System.out.println("Je suis "+" "+p.nom+" //"+"J'ai"+" "+p.PV+"PV"+" //"+"Je fais"+" "+p.dégats+" avec mon attaque"+" //"+"Je défends"+" "+p.défense+" ");
} 
else if (userName.contains("Bobby")) {System.out.println("Je suis "+" "+p1.nom+" //"+"J'ai"+" "+p1.PV+"PV"+" //"+"Je fais"+" "+p1.dégats+" avec mon attaque"+" //"+"Je défends"+" "+p1.défense+" ");
		
}
else if (userName.contains("SO")) 
{System.out.println("Je suis "+" "+p2.nom+" //"+"J'ai"+" "+p2.PV+"PV"+" //"+"Je fais "+p2.dégats+" avec mon attaque"+" //"+"Je défends"+" "+p2.défense+" ");
}
else if(userName.contains("Fresh")) 
	{System.out.println("Je suis "+" "+p3.nom+" //"+"J'ai"+" "+p3.PV+"PV"+" //"+"Je fais"+" "+p3.dégats+" avec mon attaque"+" //"+"Je défends"+" "+p3.défense+" ");
}
	else if (userName.contains("ATH")) 
	{System.out.println("Je suis "+" "+p4.nom+" //"+"J'ai"+" "+p4.PV+"PV"+" //"+"Je fais"+" "+p4.dégats+" avec mon attaque"+" //"+"Je défends "+p4.défense+" ");
}

else{System.out.println("ERREUR NOM INCORRECT VEUILLEZ REESSAYER");
}
}while(!userName.contains("Tito")&&!userName.contains("Bobby")&&!userName.contains("SO")&&!userName.contains("Fresh")&&!userName.contains("ATH"));

String Salle;
do {
Scanner myDon = new Scanner(System.in);
System.out.println("DONJON");
System.out.println("Bienvenue dans les Grottes de Culte Froid " );
System.out.println("Choisit une salle (en toutes lettres)");
System.out.println("(1) Platine // (2) Or //  (3) Bronze");
Salle = myDon.nextLine();

if (Salle.contains("Platine")) {System.out.println("Vous allez être déporter dans  "+ s.nom);
} 
else System.out.println("Veuillez commencer par la salle 1");
}while(!Salle.contains("Platine"));
System.out.println("Le combat peut commencer");

if(userName.contains("Tito")) {
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();
    if (Numb.equals("1")) {
        p.attaquer(si);
       si.attaquer(p);
        System.out.println("ATTAQUE EN COURS");

        if (p.PV < 0) {
            p.PV = 0;
        }

        if (si.PV < 0) {
            si.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + si.PV);
        System.out.println("BOSS 1 " + " PV restant pour le personnage : " + p.PV);

        if (p.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(si.PV <= 0) {
            System.out.println("BOSS 1 est mort,vous avez gagné une lame , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p.PV >= 0 || si.PV >= 0);
}
else if (userName.contains("Bobby")) {
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p1.attaquer(si);
       si.attaquer(p1);
        System.out.println("ATTAQUE EN COURS");

        if (p1.PV < 0) {
            p1.PV = 0;
        }

        if (si.PV < 0) {
            si.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + si.PV);
        System.out.println("PERSONNAGES " + " PV restant pour le personnage : " + p1.PV);

        if (p1.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(si.PV <= 0) {
            System.out.println("BOSS 1 est mort,vous avez gagné une lame , Donjon ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p1.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p1.PV >= 0 || si.PV >= 0);
}

else if (userName.contains("SO")){
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p2.attaquer(si);
       si.attaquer(p2);
        System.out.println("ATTAQUE EN COURS");

        if (p2.PV < 0) {
            p2.PV = 0;
        }

        if (si.PV < 0) {
            si.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + si.PV);
        System.out.println("BOSS 1 " + " PV restant pour le personnage : " + p2.PV);

        if (p2.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(si.PV <= 0) {
            System.out.println("BOSS 1 est mort,vous avez gagné une lame , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p2.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p2.PV >= 0 || si.PV >= 0);
}


else if (userName.contains("Fresh")){
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p3.attaquer(si);
       si.attaquer(p3);
        System.out.println("ATTAQUE EN COURS");

        if (p3.PV < 0) {
            p3.PV = 0;
        }

        if (si.PV < 0) {
            si.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + si.PV);
        System.out.println("BOSS 1 " + " PV restant pour le personnage : " + p3.PV);

        if (p3.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(si.PV <= 0) {
            System.out.println("BOSS 1 est mort,vous avez gagné une lame , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p3.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p3.PV >= 0 || si.PV >= 0);
}

else if (userName.contains("ATH")){
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p4.attaquer(si);
       si.attaquer(p4);
        System.out.println("ATTAQUE EN COURS");

        if (p4.PV < 0) {
            p4.PV = 0;
        }

        if (si.PV < 0) {
            si.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + si.PV);
        System.out.println("BOSS 1 " + " PV restant pour le personnage : " + p4.PV);

        if (p4.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(si.PV <= 0) {
            System.out.println("BOSS 1 est mort,vous avez gagné une lame , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p4.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p4.PV >= 0 || si.PV >= 0);
}
else {System.out.println("Il y a un problème");}

if(p.PV>0 && p1.PV>0 && p2.PV>0 && p3.PV>0 && p4.PV>0){
	do {
		Scanner myDon = new Scanner(System.in);
		System.out.println("Bienvenue dans les Grottes de Culte Froid " );
		System.out.println("Choisit une autre salle");
		System.out.println("(1) Platine // (2) Or //  (3) Bronze");
		Salle = myDon.nextLine();

		if (Salle.contains("Or")) {System.out.println("Vous allez être déporter dans  "+ s1.nom);
		} 
		else if(Salle.contains("Platine")) System.out.println("Salle déjà effectuée");
		else System.out.println("Veuillez choisir les salles dans l'ordre" );
		}while(!Salle.contains("Or"));
System.out.println("Le combat peut commencer");
} else {System.out.println("PERDU") ;}
if(userName.contains("Tito")) {
String Numb;
Scanner myNum = new Scanner(System.in);
System.out.println("T'as que 2 objets :"+o.nom+" "+o2.nom);
System.out.println("Changes de personnages");
System.exit(0);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p.attaquer(b);
       b.attaquer(p);
        System.out.println("ATTAQUE EN COURS");

        if (p.PV < 0) {
            p.PV = 0;
        }

        if (b.PV < 0) {
            b.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + b.PV);
        System.out.println("BOSS 2 " + " PV restant pour le personnage : " + p.PV);

        if (p.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(b.PV <= 0) {
            System.out.println("BOSS 2 est mort,vous avez gagné une lame , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p.PV >= 0 || b.PV >= 0);
}
else if (userName.contains("Bobby")) {
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p1.attaquer(b);
       b.attaquer(p1);
        System.out.println("ATTAQUE EN COURS");

        if (p1.PV < 0) {
            p1.PV = 0;
        }

        if (b.PV < 0) {
            b.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + b.PV);
        System.out.println("BOSS 2 " + " PV restant pour le personnage : " + p1.PV);

        if (p1.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(b.PV <= 0) {
            System.out.println("BOSS 2 est mort,vous avez gagné une bouteille , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p1.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p1.PV >= 0 || b.PV >= 0);
}

else if (userName.contains("SO")){
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p2.attaquer(b);
       b.attaquer(p2);
        System.out.println("ATTAQUE EN COURS");

        if (p2.PV < 0) {
            p2.PV = 0;
        }

        if (b.PV < 0) {
            b.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + b.PV);
        System.out.println("BOSS 2 " + " PV restant pour le personnage : " + p2.PV);

        if (p2.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(b.PV <= 0) {
            System.out.println("BOSS 2 est mort,vous avez gagné une bouteille , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p2.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p2.PV >= 0 || b.PV >= 0);
}


else if (userName.contains("Fresh")){
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p3.attaquer(b);
       b.attaquer(p3);
        System.out.println("ATTAQUE EN COURS");

        if (p3.PV < 0) {
            p3.PV = 0;
        }

        if (b.PV < 0) {
            b.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + b.PV);
        System.out.println("BOSS 2 " + " PV restant pour le personnage : " + p3.PV);

        if (p3.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(b.PV <= 0) {
            System.out.println("BOSS 2 est mort,vous avez gagné une bouteille , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p3.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p3.PV >= 0 || b.PV >= 0);
}

else if (userName.contains("ATH")){
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p4.attaquer(b);
       b.attaquer(p4);
        System.out.println("ATTAQUE EN COURS");

        if (p4.PV < 0) {
            p4.PV = 0;
        }

        if (b.PV < 0) {
            b.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + b.PV);
        System.out.println("BOSS 2 " + " PV restant pour le BOSS : " + p4.PV);

        if (p4.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(b.PV <= 0) {
            System.out.println("BOSS 2 est mort,vous avez gagné une bouteille , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p4.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p4.PV >= 0 || b.PV >= 0);
}
else {System.out.println("Il y a un problème");}

if(p.PV>0 && p1.PV>0 && p2.PV>0 && p3.PV>0 && p4.PV>0 ) {
	do {
		Scanner myDon = new Scanner(System.in);
		System.out.println("Bienvenue dans les Grottes de Culte Froid " );
		System.out.println("Choisit une autre salle");
		System.out.println("(1) Platine // (2) Or //  (3) Bronze");
		Salle = myDon.nextLine();

		if (Salle.contains("Bronze")) {System.out.println("Vous allez être déporter dans  "+ s2.nom);
		} 
		else if (Salle.contains("Or")||Salle.contains("Platine")) System.out.println("Salle déjà effectuée");
		else System.out.println("Veuillez récrire votre salle");
		}while(!Salle.contains("Bronze"));
System.out.println("Le combat peut commencer");
}else {System.out.println("PERDU");}
if(userName.contains("Tito")) {
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p.attaquer(si);
       si.attaquer(p);
        System.out.println("ATTAQUE EN COURS");

        if (p.PV < 0) {
            p.PV = 0;
        }

        if (r.PV < 0) {
            r.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + r.PV);
        System.out.println("BOSS 3" + " PV restant pour: "+ p.PV);

        if (p.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(r.PV <= 0) {
            System.out.println("BOSS 3 est mort,vous avez gagné une épée , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p.PV >= 0 || r.PV >= 0);
}
else if (userName.contains("Bobby")) {
String Numb;
Scanner myNum = new Scanner(System.in);
System.out.println("T'as que 3 objets :"+o.nom+" "+o2.nom+" "+o3.nom);
System.out.println("Changes de personnages");
System.exit(0);
do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();
    if (Numb.equals("1")) {
        p1.attaquer(r);
       r.attaquer(p1);
        System.out.println("ATTAQUE EN COURS");

        if (p1.PV < 0) {
            p1.PV = 0;
        }

        if (r.PV < 0) {
            r.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + r.PV);
        System.out.println("BOSS 3" + " PV restant pour: "+ p1.PV);

        if (p1.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(r.PV <= 0) {
            System.out.println("BOSS 3 est mort,vous avez gagné une épée , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p1.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p1.PV >= 0 || r.PV >= 0);
}

else if (userName.contains("SO")){
String Numb;
Scanner myNum = new Scanner(System.in);
System.out.println("T'as que 3 objets :"+o.nom+" "+o2.nom+" "+o3.nom);
System.out.println("Changes de personnages");
System.exit(0);
do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p2.attaquer(r);
       r.attaquer(p2);
        System.out.println("ATTAQUE EN COURS");

        if (p2.PV < 0) {
            p2.PV = 0;
        }

        if (r.PV < 0) {
            r.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + r.PV);
        System.out.println("BOSS "+"Dégat infligé " + r.dégats + " PV restant pour: "+p2.nom+"  " + p2.PV);

        if (p2.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(r.PV <= 0) {
            System.out.println("BOSS 3 est mort,vous avez gagné une épée , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p2.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p2.PV >= 0 || r.PV >= 0);
}


else if (userName.contains("Fresh")){
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p3.attaquer(r);
       r.attaquer(p3);
        System.out.println("ATTAQUE EN COURS");

        if (p3.PV < 0) {
            p3.PV = 0;
        }

        if (r.PV < 0) {
            r.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + r.PV);
        System.out.println("BOSS "+"Dégat infligé " + si.dégats + " PV restant pour: "+p3.nom+"  " + p3.PV);

        if (p3.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(r.PV <= 0) {
            System.out.println("BOSS 3 est mort,vous avez gagné une épée , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p3.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p3.PV >= 0 || r.PV >= 0);
}

else if (userName.contains("ATH")){
String Numb;
Scanner myNum = new Scanner(System.in);

do {
    System.out.println("1 pour CONTINUER et 2 pour se DEFENDRE ");
    Numb = myNum.nextLine();

    if (Numb.equals("1")) {
        p4.attaquer(r);
       r.attaquer(p4);
        System.out.println("ATTAQUE EN COURS");

        if (p4.PV < 0) {
            p4.PV = 0;
        }

        if (r.PV < 0) {
            r.PV = 0;
        }

        System.out.println("PERSONNAGES " + " PV restant pour le BOSS : " + r.PV);
        System.out.println("BOSS "+"Dégat infligé " + r.dégats + " PV restant pour: "+p4.nom+"  " + p4.PV);

        if (p4.PV <= 0){
            System.out.println("Vous avez perdu la partie");
            break;
        }
        else {
            System.out.println("A l'attaque");
        }
        if(r.PV <= 0) {
            System.out.println("BOSS 3 est mort,vous avez gagné une épée , Salle ACCOMPLI");break;
        } else {
            System.out.println("Vous pouvez continuer à attaquer");
        }
        
        } else if (Numb.equals("2")) {
        System.out.println("DEFENSE EN COURS DE SUCCES");
        System.out.println("Vous avez échappé à son attaque");
        System.out.println("Vos points de vie sont "+ p4.PV);
        
    } else {
        System.out.println("Numéro incorrect");
    }
} while (p4.PV >= 0 || r.PV >= 0);
}
else {System.out.println("Il y a un problème");}

if(si.PV<=0 && b.PV<=0 && r.PV<=0){
{System.out.println("Tous les éléments ont été décrochets :" +o.nom+" "+o1.nom+" "+o2.nom+" "+o3.nom+" "+o4.nom );}
{System.out.println("🏆🏆🏆🏆🏆🏆🏆🏆🏆 GAGNE 🏆🏆🏆🏆🏆🏆🏆🏆🏆");}}
else System.out.println("T'es NUL");

}
}

	


