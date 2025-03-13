package com.br.authifyjava;

/**
 *
 * @author tetzner
 */
public class Credenciais {
    private final String email;
    private final String senha;

    public Credenciais(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
}
