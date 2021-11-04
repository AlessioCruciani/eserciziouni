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
    
    private int indiceEsame;
    private int MatricolaStudente;
    private int CodiceEsame;
    private int CFU;
    private int Voto;
    private String Nome;
    private boolean Superato = false;
    
    public static int UltimoindiceEsame = 0;
    
    public Esame(int m, int cfu, String ne, int ce){
        
        UltimoindiceEsame++;
        indiceEsame = UltimoindiceEsame;
        
        MatricolaStudente = m;
        CFU = cfu;
        Nome = ne;
        CodiceEsame = ce;
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
    public int getCodiceEsame(){
        return CodiceEsame;
    }
    public int getIndiceEsame(){
        return indiceEsame;
    }
    
    
    
    
    public void setVotoeEsito(int v, boolean e){
        Voto = v;
        Superato = e;
    }
    
}
