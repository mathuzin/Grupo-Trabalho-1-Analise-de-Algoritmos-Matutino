public class Entrega {

    public double calcular(TipoEntrega tipo, double pesoTotal) {
        switch (tipo) {
            case PAC:
                return calcularPAC(pesoTotal);
            case SEDEX:
                return calcularSedex(pesoTotal);
            case RETIRAR:
                return 0;
            default:
                throw new IllegalArgumentException("Tipo de entrega inválido.");
        }
    }

    public double calcularPAC(double pesoTotal) {
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

    public double calcularSedex(double pesoTotal) {
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
            double calculoPesoExtra = ((int) ((pesoTotal - 2000) / 100)) * 1.50;
            valorFinal = 46.50 + calculoPesoExtra;
        }

        return valorFinal;
    }

}