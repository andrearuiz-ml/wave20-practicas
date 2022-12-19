package org.example;

public class ConsultaSaldo implements Transaccion {
  @Override
  public void transaccionOk() {
    System.out.println("Consulta de saldo realizada con exito");
  }

  @Override
  public void transaccionNoOk() {
    System.out.println("Consulta de saldo no realizada");
  }
}