//Définition du package qui represente un dossier physique dans l'arborescence du projet
//ex: package NOM_PACKAGE;
package monPackage;

import java.lang.reflect.Array;
import java.text.Format;
//Les import des packages externes ajoutés automatiquement par vs code lors du selection (TAB ou Enter) du Type classe
import java.text.SimpleDateFormat;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

import javax.management.remote.NotificationResult;






    //defifnition de la classe entre accolade ici(app)
    //public class et le nom de la class
      public class App {
    

    //chaque class peu contenir une methode main qui nous permet d'executer la class avec une listes d arguments
    //arg=arguments
   
   

    public static void main(String[] args) throws Exception {
     
     calculerMoyenneNotes();
     
      Scanner scan = new Scanner(System.in);
     

     //Créer l'objet scan de la class scanner par le mot-clé"new"
     System.out.println("saississer votre salaire");
  
     float Salaire ;

     boolean siException;
    
    do {
       
     String SalaireUtilisateur = scan.nextLine();
     
     try {
       //la methode valueof peut exister sur d'autre types de classe, ex:string.valueof
      Salaire = Float.valueOf(SalaireUtilisateur);
     siException = false;
     } catch (Exception e) {
       // J affiche un messsage plus "user-friendly" que l'exception
     
      System.out.println("format indefini"); 
       siException = true;
     }
     
     } 
    
     //Raccourci: while(siException)
     while (siException == true);
     
     
     /*  Boolean siQuestion = true; 
         while (siQuestion) {
     
     
          }
        //Utiliser l'objet scan pour attendre que l'utilisateur saisit la donnée (aveec la touche Entrer pou valider)
        //C est pas recommandé que l'exception se montre à l'utilisateur
        //donc il faut intervenir et faire "catch"
     
         String SalaireUtilisateur = scan.nextLine();
         
         try {
           //la methode valueof peut exister sur d'autre types de classe, ex:string.valueof
         Salaire = Float.valueOf(SalaireUtilisateur);
         siException = false;
         } catch (Exception e) {
           // J affiche un messsage plus "user-friendly" que l'exception
         
          System.out.println("format indefini"); 
           siQuestion = true;
     
         }
        */
        
       
       
         

     //Definir le pourcentage
    double pourcentage = 0.9;

    
     //convertir la valeur capture par la methode nextLine du string vers Float
     //pour pouvoir faire une operation
       System.out.println("Hello, World!");
       String test = "l/'porte folio";
     Personne anonyme = new Personne();
     anonyme.Last_Name = "Tony";
     anonyme.frist_Name = "Stark";
     anonyme.age = 31;
    
    //informer l'utilisateur depuis le terminal à propos de la donnée d'entrée a saisir
      System.out.println("saississer votre date de naissance");
    //imprimer à l'utilisateur l'étiquette de la donnée à saisir
      String dateUtilisateur = scan.nextLine();
     
  
//Créer un objet formater d'une classe simpleDateformat
    //pour convertir la valeur string capturé du scan vers un objey d'une class Date
SimpleDateFormat formatter = new SimpleDateFormat ("dd/mm/yyyy");

    //Utiliser la methode valueofexiste aussi en type de classe
anonyme.dateNaissance = formatter.parse(dateUtilisateur);  


     Date dateJour = new Date();

long dateNaissanceTime = anonyme.dateNaissance.getTime();
long dateJourTime = dateJour.getTime();
if (dateNaissanceTime < dateJourTime) {

System.out.println("date naissance > date jour!");
return;

}


//Double est utliser pour les chiffre à virgule
//Utiliser l operation arthmetique mutliplication entre salaire er pourcentage
//Remarque: La multiplication entre Float et double donne un type automatique double   
double resultat = Salaire * pourcentage; 
    
//On convertit du double (resultat de l opération precedente) vers float (la cible:type de la propriété salaire)
anonyme.salaire =(float) resultat;
    
//La methode valueof existe aussi pour des autres typr de class
String variablebirthday = String.valueOf(anonyme.age); 
    
    String SalaireUtilisateur;
    //Refactoriser l'ancienne expression pour retourner le nom complet depuis une fonction séparé
    //Appeler la fonction nommé "concatener" avec deux parametres
    String fullname = anonyme.frist_Name + "" + anonyme.Last_Name + "" + variablebirthday + SalaireUtilisateur;
    
    
    //string nomcomplet = anonymeLast _Name +""+ anonyme fisrt_Name + "" + anonyme.age;
    String fullName = concatener(anonyme.Last_Name,anonyme.frist_Name);
   
   
   //concatener le constituant année d'un objet d une class Date à travers la classe SimpleDateFormat
   //Pour l'afficher séparement à l'utilisateur
    String affichage = fullname + " " + anonyme.age + " " + anonyme.salaire;
    affichage = affichage + "" + formatter.format(anonyme.dateNaissance); 
    System.out.println(affichage);
  
    
  //Extraire la constituante année d'un objet d une class DAte à travers la class SimpleDateformat
  // Le constructeur de simpleDateformat prend le format souhaité ("yyyy") en parametre
  //Les formats possibles 
SimpleDateFormat formatterAnnée = new SimpleDateFormat("yyyy");

System.out.println("Annee:" + formatterAnnée.format(anonyme.dateNaissance));
}

/* 
    mafonction();
    
    static void mafonction(String parametre) {

System.out.println("\"appel mafonction");
    }

    static void mafonction(String parametre,String parametre2) {
    System.out.println("appel mafonction");


    }
    */
    //MODE ACCES TYPE_REOUR NOM_FONCTION (ARGUMENTS) ()
    
    static String concatener(String p1, String p2)
     {
      String retour = p1 + " " + p2;
      return retour ;
    }

 
    static void calculerMoyenneNotes() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("saississez votre note (ex: 13,14,17)");
    

  

String notes = scanner.nextLine();



String[] notesListe = notes.split(",");
   
   
   for (String item : notesListe) {  
     System.out.println(item);

} 
  }

  static void calculMoyenne() {

    Scanner scan1 = new Scanner(System.in);
    System.out.println("saisissez vos notes !");
  
Scanner scan = new Scanner(System.in);

String notes = scan.nextLine();
String mesNotes = scan1.nextLine();

String[]notesarray = mesNotes.split(",");
List<String> notesList = Arrays.asList(notesarray);



int Sumnotes = 0 ;
 //iteration sur la list
 Object globalNotes;
for (String string : notesList) {
 
  String item;
  System.out.println(item);

//System.out.printIN(item); // verification en sortie
  int numberitem = Integer.parseInt(item);
Sumnotes = Sumnotes + numberitem;
globalNotes = Sumnotes / notesList.size();


}
System.out.println("notes global" + globalNotes);

}

}
      
}


  

  












