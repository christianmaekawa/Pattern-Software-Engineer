/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.sample.observador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAEKAWA
 */
public abstract class Trabalhista {
    List<Encargo> encargos = new ArrayList<>(); 
    protected void notificar(double val){
        for (Encargo encargo : encargos) {
            encargo.atualizar(val);
        }
    }
    
}
