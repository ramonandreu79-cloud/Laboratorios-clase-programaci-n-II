public class Assert {
private Assert() {
}
public static void assertTrue(boolean c) {
if (!c)
throw new RuntimeException("\nERROR: la condición no es cierta");
}
public static void assertEq(Object a, Object b) {
if (a != b)
throw new RuntimeException(String.format(
"\nERROR: Los objetos 0x %08x y 0x %08x NO son el MISMO objeto",
System.identityHashCode(a),
System.identityHashCode(b)
));
}
public static void assertNotEq(Object a, Object b) {
if (a == b)
throw new RuntimeException(String.format(
"\nERROR: Los objetos 0x %08x y 0x %08x SON el MISMO objeto",
System.identityHashCode(a),
System.identityHashCode(b)
));
}
public static void assertEquals(Object a, Object b) {
if (!a.equals(b))
throw new RuntimeException(String.format(
"\nERROR: Los objetos \" %s\" (0x %08x) y \" %s\" (0x %08x) NO son IGUALES",
a,
System.identityHashCode(a),
b,
System.identityHashCode(b)
));
}
public static void assertNotEquals(Object a, Object b) {
if (a.equals(b))
throw new RuntimeException(String.format(
"\nERROR: Los objetos \" %s\" (0x %08x) y \" %s\" (0x %08x) SON IGUALES",
a,
System.identityHashCode(a),
b,
System.identityHashCode(b)
));
}
}