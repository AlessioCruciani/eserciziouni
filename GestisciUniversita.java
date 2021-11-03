
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        
        Studente[] studenti = new Studente[100];
        
        
        char scelta;
        do {
			System.out.println(); //riga bianca
			System.out.println("OPERAZIONI DISPONIBILI");
			System.out.println("   [I]srivi un nuovo studente");
			System.out.println("   [R]imuovi una prenotazione");
                        System.out.println("   [U]scita dal programma");
                        System.out.println("   [L]ista studenti");
			System.out.print("scelta: ");
			scelta = input.next().charAt(0);
                                //input.next().charAt(0);
			
                        //input.nextLine(); //gestisce "a capo"

			System.out.println(); //riga bianca
			
			switch (scelta) {
			case 'I':
                                
                                iscrivi();
                            
                            
				break;
			case 'S': 
				
				break;
                        case 'L': 
                                riepilogoStudenti();
                                break;
                                
                        default: System.out.println("Inserire solo lettere consentite");
                        }
                        System.out.println();
        }while (scelta!='U');
    }

    
    
    
    
    private static void iscrivi() {
        
        Studente[] studenti = new Studente[100];
        
        Scanner inserimento = new Scanner(System.in);
        System.out.println("Inserisci il nome dello studente: ");
        String n = inserimento.nextLine();
        System.out.println("Inserisci il cognome dello studente: ");
        String c = inserimento.nextLine();
        System.out.println("Inserisci il corso dello studente: ");
        String cl = inserimento.nextLine();
        
        
        if(Studente.UltimoNumeroMatricola<studenti.length){
            studenti[Studente.UltimoNumeroMatricola] = new Studente(n, c, cl);
            System.out.println("Iscritto un nuovo studente con matricola n. " + (Studente.UltimoNumeroMatricola+1));
        }
        else{
            System.out.println("Raggiunto il numero massimo di studenti. ");
        }
    }
    
    
    
    
    private static void riepilogoStudenti() {
		Studente[] studenti = new Studente[100];
		System.out.println("RIEPILOGO STUDENTI");
		int i=0;
		while (i<studenti.length && studenti[i]!=null) {
			Studente s = studenti[i];
			System.out.println("Prenotazione n. " + (i+1) + " Nome: " + s.getNome() + " Cognome: " + s.getCognome() + " Corso di Laurea: " + s.getCorsodiLaurea() );
			i++;
    }
}
}