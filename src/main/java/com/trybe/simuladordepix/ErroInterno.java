package com.trybe.simuladordepix;

/**
 * Exception de Erro caso ocorra um erro interno no pix.
 */
public class ErroInterno extends ErroDePix {
  public ErroInterno(String mensagem) {
    super(mensagem);
  }
}
