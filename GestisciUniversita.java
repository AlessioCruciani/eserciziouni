


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
        ArrayList<Esame> listaesami = new ArrayList<>();
        
        
        Scanner input = new Scanner(System.in);
        
        
        CorsoLaurea ing = new CorsoLaurea("ingegneria", 40);
        CorsoLaurea med = new CorsoLaurea("medicina", 50);
        
        
        //Studente[] studenti = new Studente[100];
        
        char scelta;
        do {
			System.out.println(); //riga bianca
			System.out.println("OPERAZIONI DISPONIBILI");
			System.out.println("   [I]srivi un nuovo studente");
                        System.out.println("   [C]erca uno studente");
                        System.out.println("   [T]ogli il corso di studi");
                        System.out.println("   [L]aurea uno studente");
                        System.out.println("   [V]isualizza iscritti a corso di laurea");
                        System.out.println("   [v]isualizza laureati a corso di laurea");
                        System.out.println("   [A]ggiungi esame al piano di studi");
                        System.out.println("   [R]imuovi esame dal piano di studi");
                        System.out.println("   [c]erca esame nel piano di studi");
                        System.out.println("   [P]rimuovi studente ad un esame con un voto");
                        System.out.println("   [M]ostra esami di uno studente");
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
                                
                                
                                
			case 'C': 
				System.out.println("Inserisci il nome dello studente da cercare: ");
                                String nomedacercare = input.next();
                                System.out.println("Inserisci il cognome dello studente da cercare: ");
                                String cognomedacercare = input.next();
                                
                                for( Studente i : listastudenti){
                                    if((i.getNome()).equals(nomedacercare) && (i.getCognome()).equals(cognomedacercare) && i.getCorsodiLaurea()!="null" ){
                                        System.out.println("Matricola: " + i.getMatricola() + " Nome: "+ i.getNome() + " Cognome: " + i.getCognome() + " Corso di laurea: " + i.getCorsodiLaurea() + " Crediti: "+i.getCrediti() +" Laureato: " + i.getLaureato() );
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
                                                        i.setLaurea(i.getCorsodiLaurea());
                                                        i.setCorsodiLaurea("null");
                                                    }
                                                    else{
                                                        System.out.println("I crediti non sono sufficienti per laureare lo studente");
                                                    }
                                                case "medicina": 
                                                    if(i.getCrediti()>=med.getMinimoCrediti()){
                                                        i.setLaureato(true);
                                                        i.setLaurea(i.getCorsodiLaurea());
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
                        case 'V':
                            
                                System.out.println("Inserisci il corso di laurea di cui visualizzare gli studenti: ");
                                String corsodavisualizzare = input.next();
                                for( Studente i : listastudenti){
                                        if(i.getCorsodiLaurea().equals(corsodavisualizzare) && i.getLaureato()!= true){
                                            System.out.println("Matricola: " + i.getMatricola() + " Nome: "+ i.getNome() + " Cognome: " + i.getCognome() + " Corso di laurea: " + i.getCorsodiLaurea());
                                        }
                                        else{
                                            System.out.println("Nessuno studente iscritto al corso di laurea inserito. ");
                                        }
                                    }
				break;        
                        case 'v':
                            
                                System.out.println("Inserisci il corso di laurea di cui visualizzare gli studenti: ");
                                String corsodavisualizzarelaureati = input.next();
                                for( Studente i : listastudenti){
                                        if(i.getLaurea().equals(corsodavisualizzarelaureati) && i.getLaureato()== true){
                                            System.out.println("Matricola: " + i.getMatricola() + " Nome: "+ i.getNome() + " Cognome: " + i.getCognome() + " Corso di laurea: " + i.getCorsodiLaurea());
                                        }
                                        else{
                                            System.out.println("Nessuno studente laureato al corso di laurea inserito. ");
                                        }
                                    }
				break;  
                        
                        case 'A':
                                System.out.println("Inserisci la matricola dello studente di cui si vuole creare il piano di studi: ");
                                int MatPianoStudi = input.nextInt();
                                
                                for(Studente i : listastudenti){
                                                                   
                                    if(i.getMatricola() == MatPianoStudi){
                                        System.out.println("Inserisci il NOME dell'esame che si vuole inserire: ");
                                        String nomeEsame = input.next();
                                        
                                        System.out.println("Inserisci i CFU dell' esame che si vuole inserire");
                                        int Cfuesame = input.nextInt();
                                        
                                        System.out.println("Inserisci il CODICE dell' esame che si vuole inserire");
                                        int codesa = input.nextInt();
                                        
                                        Esame e = new Esame(i.getMatricola(), Cfuesame, nomeEsame, codesa);
                                        
                                        listaesami.add(Esame.UltimoindiceEsame-1, e);
                                        
                                        System.out.println("Esame inserito correttamente nel piano di studi");
                                    }
                                    else{
                                        System.out.println("La matricola inserita non esiste");
                                    }
                                    
                                }
                                
				break;
                        case 'R':
                                System.out.println("Inserisci la matricola dello studente di cui si vuole creare il piano di studi: ");
                                int MatPianoStudiRimuovi = input.nextInt();
                                
                                for(Studente i : listastudenti){
                                                                   
                                    if(i.getMatricola() == MatPianoStudiRimuovi){
                                        System.out.println("Inserisci il codice dell'esame che si vuole rimuovere: ");
                                        int codice = input.nextInt();
                                        
                                        for(Esame j : listaesami){
                                            if(j.getCodiceEsame() == codice && j.getMatricolaStudente()==i.getMatricola()){
                                                listaesami.remove(j.getIndiceEsame()-1);
                                                System.out.println("Esame rimosso con successo");
                                            }
                                            else{
                                                System.out.println("Nessun esame con quel codice");
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("La matricola inserita non esiste");
                                    }
                                    
                                }
                                
				break;
                                
                        case 'c':
                                System.out.println("Inserisci la matricola dello studente di cui si vuole cercare il piano di studi: ");
                                int matCercaEsame = input.nextInt();
                                
                                for(Studente i : listastudenti){
                                                                   
                                    if(i.getMatricola() == matCercaEsame){
                                        System.out.println("Inserisci il codice dell'esame che si vuole cercare: ");
                                        int codice = input.nextInt();
                                        
                                        for(Esame j : listaesami){
                                            if(j.getCodiceEsame() == codice && j.getMatricolaStudente()==i.getMatricola()){
                                                System.out.println("Cod. Esame: " + j.getCodiceEsame() + " Piano di studi di: " + i.getNome()+" " + i.getCognome()+ " CFU: "+ j.getCFU() + " Superato: " + j.getSuperato());
                                            }
                                            else{
                                                System.out.println("Nessun esame con quel codice");
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("La matricola inserita non esiste");
                                    }
                                    
                                }
                                
				break;        
                        case 'P':
                                System.out.println("Inserisci la matricola dello studente di cui si vuole cercare il piano di studi: ");
                                int matdaPromuovere = input.nextInt();
                                
                                for(Studente i : listastudenti){
                                                                   
                                    if(i.getMatricola() == matdaPromuovere){
                                        System.out.println("Inserisci il codice dell'esame che lo studente ha superato: ");
                                        int codice = input.nextInt();
                                        System.out.println("Inserisci il voto con cui lo studente ha superato l'esame: ");
                                        int votoesame = input.nextInt();
                                        
                                        for(Esame j : listaesami){
                                            if(j.getCodiceEsame() == codice && j.getMatricolaStudente()==i.getMatricola()){
                                                j.setVotoeEsito(votoesame, true);
                                                i.setCrediti(i.getCrediti()+j.getCFU());
                                                System.out.println("Esito dell'esame salvato con successo. ");
                                            }
                                            else{
                                                System.out.println("Nessun esame con quel codice nel piano di studi");
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("La matricola inserita non esiste");
                                    }
                                    
                                }
                                
				break;
                                
                        case 'M':
                                System.out.println("Inserisci la matricola dello studente di cui si vogliono visualizzare gli esami: ");
                                int matRiepilogoEsami = input.nextInt();
                                
                                for(Studente i : listastudenti){
                                                                   
                                    if(i.getMatricola() == matRiepilogoEsami){
                                        
                                        
                                        for(Esame j : listaesami){
                                            if(j.getMatricolaStudente()==i.getMatricola()){
                                                
                                            }
                                            else{
                                                System.out.println("Nessun esame con quel codice nel piano di studi");
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("La matricola inserita non esiste");
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


