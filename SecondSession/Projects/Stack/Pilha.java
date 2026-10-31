package SecondSession.Projects.Stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Pilha<T> {
    private Elemento<T>[] valores;
    private Elemento<T> topo;
    private int tamanho;

    //---------------------------------------------------------------------------------------
    // Construtor
    //---------------------------------------------------------------------------------------

    public Pilha() {
        this.tamanho = 0;
        this.valores = new Elemento[0];
    }

    //---------------------------------------------------------------------------------------
    // Métodos
    //---------------------------------------------------------------------------------------

    private void incrementarTamanho() {
        tamanho++;
    }

    private void decrementarTamanho() {
        tamanho--;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Métodos de inserção ------------------------------------------------------------------
    public void inserir(T valor) {
        incrementarTamanho();
        Elemento<T>[] valoresAtuais = valores;
        setValores(new Elemento[tamanho]);
        for (int i = 0; i < valoresAtuais.length; i++) {
            valores[i] = valoresAtuais[i];
        }
        valores[tamanho - 1] = new Elemento<>(valor);
        setTopo(new Elemento<>(valor));
    }

    // Métodos de remoção ------------------------------------------------------------------
    public void remover() {
        if (!estaVazia()) {
            decrementarTamanho();
            Elemento<T>[] valoresAtuais = valores;
            setValores(new Elemento[tamanho]);
            for (int i = 0; i < valoresAtuais.length - 1; i++) {
                valores[i] = valoresAtuais[i];
            }
            setTopo(valores[tamanho-1]);
        } else {
            throw new EmptyStackException();
        }

    }

    // Métodos de busca ------------------------------------------------------------------
    public T buscarPorIndice(int indice) {
        if (indice >= tamanho || indice < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            return valores[indice].getValor();
        }
    }

    public int buscarPorValor(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (valores[i].getValor() == valor) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    //---------------------------------------------------------------------------------------
    // Getters and Setters
    //---------------------------------------------------------------------------------------

    private void setValores(Elemento<T>[] valores) {
        this.valores = valores;
    }

    public Elemento<T> getTopo() {
        return topo;
    }

    public void setTopo(Elemento<T> topo) {
        this.topo = topo;
    }

    public int getTamanho() {return tamanho;}

    //---------------------------------------------------------------------------------------
    // toString
    //---------------------------------------------------------------------------------------

    public String toString() {
        StringBuilder retorno = new StringBuilder("Pilha{ ");

        for (int i = 0; i < tamanho; i++) {
            retorno.append(valores[i].getValor());
            if (i != tamanho - 1) {
                retorno.append(", ");
            }

        }
        retorno.append(" }");
        return retorno.toString();
    }
}
