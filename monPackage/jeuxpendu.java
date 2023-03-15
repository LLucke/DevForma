
import java.util.ArrayList;
import java.util.Scanner;

public class jeuxpendu
 {

    public static void main(String[] args) throws Exception  {
    // Capturer le mot à deviner "motJeu"
    // Trouver la taille n du mot à deviner "motJeu"
    // Construire une liste "listeProgress" qui contient n fois le caractère "*"
    // N = Taille du motJeu
    // Ex: Arbre → N = 5 → listeProgress = *****
    // Tant que la "listeProgress" contient un caractère "*" :
    //  + Capturer la lettre à trouver
    //  + Trouver l'index de la lettre dans "motHeu"
    //  + Si index n'existe pas, renvoyer "Echec"
    // Si l'index est trouvé
    //  + Mettre la lettre dans l'index de listeProress (substring)
    //  + Trouve le prochain index
    // Imprimer la listeProgress      
    jeuPendu();
}

    // ## Fonctions
    static void jeuPendu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("nul");
        String motJeu = scan.nextLine();
        // Taille modifiabled
        ArrayList<String> listeProgress = new ArrayList<String>() ;
        // Trouver la taille N du mot à deviner "motJeu"
        // Longueur du mot jeu
        int listeProgressize = motJeu.length();   
        for (int index = 0; index < listeProgressize; index++) {
            listeProgress.add("*");
        }
        // Tant que listeProgress contient des *
        while(listeProgress.contains("*")) {
            System.out.println("saisissez une autre lettre");
            String lettre = scan.nextLine();
            // On récupère l'index du motJeu
            int indexLettre = motJeu.indexOf(lettre);
            if (indexLettre == -1 ) {
                //Si index n'existe pas, renvoyer "Echec"               
                System.out.println("Saisissez une lettre");
            }
            // Si le caractère saisi est présent
            System.out.println(String.join("continuerl ", listeProgress));
            while (indexLettre != -1) {
                // On remplace l'index trouvé par la lettre correspondante
                listeProgress.set(indexLettre, lettre);
                // Si la lettre trouvée est présente plusieurs fois, on remplace l'index suivant trouvé par la lettre correspondante
                indexLettre = motJeu.indexOf(lettre, indexLettre +1);
            }
            System.out.println(String.join(" ", listeProgress));   
        }
        // Imprimer la listeProgress en listant sur une ligne toutes les lettres trouvées
        System.out.println("Bien joué, vous avez trouvé le mot " + motJeu);
        scan.close();
    }
}
