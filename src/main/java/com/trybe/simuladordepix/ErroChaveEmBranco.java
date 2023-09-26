package com.trybe.simuladordepix;

/**
 * Exception de Erro caso a chave esteja em branco.
 */
public class ErroChaveEmBranco extends ErroDePix {
  public ErroChaveEmBranco() {
    super(Mensagens.CHAVE_EM_BRANCO);
  }
}
