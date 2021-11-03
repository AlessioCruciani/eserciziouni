/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aless
 */
public class Esame {
    
    private int MatricolaStudente;
    private int CFU;
    private int Voto;
    private String Nome;
    private boolean Superato = false;
    
    public Esame(int m, int cfu, String ne){
        MatricolaStudente = m;
        CFU = cfu;
        Nome = ne;
    }
    
    public int getMatricolaStudente(){
        return MatricolaStudente;
    }
    public int getCFU(){
        return CFU;
    }
    public int getVoto(){
        return Voto;
    }
    public String getNomeEsame(){
        return Nome;
    }
    public boolean getSuperato(){
        return Superato;
    }
    
    
    
    
    public void setVotoeEsito(int v, boolean e){
        Voto = v;
        Superato = e;
    }
    
}
