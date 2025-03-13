package com.br.authifyjava;

/**
 *
 * @author tetzner
 */
public class ExcecaoAutenticacao extends Exception {

    public ExcecaoAutenticacao() {
        super();
    }

    public ExcecaoAutenticacao(String mensagem) {
        super(mensagem);
    }

    public ExcecaoAutenticacao(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public ExcecaoAutenticacao(Throwable causa) {
        super(causa);
    }
}
