public class Entrega {

    public double calcularPAC(float pesoTotal) {
        double valorFinal = 0;

        if (pesoTotal <= 1000) {
            valorFinal = 10;
        } else if (pesoTotal <= 2000) {
            valorFinal = 15;
        } else if (pesoTotal <= 3000) {
            valorFinal = 20;
        } else if (pesoTotal <= 5000) {
            valorFinal = 30;
        } else {
            valorFinal = 40;
        }

        return valorFinal;
    }

    public double calcularSedex(float pesoTotal) {
        double valorFinal = 0;

        if (pesoTotal <= 500) {
            valorFinal = 12.50;
        } else if (pesoTotal <= 750) {
            valorFinal = 20;
        } else if (pesoTotal <= 1200) {
            valorFinal = 30;
        } else if (pesoTotal <= 2000) {
            valorFinal = 45;
        } else {
            double calculoPesoExtra = ((int) ((valorFinal - 2000) / 100)) * 1.50;
            valorFinal = 46.50 + calculoPesoExtra;
        }

        return valorFinal;
    }

}