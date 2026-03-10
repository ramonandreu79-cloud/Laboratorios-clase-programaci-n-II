public class Castillos {
public static void main(String[] args) {
Frac castillo =
new Frac(3,5)
.res(new Frac(1,4))
.sum(new Frac(1,10))
.mul(new Frac(3,2))
.res(new Frac(1,5))
.div(new Frac(2,6)
.sum(new Frac(1,3))
.res(new Frac(6,4))
.div(new Frac(2,3))
.sum(new Frac(1,6)));
System.out.println(castillo);
}
}