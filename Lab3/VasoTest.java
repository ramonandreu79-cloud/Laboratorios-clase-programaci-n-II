public class VasoTest {
public static void main(String[] args) throws Exception {
Vaso v = new Vaso(333);
Assert.assertEquals(v.capacidad(), 333);
Assert.assertEquals(v.contenido(), 0);
v.llenar(250);
Assert.assertEquals(v.capacidad(), 333);
Assert.assertEquals(v.contenido(), 250);
v.vaciar(150);
Assert.assertEquals(v.capacidad(), 333);
Assert.assertEquals(v.contenido(), 100);
Assert.assertError(()-> {
v.llenar(250);
});
Assert.assertEquals(v.contenido(), 100);
Assert.assertError(()-> {
v.vaciar(250);
});
Assert.assertEquals(v.contenido(), 100);
final int cantidad = 7;
while (v.contenido() + cantidad < v.capacidad()) {
v.llenar(cantidad);
}
Assert.assertError(()-> {
v.llenar(cantidad);
});
while (cantidad < v.contenido()) {
v.vaciar(cantidad);
}
Assert.assertError(()-> {
v.vaciar(cantidad);
});
System.out.println("Han pasado todas las pruebas");
}
}
