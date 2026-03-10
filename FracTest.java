public class FracTest {
public static void main(String[] args) {
Frac a = new Frac(1,21);
Frac b = new Frac(2,7);
Frac r = a.sum(b);
Assert.assertEquals(r, new Frac(1,3));
/*Assert.assertEq(a, new Frac(1, 21)); // ejercicio 10
Assert.assertEquals(a,b); // ejercicio 10 solo estas dos líneas*/
}
}