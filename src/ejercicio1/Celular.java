package ejercicio1;

public class Celular implements Precedable<Celular>{
    private int numero;
    private String titular;

    public Celular(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int precedeA(Celular celular) {
        if(celular.getNumero() < this.numero) {
            return 1;
        }else if(celular.getNumero()> this.numero){
                return -1;
        }else return 0;

    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                '}';
    }
}
