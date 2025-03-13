package com.br.authifyjava;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementação da autenticação por senha
 */
public class AutenticadorSenha extends MetodoAutenticacao {

    private final Map<String, String> usuarios;

    public AutenticadorSenha() {
        this.usuarios = new HashMap<>();
    }

    public void cadastrarUsuario(String email, String senha) {
        if (email.isEmpty() || senha.isEmpty()) {
            throw new IllegalArgumentException("Dados inválidos ou vazios: " + "Email: " + email + " e Senha: " + senha);
        }
        usuarios.put(email, senha);
    }

    public void removerUsuario(String email, String senha) {
        if (email.isEmpty() || senha.isEmpty()) {
            throw new IllegalArgumentException("Dados inválidos ou vazios: " + "Email: " + email + " e Senha: " + senha);
        }
        usuarios.remove(email, senha);
    }

    @Override
    protected boolean saoCredenciaisValidas(Credenciais credenciais) {
        return credenciais.getEmail() != null && !credenciais.getEmail().isEmpty()
                && credenciais.getSenha() != null && !credenciais.getSenha().isEmpty();
    }

    @Override
    protected ResultadoAutenticacao realizarAutenticacao(Credenciais credenciais) throws ExcecaoAutenticacao {
        String email = credenciais.getEmail();
        String senha = credenciais.getSenha();

        if (usuarios.containsKey(email) && usuarios.get(email).equals(senha)) {
            return new ResultadoAutenticacao(true, "Usuário autenticado com sucesso.");
        } else {
            return new ResultadoAutenticacao(false, "E-mail ou senha incorretos.");
        }
    }
}
