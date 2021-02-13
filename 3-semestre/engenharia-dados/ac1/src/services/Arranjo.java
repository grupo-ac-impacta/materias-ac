package services;

public class Arranjo {
    Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};

    public int menor() {
        Integer smaller = this.soma();

        for(int i = 0; i < a.length; i++){
            if(smaller > a[i]) smaller = a[i];
        }

        return smaller;
    }

    public int maior() {
        return 0;
    }

    public int soma() {
        Integer sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public double repeticoes(int i) {
        return 0;
    }
}
