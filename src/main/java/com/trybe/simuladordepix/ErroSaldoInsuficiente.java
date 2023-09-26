package com.trybe.simuladordepix;

/**
 * Exception de Erro caso o saldo da conta seja inferior ao transferido.
 */
public class ErroSaldoInsuficiente extends ErroDePix {
  public ErroSaldoInsuficiente() {
    super(Mensagens.SALDO_INSUFICIENTE);
  }
}
