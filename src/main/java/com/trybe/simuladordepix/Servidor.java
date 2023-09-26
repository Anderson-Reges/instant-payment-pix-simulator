package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Classe abstrata que serve como contrato para o servidor.
 */
public interface Servidor {

  Conexao abrirConexao() throws IOException;
}
