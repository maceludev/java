package SecondSession.Projects.Stack;

public class Elemento<T> {
    private final T valor;

    public Elemento(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "valor=" + valor +
                '}';
    }
}
