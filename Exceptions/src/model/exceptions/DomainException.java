package model.exceptions;

public class DomainException extends Exception {  // subclasse da superclasse EXCEPTION

    // CONSTRUTOR
    public DomainException (String msg) {  // construtor que recebe uma String como argumento.
        super(msg);
    }

}
