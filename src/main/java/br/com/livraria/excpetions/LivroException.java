package br.com.livraria.excpetions;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
public class LivroException extends Exception {

    public LivroException() {
    }

    public LivroException(String arg) {
        super(arg);
    }

    public LivroException(Throwable arg) {
        super(arg);
    }

    public LivroException(String args1, Throwable args2) {
        super(args1, args2);
    }
}
