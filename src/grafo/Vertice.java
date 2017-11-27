/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SABRINA
 */
public class Vertice {

public String valor;

public List<Vertice> filhos = new ArrayList<Vertice>();

public Vertice(String valor) {
	this.valor = valor;
}	
}


