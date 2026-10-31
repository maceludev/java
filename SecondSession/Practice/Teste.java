package SecondSession.Practice;

import SecondSession.Projects.ListaEncadeada;

public class Teste {
    static void main(String[] args) {
        ListaEncadeada<String> linkedList = new ListaEncadeada<>();
        linkedList.inserirNoFim("Marcelo");
        linkedList.inserirNoFim("Ellen");
        linkedList.inserirNoFim("Chagas");
        linkedList.inserirNoFim("Francisco");
        linkedList.inserirNoFim("Eliane");

        linkedList.removerPorIndice(2);
        linkedList.removerPorValor("Eliane");

        System.out.println(linkedList);
        System.out.println(linkedList.getCauda());
        System.out.println(linkedList.buscarValor(3));
        System.out.println(linkedList.buscarIndice("Francisco"));

    }
}
