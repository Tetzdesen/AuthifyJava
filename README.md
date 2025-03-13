# AuthifyJava

AuthifyJava é um módulo externo desenvolvido em **Java 17 + Maven** que fornece suporte a diversos métodos de autenticação, como login por senha, códigos via e-mail ou telefone, e autenticação em múltiplas etapas. Ele foi projetado para ser desacoplado e de fácil integração em aplicações Java, garantindo segurança e flexibilidade no controle de acesso.

## Recursos
- **Autenticação por senha** (básica, sem criptografia)
- **Modularidade** para integração fácil via **JitPack**
- **Padrão Adapter e Service** para flexibilidade de implementação

## Features

- **Autenticação por código OTP** (via e-mail ou SMS)
- **Autenticação por Biometria Facial**
- **Autenticação por Biometria Digital**
- **Autenticação multifator**


## Instalação
Adicione o AuthifyJava ao seu projeto utilizando **JitPack**. Primeiro, adicione o repositório ao seu `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Em seguida, adicione a dependência:

```xml
<dependency>
    <groupId>com.github.seu-usuario</groupId>
    <artifactId>AuthifyJava</artifactId>
    <version>version</version>
</dependency>
```

## Uso
### Autenticação por Senha
A autenticação por senha pode ser realizada através da classe `AutenticadorSenha`. Exemplo de uso:

```java
AutenticadorSenha autenticador = new AutenticadorSenha();
Credenciais credenciais = new Credenciais("usuario@email.com", "senha123");

ResultadoAutenticacao resultado = autenticador.autenticar(credenciais);

if (resultado.isSucesso()) {
    System.out.println("Usuário autenticado com sucesso!");
} else {
    System.out.println("Falha na autenticação: " + resultado.getMensagem());
}
```

### Adaptação para Repositório de Usuários

Para integrar com um banco de dados ou repositório de usuários, crie um **Adapter** e um **Service** que implementam a lógica de recuperação de dados.

## Contribuição

Se deseja contribuir para o desenvolvimento do **AuthifyJava**, faça um fork do repositório e envie um pull request com suas melhorias.

## Licença

Este projeto está licenciado sob a **GPL 3.0**. Leia o arquivo `LICENSE` para mais informações.

---
Desenvolvido por Gabriel Tetzner Menegueti.