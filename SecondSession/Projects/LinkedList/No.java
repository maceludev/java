package SecondSession.Projects.LinkedList;

public class No<E> {
    private E valor;
    private No<E> proxNo;

    public No(E valor) {
        this.valor = valor;
        this.proxNo = null;
    }

    public boolean temProxNo() {
        return proxNo != null;
    }

    public E getValor() {
        return valor;
    }

    public No<E> getProxNo() {
        return proxNo;
    }

    public void setProxNo(No<E> proxNo) {
        this.proxNo = proxNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                ", proxNo=" + proxNo +
                '}';
    }
}
