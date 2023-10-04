<h1 align="center">INSTANT-PAYMENT-PIX</h1>

É uma simulação de um processo de transferência bancária via Pix, realizada por meio de um aplicativo mobile. O processo é muito simples: a pessoa usuária do aplicativo preenche um valor e uma chave Pix e o aplicativo envia essas informações para o servidor do banco na nuvem. O foco do projeto vai ser tratar os erros que podem acontecer ao longo desta operação.

  Nesse projeto a dois componentes em Java:
  
1. **Processador de Pix:** é o componente que contém a lógica de negócio da operação. Dadas as entradas (valor e chave Pix), o processador de Pix será responsável por validá-las e enviá-las ao servidor na nuvem, interpretando a resposta recebida.

1. **Controlador de Pix:** é o componente que contém a lógica de apresentação deste fluxo. Ele é responsável por invocar o processador de Pix, passando as informações preenchidas pela pessoa usuária na tela do aplicativo. Também é responsabilidade do componente capturar qualquer erro que possa acontecer durante o processo e informar a pessoa usuária sobre o resultado da operação.

### Tratamento de erros

Durante a operação do Pix, é possível que ocorra uma série de erros:

- Erros de aplicação validados localmente
    - Valor a ser transferido menor ou igual a zero
    - Chave Pix em branco

- Erros de aplicação validados pelo servidor
    - Saldo insuficiente
    - Chave Pix não encontrada
    - Erro interno (por exemplo, falha no servidor)

- Erros de comunicação (por exemplo, timeout de conexão)

Para isso foram criada exceções customizada:

- `ErroValorNaoPositivo`
- `ErroChaveEmBranco`
- `ErroSaldoInsuficiente`
- `ErroChaveNaoEncontrada`
- `ErroInterno`

Cada uma das classes acima foram estendidas da classe `ErroDePix`, cujo código segue abaixo:

- `ErroDePix.java`
```java
public abstract class ErroDePix extends Exception {

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
```

### Languagens/Frameworks/Ferramentas

[![My Skills With Front-End](https://skillicons.dev/icons?i=java,maven)](https://skillicons.dev)

## 🚀 Instalando o projeto

Para instalar o projeto, siga estas etapas:

```
mvn install
```
