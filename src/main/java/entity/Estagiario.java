package entity;

public class Estagiario extends Vendedor{

    Gerente gerente = new Gerente();

    double resultado, juros, juros2;


    public void venda(Veiculos veiculos, boolean parcelado,int parcela){
        if (veiculos.getModelo().equals("normal") && parcelado){
            resultado = veiculos.getValor()/parcela;
            juros = resultado * 0.0189;
            resultado += juros;
            resultado *= parcela;
            juros2 = resultado * 0.15;
            resultado += juros2;

        }else if(veiculos.getModelo().equals("normal") && !parcelado){
            resultado = veiculos.getValor() * 0.15;
            resultado += veiculos.getValor();
            juros = resultado * 0.1;
            resultado -= juros;

        }else if(veiculos.getModelo().equals("especial") && parcelado){
            resultado = veiculos.getValor()/ parcela;
            juros = resultado * 0.0189;
            resultado += juros;
            resultado *= parcela;

        }else if(veiculos.getModelo().equals("especial") && !parcelado){
            resultado = veiculos.getValor();
            juros = resultado * 0.1;
            resultado -= juros;
        }

        gerente.confirmarVenda();

        System.out.println(resultado);
    }


}
