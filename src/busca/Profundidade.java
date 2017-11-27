/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca;

import grafo.Vertice;

/**
 *
 * @author SABRINA
 */
public class Profundidade {

    public static void buscaProfundidade(Vertice base) {
        if (base.filhos.isEmpty()) {
            System.out.println(base.valor);
        }
        for (Vertice filho : base.filhos) {
            System.out.println(base.valor);
            buscaProfundidade(filho);
        }
    }
}
