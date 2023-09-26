package com.trybe.simuladordepix;

/**
 * Exception de Erro caso o valor passado não seja positivo.
 */
public class ErroValorNaoPositivo extends ErroDePix {
  public ErroValorNaoPositivo(String mensagem) {
    super(mensagem);
  }
}
