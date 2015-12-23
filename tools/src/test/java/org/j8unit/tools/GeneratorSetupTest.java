package org.j8unit.tools;

import static org.j8unit.tools.GeneratorSetup.arrayDimensionOf;
import static org.j8unit.tools.GeneratorSetup.baseComponentTypeOf;
import static org.j8unit.tools.GeneratorSetup.canonicalClassOf;
import static org.j8unit.tools.GeneratorSetup.canonicalNameOf;
import static org.j8unit.tools.GeneratorSetup.classNameWithTypeParametersDefinitionsOf;
import static org.j8unit.tools.GeneratorSetup.classNameWithTypeParametersNamesOf;
import static org.j8unit.tools.GeneratorSetup.classNameWithUnboundTypeParametersOf;
import static org.j8unit.tools.GeneratorSetup.createTypeParametersUsage;
import static org.j8unit.tools.GeneratorSetup.javadocNameOf;
import static org.j8unit.tools.GeneratorSetup.simpleCanonicalClassOf;
import static org.j8unit.tools.GeneratorSetup.simpleCanonicalNameOf;
import static org.j8unit.tools.GeneratorSetup.typeParametersDefinitionsOf;
import static org.j8unit.tools.GeneratorSetup.typeParametersNamesOf;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterator.OfPrimitive;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.junit.Test;

public class GeneratorSetupTest {

    @Test
    public void test_baseComponentTypeOf()
    throws Exception {
        assertEquals(byte.class, baseComponentTypeOf(byte.class));
        assertEquals(byte.class, baseComponentTypeOf(byte[][].class));
        assertEquals(Object.class, baseComponentTypeOf(Object.class));
        assertEquals(Object.class, baseComponentTypeOf(Object[].class));
        assertEquals(Object.class, baseComponentTypeOf(Object[][][].class));
        assertEquals(Map.Entry.class, baseComponentTypeOf(Map.Entry.class));
        assertEquals(Map.Entry.class, baseComponentTypeOf(Map.Entry[].class));
        assertEquals(Map.Entry.class, baseComponentTypeOf(Map.Entry[][][].class));
    }

    @Test
    public void test_arrayDimensionOf()
    throws Exception {
        assertEquals(0, arrayDimensionOf(byte.class));
        assertEquals(2, arrayDimensionOf(byte[][].class));
        assertEquals(0, arrayDimensionOf(Object.class));
        assertEquals(1, arrayDimensionOf(Object[].class));
        assertEquals(3, arrayDimensionOf(Object[][][].class));
        assertEquals(0, arrayDimensionOf(Map.Entry.class));
        assertEquals(1, arrayDimensionOf(Map.Entry[].class));
        assertEquals(3, arrayDimensionOf(Map.Entry[][][].class));
    }

    @Test
    public void test_simpleCanonicalNameOf()
    throws Exception {
        // packages
        assertEquals("java.lang", canonicalNameOf(Object.class.getPackage()));
        assertEquals("java.util", canonicalNameOf(Map.Entry.class.getPackage()));
        // classes
        assertEquals("byte", simpleCanonicalNameOf(byte.class));
        assertEquals("byte[][]", simpleCanonicalNameOf(byte[][].class));
        assertEquals("Object", simpleCanonicalNameOf(Object.class));
        assertEquals("Object[]", simpleCanonicalNameOf(Object[].class));
        assertEquals("Object[][][]", simpleCanonicalNameOf(Object[][][].class));
        assertEquals("Entry", simpleCanonicalNameOf(Map.Entry.class));
        assertEquals("Entry[]", simpleCanonicalNameOf(Map.Entry[].class));
        assertEquals("Entry[][][]", simpleCanonicalNameOf(Map.Entry[][][].class));
    }

    @Test
    public void test_simpleCanonicalClassOf()
    throws Exception {
        assertEquals("byte.class", simpleCanonicalClassOf(byte.class));
        assertEquals("byte[][].class", simpleCanonicalClassOf(byte[][].class));
        assertEquals("Object.class", simpleCanonicalClassOf(Object.class));
        assertEquals("Object[].class", simpleCanonicalClassOf(Object[].class));
        assertEquals("Object[][][].class", simpleCanonicalClassOf(Object[][][].class));
        assertEquals("Entry.class", simpleCanonicalClassOf(Map.Entry.class));
        assertEquals("Entry[].class", simpleCanonicalClassOf(Map.Entry[].class));
        assertEquals("Entry[][][].class", simpleCanonicalClassOf(Map.Entry[][][].class));
    }

    @Test
    public void test_canonicalNameOf()
    throws Exception {
        assertEquals("byte", canonicalNameOf(byte.class));
        assertEquals("byte[][]", canonicalNameOf(byte[][].class));
        assertEquals("java.lang.Object", canonicalNameOf(Object.class));
        assertEquals("java.lang.Object[]", canonicalNameOf(Object[].class));
        assertEquals("java.lang.Object[][][]", canonicalNameOf(Object[][][].class));
        assertEquals("java.util.Map.Entry", canonicalNameOf(Map.Entry.class));
        assertEquals("java.util.Map.Entry[]", canonicalNameOf(Map.Entry[].class));
        assertEquals("java.util.Map.Entry[][][]", canonicalNameOf(Map.Entry[][][].class));
    }

    @Test
    public void test_canonicalClassOf()
    throws Exception {
        assertEquals("byte.class", canonicalClassOf(byte.class));
        assertEquals("byte[][].class", canonicalClassOf(byte[][].class));
        assertEquals("java.lang.Object.class", canonicalClassOf(Object.class));
        assertEquals("java.lang.Object[].class", canonicalClassOf(Object[].class));
        assertEquals("java.lang.Object[][][].class", canonicalClassOf(Object[][][].class));
        assertEquals("java.util.Map.Entry.class", canonicalClassOf(Map.Entry.class));
        assertEquals("java.util.Map.Entry[].class", canonicalClassOf(Map.Entry[].class));
        assertEquals("java.util.Map.Entry[][][].class", canonicalClassOf(Map.Entry[][][].class));
    }

    @Test
    public void test_javadocNameOf()
    throws Exception {
        assertEquals("java.lang.Object#Object()", javadocNameOf(Object.class.getConstructors()[0]));
        assertEquals("java.lang.String#String()", javadocNameOf(String.class.getConstructor()));
        assertEquals("java.lang.String#String(java.lang.String)", javadocNameOf(String.class.getConstructor(String.class)));
        assertEquals("java.lang.String#String(byte[], java.nio.charset.Charset)", javadocNameOf(String.class.getConstructor(byte[].class, Charset.class)));
        assertEquals("java.util.List#equals(java.lang.Object)", javadocNameOf(List.class.getMethod("equals", Object.class)));
        assertEquals("java.util.Optional#ofNullable(java.lang.Object)", javadocNameOf(Optional.class.getMethod("ofNullable", Object.class)));
        // varargs
        assertEquals("java.lang.String#format(java.lang.String, java.lang.Object...)",
                     javadocNameOf(String.class.getMethod("format", String.class, Object[].class)));
        assertEquals("java.util.Arrays#asList(java.lang.Object...)", javadocNameOf(Arrays.class.getMethod("asList", Object[].class)));
        // re-location
        assertEquals("java.util.Map.Entry#equals(java.lang.Object)", javadocNameOf(Map.Entry.class, Object.class.getMethod("equals", Object.class)));
        assertEquals("java.util.Map.Entry#toString()", javadocNameOf(Map.Entry.class, Object.class.getMethod("toString")));
    }

    @Test
    public void test_Enum()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends Enum> clazz = Enum.class;
        // class based
        assertEquals("Enum", simpleCanonicalNameOf(clazz));
        assertEquals("java.lang.Enum", canonicalNameOf(clazz));
        assertEquals("java.lang.Enum", canonicalNameOf(clazz));
        assertEquals("Enum.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.lang.Enum.class", canonicalClassOf(clazz));
        assertEquals("E", typeParametersNamesOf(clazz));
        assertEquals("java.lang.Enum<E>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("E extends java.lang.Enum<E>", typeParametersDefinitionsOf(clazz));
        assertEquals("java.lang.Enum<E extends java.lang.Enum<E>>", classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("java.lang.Enum<?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals("E", createTypeParametersUsage(genericInterfaces[0]));
        assertEquals("", createTypeParametersUsage(genericInterfaces[1]));
    }

    @Test
    public void test_Supplier()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends Supplier> clazz = Supplier.class;
        // class based
        assertEquals("Supplier", simpleCanonicalNameOf(clazz));
        assertEquals("java.util.function.Supplier", canonicalNameOf(clazz));
        assertEquals("java.util.function.Supplier", canonicalNameOf(clazz));
        assertEquals("Supplier.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.util.function.Supplier.class", canonicalClassOf(clazz));
        assertEquals("T", typeParametersNamesOf(clazz));
        assertEquals("java.util.function.Supplier<T>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("T", typeParametersDefinitionsOf(clazz));
        assertEquals("java.util.function.Supplier<T>", classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("java.util.function.Supplier<?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
    }

    @Test
    public void test_Entry()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends Map.Entry> clazz = Map.Entry.class;
        // class based
        assertEquals("Entry", simpleCanonicalNameOf(clazz));
        assertEquals("java.util.Map.Entry", canonicalNameOf(clazz));
        assertEquals("java.util.Map.Entry", canonicalNameOf(clazz));
        assertEquals("Entry.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.util.Map.Entry.class", canonicalClassOf(clazz));
        assertEquals("K, V", typeParametersNamesOf(clazz));
        assertEquals("java.util.Map.Entry<K, V>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("K, V", typeParametersDefinitionsOf(clazz));
        assertEquals("java.util.Map.Entry<K, V>", classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("java.util.Map.Entry<?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
    }

    @Test
    public void test_SimpleImmutableEntry()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends Map.Entry> clazz = AbstractMap.SimpleImmutableEntry.class;
        // class based
        assertEquals("SimpleImmutableEntry", simpleCanonicalNameOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry", canonicalNameOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry", canonicalNameOf(clazz));
        assertEquals("SimpleImmutableEntry.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry.class", canonicalClassOf(clazz));
        assertEquals("K, V", typeParametersNamesOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<K, V>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("K, V", typeParametersDefinitionsOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<K, V>", classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
    }

    @Test
    public void test_XmlAdapter()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends XmlAdapter> clazz = javax.xml.bind.annotation.adapters.XmlAdapter.class;
        // class based
        assertEquals("XmlAdapter", simpleCanonicalNameOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter", canonicalNameOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter", canonicalNameOf(clazz));
        assertEquals("XmlAdapter.class", simpleCanonicalClassOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter.class", canonicalClassOf(clazz));
        assertEquals("ValueType, BoundType", typeParametersNamesOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<ValueType, BoundType>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("ValueType, BoundType", typeParametersDefinitionsOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<ValueType, BoundType>", classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
    }

    @Test
    public void test_HexBinaryAdapter()
    throws Exception {
        final Class<? extends HexBinaryAdapter> clazz = HexBinaryAdapter.class;
        // class based
        assertEquals("HexBinaryAdapter", simpleCanonicalNameOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", canonicalNameOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", canonicalNameOf(clazz));
        assertEquals("HexBinaryAdapter.class", simpleCanonicalClassOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter.class", canonicalClassOf(clazz));
        assertEquals("", typeParametersNamesOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("", typeParametersDefinitionsOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("java.lang.String, byte[]", createTypeParametersUsage(genericSuperClass));
    }

    @Test
    public void test_OfPrimitive()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends OfPrimitive> clazz = Spliterator.OfPrimitive.class;
        // class based
        assertEquals("OfPrimitive", simpleCanonicalNameOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive", canonicalNameOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive", canonicalNameOf(clazz));
        assertEquals("OfPrimitive.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive.class", canonicalClassOf(clazz));
        assertEquals("T, T_CONS, T_SPLITR", typeParametersNamesOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("T, T_CONS, T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>", typeParametersDefinitionsOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>>",
                     classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive<?, ?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals("T", createTypeParametersUsage(genericInterfaces[0]));
    }

    @Test
    public void test_Object()
    throws Exception {
        final Class<? extends Object> clazz = Object.class;
        // class based
        assertEquals("Object", simpleCanonicalNameOf(clazz));
        assertEquals("java.lang.Object", canonicalNameOf(clazz));
        assertEquals("java.lang.Object", canonicalNameOf(clazz));
        assertEquals("Object.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.lang.Object.class", canonicalClassOf(clazz));
        assertEquals("", typeParametersNamesOf(clazz));
        assertEquals("java.lang.Object", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("", typeParametersDefinitionsOf(clazz));
        assertEquals("java.lang.Object", classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("java.lang.Object", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
    }

    private static abstract class A<X extends Comparable<Y>, Y extends Enum<Y>>
    implements Comparable<X> {
    }

    @Test
    public void test_A()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends A> clazz = A.class;
        // class based
        assertEquals("A", simpleCanonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.A", canonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.A", canonicalNameOf(clazz));
        assertEquals("A.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.A.class", canonicalClassOf(clazz));
        assertEquals("X, Y", typeParametersNamesOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.A<X, Y>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("X extends java.lang.Comparable<Y>, Y extends java.lang.Enum<Y>", typeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.A<X extends java.lang.Comparable<Y>, Y extends java.lang.Enum<Y>>",
                     classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.A<?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals("X", createTypeParametersUsage(genericInterfaces[0]));
    }

    private static abstract class B<S extends T, U extends Comparable<V>, T, V extends Enum<V>>
    extends A<U, V>
    implements BiFunction<S, T, U> {
    }

    @Test
    public void test_B()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends B> clazz = B.class;
        // class based
        assertEquals("B", simpleCanonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.B", canonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.B", canonicalNameOf(clazz));
        assertEquals("B.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.B.class", canonicalClassOf(clazz));
        assertEquals("S, U, T, V", typeParametersNamesOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.B<S, U, T, V>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("S extends T, U extends java.lang.Comparable<V>, T, V extends java.lang.Enum<V>", typeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.B<S extends T, U extends java.lang.Comparable<V>, T, V extends java.lang.Enum<V>>",
                     classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.B<?, ?, ?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("U, V", createTypeParametersUsage(genericSuperClass));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals("S, T, U", createTypeParametersUsage(genericInterfaces[0]));
    }

    private static abstract class C<S extends java.util.Formatter.BigDecimalLayoutForm, U extends Comparable<V>, V extends Enum<V>>
    extends B<S, U, java.util.Formatter.BigDecimalLayoutForm, V> {
    }

    @Test
    public void test_C()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends C> clazz = C.class;
        // class based
        assertEquals("C", simpleCanonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.C", canonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.C", canonicalNameOf(clazz));
        assertEquals("C.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.C.class", canonicalClassOf(clazz));
        assertEquals("S, U, V", typeParametersNamesOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.C<S, U, V>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("S extends java.util.Formatter.BigDecimalLayoutForm, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>",
                     typeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.C<S extends java.util.Formatter.BigDecimalLayoutForm, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>>",
                     classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.C<?, ?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("S, U, java.util.Formatter.BigDecimalLayoutForm, V", createTypeParametersUsage(genericSuperClass));
    }

    private static abstract class D<S extends Supplier<?>, U extends Comparable<V>, V extends Enum<V>>
    extends B<S, U, Supplier<?>, V> {
    }

    @Test
    public void test_D()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends D> clazz = D.class;
        // class based
        assertEquals("D", simpleCanonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.D", canonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.D", canonicalNameOf(clazz));
        assertEquals("D.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.D.class", canonicalClassOf(clazz));
        assertEquals("S, U, V", typeParametersNamesOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.D<S, U, V>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("S extends java.util.function.Supplier<?>, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>",
                     typeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.D<S extends java.util.function.Supplier<?>, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>>",
                     classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.D<?, ?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperDlass = clazz.getGenericSuperclass();
        assertEquals("S, U, java.util.function.Supplier<?>, V", createTypeParametersUsage(genericSuperDlass));
    }

    private static abstract class E<S extends BiFunction<U, V, ?>, U extends Comparable<V>, V extends Enum<V>>
    extends B<S, U, BiFunction<U, V, ?>, V> {
    }

    @Test
    public void test_E()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends E> clazz = E.class;
        // class based
        assertEquals("E", simpleCanonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.E", canonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.E", canonicalNameOf(clazz));
        assertEquals("E.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.E.class", canonicalClassOf(clazz));
        assertEquals("S, U, V", typeParametersNamesOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.E<S, U, V>", classNameWithTypeParametersNamesOf(clazz));
        assertEquals("S extends java.util.function.BiFunction<U, V, ?>, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>",
                     typeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.E<S extends java.util.function.BiFunction<U, V, ?>, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>>",
                     classNameWithTypeParametersDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.GeneratorSetupTest.E<?, ?, ?>", classNameWithUnboundTypeParametersOf(clazz));
        // typed based
        final Type genericSuperElass = clazz.getGenericSuperclass();
        assertEquals("S, U, java.util.function.BiFunction<U, V, ?>, V", createTypeParametersUsage(genericSuperElass));
    }

    @Test
    public void test_GeneratorSetupBuilder()
    throws Exception {
        final GeneratorSetup pckSetup = GeneratorSetup.forJavaPackage("java.lang") //
                                                      .intoTargetFolder("src/main/java") //
                                                      .asSubPackageOf("org.j8unit.repository") //
                                                      .suffixForInstanceScopeTestClass("Tests") //
                                                      .suffixForClassScopeTestClass("ClassTests") //
                                                      .useTestMethodPrefix("test_") //
                                                      .useTestConstructorPrefix("create_") //
                                                      .capitaliseMethodInfix(false) //
                                                      .overwriteExistingFiles(true) //
                                                      .build();
        final String cName = pckSetup.getSimpleTestMethodName(Object.class.getConstructor());
        assertEquals("create_Object", cName);
        final String mName = pckSetup.getSimpleTestMethodName(Object.class.getMethod("toString"));
        assertEquals("test_toString", mName);
        final String eName = pckSetup.getSimpleTestMethodName(Object.class.getMethod("equals", Object.class));
        assertEquals("test_equals_Object", eName);
    }

    @Test
    public void test_equals()
    throws Exception {
        final GeneratorSetup pckSetup = GeneratorSetup.forJavaPackage("java.lang") //
                                                      .intoTargetFolder("src/main/java") //
                                                      .asSubPackageOf("org.j8unit.repository") //
                                                      .suffixForInstanceScopeTestClass("Tests") //
                                                      .suffixForClassScopeTestClass("ClassTests") //
                                                      .useTestMethodPrefix("test_") //
                                                      .useTestConstructorPrefix("create_") //
                                                      .capitaliseMethodInfix(false) //
                                                      .overwriteExistingFiles(true) //
                                                      .build();
        final GeneratorSetup pckSetup2 = GeneratorSetup.similarTo(pckSetup).build();
        assertEquals(pckSetup, pckSetup2);
    }

}
