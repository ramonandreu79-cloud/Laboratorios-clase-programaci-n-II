public class Frac {
    private final int num;
    private final int den;

    public Frac(int p, int q) {
        if (q == 0) {
            throw new IllegalArgumentException("den no puede ser 0");
        }

        int comun = mcd(p,q);

        int a = p / comun;
        int b = q / comun;

        if (b < 0) {
            a = -a;
            b = -b;
        }

        this.num = a;
        this.den = b;
    }

    public String toString() {
        return this.num + " / " + this.den;
    }

    public Frac sum(Frac f) {
        int n = this.num * f.den + this.den * f.num;
        int d = this.den * f.den;
        
        Frac resultado = new Frac(n,d);

        return resultado;
    }

    public Frac res(Frac f) {
        int n = this.num * f.den - this.den * f.num;
        int d = this.den * f.den;

        Frac resultado = new Frac(n,d);
        
        return resultado;
    }

    public Frac mul(Frac f) {
        int n = this.num * f.num;
        int d = this.den * f.den;

        Frac resultado = new Frac(n,d);

        return resultado;
    }

    public Frac div(Frac f) {
        int n = this.num * f.den;
        int d = this.den * f.num;

        Frac resultado = new Frac(n,d);

        return resultado;
    }

    private int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
    
        while (b != 0) {
            
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    } 
          
}

