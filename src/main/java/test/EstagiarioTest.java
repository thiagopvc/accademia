package test;

import entity.Estagiario;
import entity.Veiculos;

public class EstagiarioTest {
    public static void main(String[] args) {
        Estagiario estagiario = new Estagiario();
        Veiculos veiculos = new Veiculos();

        veiculos.setValor(10000);
        veiculos.setModelo("normal");

        estagiario.venda(veiculos, true, 10);

    }

}
