package com.trybe.simuladordepix;

/**
 * Exception de Erro caso a chave de transferência não exista.
 */
public class ErroChaveNaoEncontrada extends ErroDePix {
  public ErroChaveNaoEncontrada(String mensagem) {
    super(mensagem);
  }
}
