package SecondSession.Projects;

import java.util.NoSuchElementException;

public class ListaEncadeada<T> {
    private No<T> cabeca; // primeiro elemento
    private No<T> cauda;  // último elemento
    private int tamanho;

    //---------------------------------------------------------------------------------------
    // Construtor
    //---------------------------------------------------------------------------------------

    public ListaEncadeada() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
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

    public boolean temUmUnicoNo() {
        return tamanho == 1;
    }

    // Métodos de inserção ------------------------------------------------------------------
    public void inserirNoFim(T valor) {
        No<T> no = new No<>(valor);
        if (estaVazia()) {
            setCabeca(no);
        } else {
            cauda.setProxNo(no);
        }
        setCauda(no);
        incrementarTamanho();
    }

    public void inserirNoInicio(T valor) {
        No<T> no = new No<>(valor);
        if (estaVazia()) {
            setCauda(no);
        } else {
            no.setProxNo(cabeca);
        }
        setCabeca(no);
        incrementarTamanho();
    }

    // Métodos de remoção ---------------------------------------------------------------------
    public void removerPorIndice(int indice) {
        if (estaVazia() || indice > tamanho - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            int i = 0;
            No<T> noAtual = cabeca;
            while (i <= tamanho) {
                if (i == indice - 1) {
                    if (noAtual.getProxNo() == cauda) {
                        setCauda(noAtual);
                        noAtual.setProxNo(null);
                    } else {
                        No<T> proxNo = noAtual.getProxNo().getProxNo();
                        noAtual.setProxNo(proxNo);
                    }
                    break;
                }
                noAtual = noAtual.getProxNo();
                i++;
            }
        }
        decrementarTamanho();
    }

    public void removerPorValor(T valor) {
        if (estaVazia()) {
            throw new NoSuchElementException();
        } else {
            No<T> noAtual = cabeca;
            while (noAtual != cauda) {
                if (noAtual.getProxNo().getValor() == valor) {
                    if (noAtual.getProxNo() == cauda) {
                        setCauda(noAtual);
                    }
                    No<T> proxNo = noAtual.getProxNo().getProxNo();
                    noAtual.setProxNo(proxNo);
                    break;
                } else if (!noAtual.getProxNo().temProxNo()) {
                    throw new NoSuchElementException();
                }
                noAtual = noAtual.getProxNo();
            }
        }
        decrementarTamanho();
    }

    // Métodos de busca -----------------------------------------------------------------------
    public T buscarValor(int indice) throws IndexOutOfBoundsException {
        if (estaVazia() || indice > tamanho - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            int i = 0;
            No<T> noAtual = cabeca;
            while (noAtual != cauda) {
                if (i == indice) {
                    break;
                }
                noAtual = noAtual.getProxNo();
                i++;
            }
            return noAtual.getValor();
        }
    }

    public int buscarIndice(T valor) {
        if (estaVazia()) {
            throw new NoSuchElementException();
        } else {
            int i = 0;
            No<T> noAtual = cabeca;
            while (noAtual != cauda) {
                if (noAtual.getValor() == valor) {
                    break;
                } else if (!noAtual.temProxNo()) {
                    throw new NoSuchElementException();
                }
                noAtual = noAtual.getProxNo();
                i++;
            }
            return i;
        }
    }

    //---------------------------------------------------------------------------------------
    // Getters and Setters
    // --------------------------------------------------------------------------------------

    public T getCabeca() {
        return cabeca.getValor();
    }

    public void setCabeca(No<T> cabeca) {
        this.cabeca = cabeca;
    }

    public T getCauda() {
        return cauda.getValor();
    }

    public void setCauda(No<T> cauda) {
        this.cauda = cauda;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    private int getIndiceCabeca() {
        return 0;
    }

    private int getIndiceCauda() {
        return tamanho - 1;
    }

    //---------------------------------------------------------------------------------------
    // toString
    //---------------------------------------------------------------------------------------

    public String toString() {
        StringBuilder retorno = new StringBuilder("ListaEncadeada{ ");

        if (!this.estaVazia()) {
            No<T> noAtual = this.cabeca;

            while (noAtual != null) {
                if (!temUmUnicoNo()) {
                    if (noAtual != cauda) {
                        retorno.append(noAtual.getValor());
                        retorno.append(", ");
                    } else {
                        retorno.append(noAtual.getValor());
                    }
                } else {
                    retorno.append(noAtual.getValor());
                }
                noAtual = noAtual.getProxNo();
            }
        }
        retorno.append(" }");
        return retorno.toString();
    }
}
