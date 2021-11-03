
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aless
 */


public class GestisciUniversita {
    public static void main(String[] args){
/**
 *
 * @author aless
*/
        
        ArrayList<Studente> listastudenti = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        
        
        CorsoLaurea ing = new CorsoLaurea("ingegneria", 40);
        CorsoLaurea med = new CorsoLaurea("medicina", 50);
        
        
        //Studente[] studenti = new Studente[100];
        
        char scelta;
        do {
			System.out.println(); //riga bianca
			System.out.println("OPERAZIONI DISPONIBILI");
			System.out.println("   [I]srivi un nuovo studente");
                        System.out.println("   [R]icerca uno studente");
                        System.out.println("   [T]ogli il corso di studi");
                        System.out.println("   [L]aurea uno studente");
                        System.out.println("   [l]ista studenti");
                        System.out.println("   [U]scita");
			System.out.print("scelta: ");
			scelta = input.next().charAt(0);
                                //input.next().charAt(0);
			
                        //input.nextLine(); //gestisce "a capo"

			System.out.println(); //riga bianca
			
			switch (scelta) {
			case 'I':
                                
                                System.out.println("Inserisci il nome dello studente: ");
                                String nome = input.next();
                                System.out.println("Inserisci il cognome dello studente: ");
                                String c = input.next();
                                System.out.println("Inserisci il corso dello studente: ");
                                String cl = input.next();
                                
                                Studente s = new Studente(nome,c,cl);
                                
                                listastudenti.add((Studente.UltimoNumeroMatricola-1), s);
                                //studenti[Studente.UltimoNumeroMatricola-1] = s;
                                
                                System.out.println("Inserito lo studente con numero matricola: " + Studente.UltimoNumeroMatricola);
                                
                                
                                
                                
                                
				break;
                                
                                
                                
			case 'R': 
				System.out.println("Inserisci il nome dello studente da cercare: ");
                                String nomedacercare = input.next();
                                System.out.println("Inserisci il cognome dello studente da cercare: ");
                                String cognomedacercare = input.next();
                                
                                for( Studente i : listastudenti){
                                    if((i.getNome()).equals(nomedacercare) && (i.getCognome()).equals(cognomedacercare) && i.getCorsodiLaurea()!="null" ){
                                        System.out.println("Matricola: " + i.getMatricola() + " Nome: "+ i.getNome() + " Cognome: " + i.getCognome() + " Corso di laurea: " + i.getCorsodiLaurea() + " Laureato: " + i.getLaureato());
                                    }
                                    else{
                                        System.out.println("Nessuno studente con il nome e cognome inseriti. ");
                                    }
                                }
				break;
                                
                                
                                
                        case 'T':   
                                    System.out.println("Inserisci il nome dello studente da cercare: ");
                                    String nomedacancellare = input.next();
                                    System.out.println("Inserisci il cognome dello studente da cercare: ");
                                    String cognomedacancellare = input.next();
                                
                                for( Studente i : listastudenti){
                                        if((i.getNome()).equals(nomedacancellare) && (i.getCognome()).equals(cognomedacancellare) && i.getCorsodiLaurea()!="null" ){
                                            i.setCorsodiLaurea("null");
                                            System.out.println("Il corso di laurea è stato rimosso con successo. ");
                                        }
                                        else{
                                            System.out.println("Nessuno studente con il nome e cognome inseriti. ");
                                        }
                                    }
				break;
                                
                                
                        case 'L':   
                                    System.out.println("Inserisci il nome dello studente da cercare: ");
                                    String nomedalaureare = input.next();
                                    System.out.println("Inserisci il cognome dello studente da cercare: ");
                                    String cognomedalaureare = input.next();
                                
                                for( Studente i : listastudenti){
                                        if((i.getNome()).equals(nomedalaureare) && (i.getCognome()).equals(cognomedalaureare) && i.getCorsodiLaurea()!="null" ){
                                            String corso = i.getCorsodiLaurea();
                                            switch (corso){
                                                case "ingegneria": 
                                                    if(i.getCrediti()>= ing.getMinimoCrediti()){
                                                        i.setLaureato(true);
                                                        i.setCorsodiLaurea("null");
                                                    }
                                                    else{
                                                        System.out.println("I crediti non sono sufficienti per laureare lo studente");
                                                    }
                                                case "medicina": 
                                                    if(i.getCrediti()>=med.getMinimoCrediti()){
                                                        i.setLaureato(true);
                                                        i.setCorsodiLaurea("null");
                                                    }
                                                    else{
                                                        System.out.println("I crediti non sono sufficienti per laureare lo studente");
                                                    }
                                            }
                                            
                                        }
                                        else{
                                            System.out.println("Nessuno studente con il nome e cognome inseriti. ");
                                        }
                                    }
				break;
                                
                         
                        case 'l': 
                                    for(Studente i : listastudenti){
                                        System.out.println (" Nome: " + i.getNome() + " Cognome: " + i.getCognome() + " Corso di laurea: " + i.getCorsodiLaurea());
                                    }
                                    /*
                                    for(int i = 0; i < studenti.length; i++){
                                        System.out.println(studenti[i].getNome() + studenti[i].getCognome() + studenti[i].getCorsodiLaurea());
                                    }
                                    */
                                     
                                break;
                                
                        default: System.out.println("Inserire solo lettere consentite");
                        }
                        System.out.println();
        }while (scelta!='U');
    }
  
}


