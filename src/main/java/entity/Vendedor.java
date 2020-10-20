package entity;

public class Vendedor {

    double resultado, juros, juros2;


    public void venda(Veiculos veiculos, boolean parcelado, int parcela) {
        resultado =0;
        juros = 0;
        juros2 = 0;

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

        System.out.println(resultado);
    }
}
