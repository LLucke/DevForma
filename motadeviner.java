import java.util.Arrays;
import java.util.Scanner;

public class motadeviner {
    
    
    
    public static void main(String[] args) {
         
            Scanner scanner = new Scanner(System.in);
            System.out.println("avocat");
            System.out.println("banane");
            System.out.println("arbres");
            String motJeu = scanner.nextLine();
            
            String listeProgress = new  String() ;
            int listeProgressize = motJeu.length();   
            for (int index = 0; index < listeProgressize; index++) {
                String listegrogreString= ("*");
            }
            // Tant que listeProgress contient des *
            while(listeProgress.contains("*")) {
                System.out.println("Passer votre tour");
                String lettre = scanner.nextLine();
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
                    String listegrogress= ("*");String str= ("indexLettre");
                    // Si la lettre trouvée est présente plusieurs fois, on remplace l'index suivant trouvé par la lettre correspondante
                    indexLettre = motJeu.indexOf(lettre, indexLettre +1);
                }
                System.out.println(String.join("", listeProgress));   
            }
            // Imprimer la listeProgress en listant sur une ligne toutes les lettres trouvées
            System.out.println("Bien joué, vous avez trouvé le mot " + motJeu);
            scanner.close();
        }

            



        
        }
    


