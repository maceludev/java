package SecondSession.Practice;

import SecondSession.Projects.Stack.Pilha;

public class Teste {
    static void main(String[] args) {

        Pilha<String> stack = new Pilha<>();
        stack.inserir("oi");
        stack.inserir("ola");
        stack.inserir("marcelo");
        stack.inserir("Francisco");
        stack.inserir("Chagas");
        stack.inserir("Eliane");
        stack.remover();
        System.out.println(stack.buscarPorValor("Chagas"));
        System.out.println(stack.getTamanho());
        System.out.println(stack);

        /*
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
        */
    }

}

