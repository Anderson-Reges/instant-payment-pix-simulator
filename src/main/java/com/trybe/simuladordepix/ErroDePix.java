package com.trybe.simuladordepix;

/**
 * Classe que responsavel por ser Superclasse para erros customizados.
 */
public abstract class ErroDePix extends Exception {

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
