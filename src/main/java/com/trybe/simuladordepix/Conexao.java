package com.trybe.simuladordepix;

import java.io.Closeable;
import java.io.IOException;

/**
 * ‘Interface’ responsavel por implementar contrato de conexão do servidor.
 */
public interface Conexao extends Closeable {

  String enviarPix(int valor, String chave) throws IOException;
}
