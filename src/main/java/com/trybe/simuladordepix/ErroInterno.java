package com.trybe.simuladordepix;

/**
 * Exception de Erro caso ocorra um erro interno no pix.
 */
public class ErroInterno extends ErroDePix {
  public ErroInterno() {
    super(Mensagens.ERRO_INTERNO);
  }
}
