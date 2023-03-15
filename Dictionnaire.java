

import java.util.Scanner;



public class Dictionnaire {
    

    public static void main(String[] args)throws Exception {

    
        Scanner Scan = new Scanner(System.in);
        
        System.out.println("choisissez votre mot");
        String motcle = Scan.nextLine();
        
        ArrayList<String> motcleArray = new Arraycle<String>() ;
        ArrayList<String> motListArray = new ArrayList<String>() ;
        ArrayList<String> motcleArrayList;
        
        motcleArrayList.add("Ananas");
        motcleArrayList.add("Avocat");
        motcleArrayList.add("banane");
    
    motcleArrayList.add("definition Ananas");
    motcleArrayList.add("definition Avocat");
    motcleArrayList.add("definition Banane");
    
    
    Scan = new Scanner(System.in);
    
    for (int index = 0; index < motcleArrayList.size(); index++) {
        
        if(motcle.equals(motcleArrayList.get(index)))
        System.out.println(index);

    }

    }

}