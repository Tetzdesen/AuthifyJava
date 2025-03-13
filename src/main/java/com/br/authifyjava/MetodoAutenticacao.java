package com.br.authifyjava;

/**
 *
 * @author tetzner
 */
public abstract class MetodoAutenticacao {

    public final ResultadoAutenticacao autenticar(Credenciais credenciais) {
        if (!saoCredenciaisValidas(credenciais)) {
            return new ResultadoAutenticacao(false, "Credenciais inválidas.");
        }
        try {
            return realizarAutenticacao(credenciais);
        } catch (ExcecaoAutenticacao ex) {
            return tratarErroAutenticacao(ex);
        }
    }

    protected abstract boolean saoCredenciaisValidas(Credenciais credenciais);

    protected abstract ResultadoAutenticacao realizarAutenticacao(Credenciais credenciais) throws ExcecaoAutenticacao;

    protected ResultadoAutenticacao tratarErroAutenticacao(ExcecaoAutenticacao ex) {
        return new ResultadoAutenticacao(false, "Erro durante a autenticação: " + ex.getMessage());
    }

}
