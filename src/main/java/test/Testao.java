package test;

import entity.Estagiario;
import entity.Gerente;
import entity.Veiculos;
import entity.Vendedor;

import java.util.Scanner;

public class Testao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Veiculos veiculos = new Veiculos();
        Estagiario estagiario = new Estagiario();
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();

        int op = 0;

        do {
            System.out.println("Escolha a opcao\n1 - Cadastrar carro\n2 - Realizar venda\n3 - Sair");
            op = scanner.nextInt();
            switch (op){
                case 1:

                    System.out.println("Digite o nome do modelo (normal ou especial)");
                    String modelo = scanner.next();
                    modelo.toLowerCase();
                    veiculos.setModelo(modelo);

                    System.out.println("Digite a cor do carro");
                    veiculos.setCor(scanner.next());

                    System.out.println("Digite o ano do carro");
                    veiculos.setAno(scanner.nextInt());

                    System.out.println("Digite a placa do carro");
                    veiculos.setPlaca(scanner.next());

                    System.out.println("Digite o valor do carro");
                    veiculos.setValor(scanner.nextDouble());

                    break;

                case 2:
                    System.out.println("Digite a opcao de venda\n1 - Estagiario\n2 - Vendedor\n3 - Gerente");
                    int op2 = scanner.nextInt();
                    System.out.println("Digite se é parcelado ou nao (true or false)");
                    boolean parcelado = scanner.nextBoolean();
                    int parcela = 0;
                    if (parcelado){
                        System.out.println("Quantas parcelas");
                        parcela = scanner.nextInt();
                    }

                    switch (op2){
                        case 1:
                            estagiario.venda(veiculos, parcelado, parcela);
                            break;

                        case 2:
                            vendedor.venda(veiculos, parcelado, parcela);
                            break;

                        case 3:
                            gerente.venda(veiculos, parcelado, parcela);
                            break;

                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
            }
        }while(op != 3);
    }
}
