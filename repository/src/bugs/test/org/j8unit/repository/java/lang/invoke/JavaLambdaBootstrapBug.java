package org.j8unit.repository.java.lang.invoke;

import static java.util.Arrays.stream;
import static org.junit.Assert.assertArrayEquals;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.Test;

public class JavaLambdaBootstrapBug {

    public static enum Foobar
    implements Supplier<String> {
        FOO,
        BAR;

        @Override
        public String get() {
            return this.name();
        }
    }

    public static <E extends Enum<E> & Supplier<String>> String[] lambdaExpression(final Class<? extends E> clazz) {
        return stream(clazz.getEnumConstants()).map(c -> c.get()).toArray(String[]::new);
    }

    public static <E extends Enum<E> & Supplier<String>> String[] methodReferenceOfUnionTypeClass(final Class<? extends E> clazz) {
        return stream(clazz.getEnumConstants()).map(Supplier::get).toArray(String[]::new);
    }

    public static <E extends Enum<E> & Supplier<String>> String[] methodReferenceOfOfUnionTypeInterface(final Class<? extends E> clazz) {
        return stream(clazz.getEnumConstants()).map(E::get).toArray(String[]::new);
    }

    public static String[] methodReferenceOfInterface(final Class<? extends Supplier<?>> clazz) {
        return stream(clazz.getEnumConstants()).map(Supplier::get).toArray(String[]::new);
    }

    public static <E extends Enum<E> & Supplier<String>> String[] explicitMapper(final Class<? extends E> clazz,
                                                                                 final Function<? super E, ? extends String> mapper) {
        return stream(clazz.getEnumConstants()).map(mapper).toArray(String[]::new);
    }

    @Test
    public void testLambdaExpression()
    throws Exception {
        final String[] expecteds = new String[] { "FOO", "BAR" };
        final String[] actuals = lambdaExpression(Foobar.class);
        assertArrayEquals(expecteds, actuals);
    }

    @Test(expected = BootstrapMethodError.class /* because there is a bug! */)
    public void testMethodReferenceOfUnionTypeClass()
    throws Exception {
        final String[] expecteds = new String[] { "FOO", "BAR" };
        final String[] actuals = methodReferenceOfUnionTypeClass(Foobar.class);
        assertArrayEquals(expecteds, actuals);
    }

    @Test(expected = BootstrapMethodError.class /* because there is a bug! */)
    public void testMethodReferenceOfOfUnionTypeInterface()
    throws Exception {
        final String[] expecteds = new String[] { "FOO", "BAR" };
        final String[] actuals = methodReferenceOfOfUnionTypeInterface(Foobar.class);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testMethodReferenceOfInterface()
    throws Exception {
        final String[] expecteds = new String[] { "FOO", "BAR" };
        final String[] actuals = methodReferenceOfInterface(Foobar.class);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testExplicitMapperWithLambdaExpression()
    throws Exception {
        final String[] expecteds = new String[] { "FOO", "BAR" };
        final String[] actuals = explicitMapper(Foobar.class, c -> c.get());
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testExplicitMapperWithInterfaceMethodReference()
    throws Exception {
        final String[] expecteds = new String[] { "FOO", "BAR" };
        final String[] actuals = explicitMapper(Foobar.class, Supplier::get);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testExplicitMapperWithClassMethodReference()
    throws Exception {
        final String[] expecteds = new String[] { "FOO", "BAR" };
        final String[] actuals = explicitMapper(Foobar.class, Foobar::get);
        assertArrayEquals(expecteds, actuals);
    }

}
