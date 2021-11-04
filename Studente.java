/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aless
 */
public class Studente {
    
    private int Matricola;
    private String Nome;
    private String Cognome;
    private String CorsodiLaurea;
    private boolean Laureato;
    private int Crediti;
    private String Laurea;
    
    public static int UltimoNumeroMatricola = 0;
    
    public Studente(String n, String c, String cl){
        
        UltimoNumeroMatricola++;
        Matricola = UltimoNumeroMatricola;
        
        Nome = n;
        Cognome = c;
        CorsodiLaurea = cl;
        Laureato = false;
        Crediti = 0;
        Laurea = "null";
    
    }
    
    public int getMatricola(){
        return Matricola;
    }
    public String getNome(){
        return Nome;
    }
    public String getCognome(){
        return Cognome;
    }
    public String getCorsodiLaurea(){
        return CorsodiLaurea;
    }
    public boolean getLaureato(){
        return Laureato;
    }
    public int getCrediti(){
        return Crediti;
    }
    public String getLaurea(){
        return Laurea;
    }
    
    
    public void setCorsodiLaurea(String cl){
        CorsodiLaurea = cl;
    }
    public void setLaureato(boolean l){
        Laureato = l;
    }
    public void setCrediti(int c){
        Crediti = c;
    }
    public void setRitiritato(){
        CorsodiLaurea = "null";
    }
    public void setLaurea(String l){
        Laurea = l;
    }

}
