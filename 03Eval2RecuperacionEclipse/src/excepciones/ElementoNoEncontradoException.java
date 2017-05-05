package excepciones;

public class ElementoNoEncontradoException extends Exception {

    public ElementoNoEncontradoException() {
    }
    public ElementoNoEncontradoException(String msg) {
        super(msg);
    }
}
