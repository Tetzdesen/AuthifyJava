package com.br.authifyjava;

/**
 *
 * @author tetzner
 */
public class ResultadoAutenticacao {

    private final boolean autenticado;
    private final String mensagem;

    public ResultadoAutenticacao(boolean autenticado, String mensagem) {
        this.autenticado = autenticado;
        this.mensagem = mensagem;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public String getMensagem() {
        return mensagem;
    }

}
