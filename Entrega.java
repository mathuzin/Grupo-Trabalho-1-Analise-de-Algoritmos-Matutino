public class Entrega {

    public String calcularPAC(float pesoTotal) {
        float valorFinal = 0;

        if (pesoTotal <= 1) {
            valorFinal = 10;
        } else if (pesoTotal <= 2) {
            valorFinal = 15;
        } else if (pesoTotal <= 3) {
            valorFinal = 20;
        } else if (pesoTotal <= 5) {
            valorFinal = 30;
        } else if (pesoTotal > 5) {
            valorFinal = 40;
        }

        return "Valor final: " + valorFinal;
    }

    public String calcularSedex(float pesoTotal) {
        float valorFinal = 0;

        if (pesoTotal <= 1) {
            valorFinal = 10;
        } else if (pesoTotal <= 2) {
            valorFinal = 15;
        } else if (pesoTotal <= 3) {
            valorFinal = 20;
        } else if (pesoTotal <= 5) {
            valorFinal = 30;
        } else if (pesoTotal > 5) {
            valorFinal = 40;
        }

        return "Valor final: " + valorFinal;
    }

    }

}
