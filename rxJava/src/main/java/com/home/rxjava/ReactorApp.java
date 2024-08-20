package com.home.rxjava;


import reactor.core.publisher.Flux;

public class ReactorApp {

    public static void main(String[] args) {
        //Flux<String> flux = Flux.just("ala","elo","ilo");
       // flux.subscribe(System.out::println);
        //Flux<Integer> myFlux = Flux.just(1,2,3,4).
          //              map(x -> x*3);
        //myFlux.subscribe(System.out::println);
        //Practicando operadores con Reactor
        //Flux<Integer> myFlux = Flux.just(2,4,6,9).
          //      filter(x-> x%2 == 0);
        //myFlux.subscribe(System.out::println);
        //Flux<String> fluxCapital = Flux.just("A","E","I","O","U");
        //Flux<String> fluxLower =  Flux.just("a","e","i","o","u");
        //Flux<String> mergedFlux =  Flux.merge(fluxCapital,fluxLower);
        //mergedFlux.subscribe(System.out::println);
        Flux<String> miLista = retornaLista();
        miLista.filter(x-> x.startsWith("R")).
            subscribe(
                    a-> System.out.println("Vamos bien "+a),
                    b-> System.out.println("Error"),
                    () -> System.out.println("Completado")
            );



    }

    public static Flux retornaLista(){
        return Flux.just("Rock","Cumbia", "salsa");
    }
}
