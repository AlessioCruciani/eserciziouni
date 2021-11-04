/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aless
 */
public class CorsoLaurea {
    private String Nome;
    private int MIN_CREDITI;
    
    public CorsoLaurea(String nc, int min){
        Nome = nc;
        MIN_CREDITI = min;
    }
    public String getNomeCorsoLaurea(){
        return Nome;
    }
    public int getMinimoCrediti(){
        return MIN_CREDITI;
    }

}
