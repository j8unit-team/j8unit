package org.j8unit.tools.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singleton;
import static org.j8unit.tools.util.NamingUtilities.JAVA_LANG;
import static org.j8unit.tools.util.NamingUtilities.canonicalClassOf;
import static org.j8unit.tools.util.NamingUtilities.canonicalNameOf;
import static org.j8unit.tools.util.NamingUtilities.canonicalNameWithTypeParameterDefinitionsOf;
import static org.j8unit.tools.util.NamingUtilities.canonicalNameWithTypeParameterNamesOf;
import static org.j8unit.tools.util.NamingUtilities.canonicalNameWithUnboundTypeParameterNamesOf;
import static org.j8unit.tools.util.NamingUtilities.createTypeParametersUsage;
import static org.j8unit.tools.util.NamingUtilities.javadocNameOf;
import static org.j8unit.tools.util.NamingUtilities.listOfTypeParameterDefinitionsOf;
import static org.j8unit.tools.util.NamingUtilities.listOfTypeParameterNamesOf;
import static org.j8unit.tools.util.NamingUtilities.listOfUnboundTypeParameterNamesOf;
import static org.j8unit.tools.util.NamingUtilities.simpleCanonicalClassOf;
import static org.j8unit.tools.util.NamingUtilities.simpleCanonicalNameOf;
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
import org.j8unit.tools.util.NamingUtilities;
import org.j8unit.tools.util.Utilities;
import org.junit.Test;

public class NamingUtilitiesTest {

    @Test
    public void testJavaLangValue()
    throws Exception {
        assertEquals("java.lang", JAVA_LANG);
    }

    @Test
    public void test_csv()
    throws Exception {
        assertEquals("", Utilities.csv(emptyList()));
        assertEquals("Foo", Utilities.csv(singleton("Foo")));
        assertEquals("Foo, Bar", Utilities.csv(asList("Foo", "Bar")));
    }

    @Test
    public void test_bscv()
    throws Exception {
        assertEquals("", Utilities.bcsv(emptyList()));
        assertEquals("<Foo>", Utilities.bcsv(singleton("Foo")));
        assertEquals("<Foo, Bar>", Utilities.bcsv(asList("Foo", "Bar")));
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
        assertEquals("Object", canonicalNameOf(Object.class));
        assertEquals("Object[]", canonicalNameOf(Object[].class));
        assertEquals("Object[][][]", canonicalNameOf(Object[][][].class));
        assertEquals("java.util.Map.Entry", canonicalNameOf(Map.Entry.class));
        assertEquals("java.util.Map.Entry[]", canonicalNameOf(Map.Entry[].class));
        assertEquals("java.util.Map.Entry[][][]", canonicalNameOf(Map.Entry[][][].class));
    }

    @Test
    public void test_canonicalClassOf()
    throws Exception {
        assertEquals("byte.class", canonicalClassOf(byte.class));
        assertEquals("byte[][].class", canonicalClassOf(byte[][].class));
        assertEquals("Object.class", canonicalClassOf(Object.class));
        assertEquals("Object[].class", canonicalClassOf(Object[].class));
        assertEquals("Object[][][].class", canonicalClassOf(Object[][][].class));
        assertEquals("java.util.Map.Entry.class", canonicalClassOf(Map.Entry.class));
        assertEquals("java.util.Map.Entry[].class", canonicalClassOf(Map.Entry[].class));
        assertEquals("java.util.Map.Entry[][][].class", canonicalClassOf(Map.Entry[][][].class));
    }

    @Test
    public void test_relativeCanonicalNameOf()
    throws Exception {
        assertEquals("byte", canonicalNameOf(byte.class, Object.class));
        assertEquals("byte[][]", canonicalNameOf(byte[][].class, Object.class));
        assertEquals("Object", canonicalNameOf(Object.class, Object.class));
        assertEquals("Object[]", canonicalNameOf(Object[].class, Object.class));
        assertEquals("Object[][][]", canonicalNameOf(Object[][][].class, Object.class));
        assertEquals("java.util.Map.Entry", canonicalNameOf(Map.Entry.class, Object.class));
        assertEquals("java.util.Map.Entry[]", canonicalNameOf(Map.Entry[].class, Object.class));
        assertEquals("java.util.Map.Entry[][][]", canonicalNameOf(Map.Entry[][][].class, Object.class));

        assertEquals("byte", canonicalNameOf(byte.class, Object.class.getPackage()));
        assertEquals("byte[][]", canonicalNameOf(byte[][].class, Object.class.getPackage()));
        assertEquals("Object", canonicalNameOf(Object.class, Object.class.getPackage()));
        assertEquals("Object[]", canonicalNameOf(Object[].class, Object.class.getPackage()));
        assertEquals("Object[][][]", canonicalNameOf(Object[][][].class, Object.class.getPackage()));
        assertEquals("java.util.Map.Entry", canonicalNameOf(Map.Entry.class, Object.class.getPackage()));
        assertEquals("java.util.Map.Entry[]", canonicalNameOf(Map.Entry[].class, Object.class.getPackage()));
        assertEquals("java.util.Map.Entry[][][]", canonicalNameOf(Map.Entry[][][].class, Object.class.getPackage()));

        assertEquals("byte", canonicalNameOf(byte.class, "java.lang"));
        assertEquals("byte[][]", canonicalNameOf(byte[][].class, "java.lang"));
        assertEquals("Object", canonicalNameOf(Object.class, "java.lang"));
        assertEquals("Object[]", canonicalNameOf(Object[].class, "java.lang"));
        assertEquals("Object[][][]", canonicalNameOf(Object[][][].class, "java.lang"));
        assertEquals("java.util.Map.Entry", canonicalNameOf(Map.Entry.class, "java.lang"));
        assertEquals("java.util.Map.Entry[]", canonicalNameOf(Map.Entry[].class, "java.lang"));
        assertEquals("java.util.Map.Entry[][][]", canonicalNameOf(Map.Entry[][][].class, "java.lang"));
    }

    @Test
    public void test_relativeCanonicalClassOf()
    throws Exception {
        assertEquals("byte.class", canonicalClassOf(byte.class, Object.class));
        assertEquals("byte[][].class", canonicalClassOf(byte[][].class, Object.class));
        assertEquals("Object.class", canonicalClassOf(Object.class, Object.class));
        assertEquals("Object[].class", canonicalClassOf(Object[].class, Object.class));
        assertEquals("Object[][][].class", canonicalClassOf(Object[][][].class, Object.class));
        assertEquals("java.util.Map.Entry.class", canonicalClassOf(Map.Entry.class, Object.class));
        assertEquals("java.util.Map.Entry[].class", canonicalClassOf(Map.Entry[].class, Object.class));
        assertEquals("java.util.Map.Entry[][][].class", canonicalClassOf(Map.Entry[][][].class, Object.class));

        assertEquals("byte.class", canonicalClassOf(byte.class, Object.class.getPackage()));
        assertEquals("byte[][].class", canonicalClassOf(byte[][].class, Object.class.getPackage()));
        assertEquals("Object.class", canonicalClassOf(Object.class, Object.class.getPackage()));
        assertEquals("Object[].class", canonicalClassOf(Object[].class, Object.class.getPackage()));
        assertEquals("Object[][][].class", canonicalClassOf(Object[][][].class, Object.class.getPackage()));
        assertEquals("java.util.Map.Entry.class", canonicalClassOf(Map.Entry.class, Object.class.getPackage()));
        assertEquals("java.util.Map.Entry[].class", canonicalClassOf(Map.Entry[].class, Object.class.getPackage()));
        assertEquals("java.util.Map.Entry[][][].class", canonicalClassOf(Map.Entry[][][].class, Object.class.getPackage()));

        assertEquals("byte.class", canonicalClassOf(byte.class, "java.lang"));
        assertEquals("byte[][].class", canonicalClassOf(byte[][].class, "java.lang"));
        assertEquals("Object.class", canonicalClassOf(Object.class, "java.lang"));
        assertEquals("Object[].class", canonicalClassOf(Object[].class, "java.lang"));
        assertEquals("Object[][][].class", canonicalClassOf(Object[][][].class, "java.lang"));
        assertEquals("java.util.Map.Entry.class", canonicalClassOf(Map.Entry.class, "java.lang"));
        assertEquals("java.util.Map.Entry[].class", canonicalClassOf(Map.Entry[].class, "java.lang"));
        assertEquals("java.util.Map.Entry[][][].class", canonicalClassOf(Map.Entry[][][].class, "java.lang"));
    }

    @Test
    public void test_javadocNameOf()
    throws Exception {
        assertEquals("Object#Object()", javadocNameOf(Object.class.getConstructors()[0]));
        assertEquals("String#String()", javadocNameOf(String.class.getConstructor()));
        assertEquals("String#String(String)", javadocNameOf(String.class.getConstructor(String.class)));
        assertEquals("String#String(byte[], java.nio.charset.Charset)", javadocNameOf(String.class.getConstructor(byte[].class, Charset.class)));
        assertEquals("java.util.List#equals(Object)", javadocNameOf(List.class.getMethod("equals", Object.class)));
        assertEquals("java.util.Optional#ofNullable(Object)", javadocNameOf(Optional.class.getMethod("ofNullable", Object.class)));
        // varargs
        assertEquals("String#format(String, Object...)", javadocNameOf(String.class.getMethod("format", String.class, Object[].class)));
        assertEquals("java.util.Arrays#asList(Object...)", javadocNameOf(Arrays.class.getMethod("asList", Object[].class)));
        // re-location
        assertEquals("java.util.Map.Entry#equals(Object)", javadocNameOf(Map.Entry.class, Object.class.getMethod("equals", Object.class)));
        assertEquals("java.util.Map.Entry#toString()", javadocNameOf(Map.Entry.class, Object.class.getMethod("toString")));
    }

    @Test
    public void test_Enum()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends Enum> clazz = Enum.class;
        // class based
        assertEquals("Enum", simpleCanonicalNameOf(clazz));
        assertEquals("Enum", canonicalNameOf(clazz));
        assertEquals("Enum.class", simpleCanonicalClassOf(clazz));
        assertEquals("Enum.class", canonicalClassOf(clazz));
        assertEquals(asList("?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("E"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("E extends Enum<E>"), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("Enum<?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("Enum<E>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("Enum<E extends Enum<E>>", canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("E", createTypeParametersUsage(clazz));
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
        assertEquals("Supplier.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.util.function.Supplier.class", canonicalClassOf(clazz));
        assertEquals(asList("?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("T"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("T"), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.function.Supplier<?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("java.util.function.Supplier<T>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("java.util.function.Supplier<T>", canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("T", createTypeParametersUsage(clazz));
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
        assertEquals("Entry.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.util.Map.Entry.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.Map.Entry<?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("java.util.Map.Entry<K, V>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("java.util.Map.Entry<K, V>", canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("K, V", createTypeParametersUsage(clazz));
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
        assertEquals("SimpleImmutableEntry.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<K, V>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<K, V>", canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("K, V", createTypeParametersUsage(clazz));
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
        assertEquals("XmlAdapter.class", simpleCanonicalClassOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("ValueType", "BoundType"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("ValueType", "BoundType"), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<ValueType, BoundType>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<ValueType, BoundType>", canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("ValueType, BoundType", createTypeParametersUsage(clazz));
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
        assertEquals("HexBinaryAdapter.class", simpleCanonicalClassOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter.class", canonicalClassOf(clazz));
        assertEquals(emptyList(), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(emptyList(), listOfTypeParameterNamesOf(clazz));
        assertEquals(emptyList(), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("", createTypeParametersUsage(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("String, byte[]", createTypeParametersUsage(genericSuperClass));
    }

    @Test
    public void test_OfPrimitive()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends OfPrimitive> clazz = Spliterator.OfPrimitive.class;
        // class based
        assertEquals("OfPrimitive", simpleCanonicalNameOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive", canonicalNameOf(clazz));
        assertEquals("OfPrimitive.class", simpleCanonicalClassOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("T", "T_CONS", "T_SPLITR"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("T", "T_CONS", "T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>"), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive<?, ?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>>",
                     canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("T, T_CONS, T_SPLITR", createTypeParametersUsage(clazz));
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
        assertEquals("Object", canonicalNameOf(clazz));
        assertEquals("Object.class", simpleCanonicalClassOf(clazz));
        assertEquals("Object.class", canonicalClassOf(clazz));
        assertEquals(emptyList(), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(emptyList(), listOfTypeParameterNamesOf(clazz));
        assertEquals(emptyList(), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("Object", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("Object", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("Object", canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("", createTypeParametersUsage(clazz));
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
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.A", canonicalNameOf(clazz));
        assertEquals("A.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.A.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("X", "Y"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("X extends Comparable<Y>", "Y extends Enum<Y>"), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.A<?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.A<X, Y>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.A<X extends Comparable<Y>, Y extends Enum<Y>>",
                     canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("X, Y", createTypeParametersUsage(clazz));
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
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.B", canonicalNameOf(clazz));
        assertEquals("B.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.B.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("S", "U", "T", "V"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("S extends T", "U extends Comparable<V>", "T", "V extends Enum<V>"), listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.B<?, ?, ?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.B<S, U, T, V>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.B<S extends T, U extends Comparable<V>, T, V extends Enum<V>>",
                     canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("S, U, T, V", createTypeParametersUsage(clazz));
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
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.C", canonicalNameOf(clazz));
        assertEquals("C.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.C.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("S", "U", "V"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("S extends java.util.Formatter.BigDecimalLayoutForm", "U extends Comparable<V>", "V extends Enum<V>"),
                     listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.C<?, ?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.C<S, U, V>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.C<S extends java.util.Formatter.BigDecimalLayoutForm, U extends Comparable<V>, V extends Enum<V>>",
                     canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("S, U, V", createTypeParametersUsage(clazz));
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
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.D", canonicalNameOf(clazz));
        assertEquals("D.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.D.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("S", "U", "V"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("S extends java.util.function.Supplier<?>", "U extends Comparable<V>", "V extends Enum<V>"),
                     listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.D<?, ?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.D<S, U, V>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.D<S extends java.util.function.Supplier<?>, U extends Comparable<V>, V extends Enum<V>>",
                     canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("S, U, V", createTypeParametersUsage(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("S, U, java.util.function.Supplier<?>, V", createTypeParametersUsage(genericSuperClass));
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
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.E", canonicalNameOf(clazz));
        assertEquals("E.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.E.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("S", "U", "V"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("S extends java.util.function.BiFunction<U, V, ?>", "U extends Comparable<V>", "V extends Enum<V>"),
                     listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.E<?, ?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.E<S, U, V>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.E<S extends java.util.function.BiFunction<U, V, ?>, U extends Comparable<V>, V extends Enum<V>>",
                     canonicalNameWithTypeParameterDefinitionsOf(clazz));
        // typed based
        assertEquals("S, U, V", createTypeParametersUsage(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("S, U, java.util.function.BiFunction<U, V, ?>, V", createTypeParametersUsage(genericSuperClass));
    }

    private static interface NamespaceTest<A extends NamingUtilities, B extends String, C extends java.util.Map.Entry<K, V>, K, V> {
    }

    @Test
    public void test_NamespaceTest()
    throws Exception {
        final @SuppressWarnings("rawtypes") Class<? extends NamespaceTest> clazz = NamespaceTest.class;
        // class based
        assertEquals("NamespaceTest", simpleCanonicalNameOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.NamespaceTest", canonicalNameOf(clazz));
        assertEquals("NamespaceTest.class", simpleCanonicalClassOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.NamespaceTest.class", canonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?", "?", "?"), listOfUnboundTypeParameterNamesOf(clazz));
        assertEquals(asList("A", "B", "C", "K", "V"), listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("A extends org.j8unit.tools.util.NamingUtilities", "B extends String", "C extends java.util.Map.Entry<K, V>", "K", "V"),
                     listOfTypeParameterDefinitionsOf(clazz));
        assertEquals(asList("A extends NamingUtilities", "B extends String", "C extends java.util.Map.Entry<K, V>", "K", "V"),
                     listOfTypeParameterDefinitionsOf(clazz, "org.j8unit.tools.util"));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.NamespaceTest<?, ?, ?, ?, ?>", canonicalNameWithUnboundTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.NamespaceTest<A, B, C, K, V>", canonicalNameWithTypeParameterNamesOf(clazz));
        assertEquals("org.j8unit.tools.util.NamingUtilitiesTest.NamespaceTest<A extends org.j8unit.tools.util.NamingUtilities, B extends String, C extends java.util.Map.Entry<K, V>, K, V>",
                     canonicalNameWithTypeParameterDefinitionsOf(clazz));
        assertEquals("NamingUtilitiesTest.NamespaceTest<A extends NamingUtilities, B extends String, C extends java.util.Map.Entry<K, V>, K, V>",
                     canonicalNameWithTypeParameterDefinitionsOf(clazz, "org.j8unit.tools.util"));
        // typed based
        assertEquals("A, B, C, K, V", createTypeParametersUsage(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals("", createTypeParametersUsage(genericSuperClass));
    }

}
