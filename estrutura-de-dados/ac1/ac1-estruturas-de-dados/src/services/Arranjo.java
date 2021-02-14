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
    	Integer bigger = a[0];

        for(int i = 0; i < a.length; i++){
            if(bigger < a[i]) bigger = a[i];
        }
        
        return bigger;
    }

    public int soma() {
        Integer sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public int repeticoes(int i) {
    	Integer acumulator = 0;
    	
    	for(int count = 0; count < a.length; count++) {
    		if(a[count] == i) {
    			acumulator++;
    			}
    	}
    	
        return acumulator;
    }
}
