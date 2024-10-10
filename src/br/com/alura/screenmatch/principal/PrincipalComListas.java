package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(1970,"O poderoso chefão");
        meuFilme.avalia(5);
        Filme outroFilme = new Filme(2023, "Avatar");
        outroFilme.avalia(2);
        var filmeDoDojan = new Filme(2005, "Dojaaaaaaaaaannnnnn");
        filmeDoDojan.avalia(10);
        Serie lost = new Serie(2020, "Lost");

        Filme f1 = filmeDoDojan;

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoDojan);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
//        lista.forEach(System.out::println);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jenna Ortega");
        buscaPorArtista.add("Beatlejuice");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("depois da lista");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

    }
}
