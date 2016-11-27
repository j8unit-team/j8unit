package org.j8unit.generator.render;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.j8unit.generator.util.Java.JAVA_LANG;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterator.OfPrimitive;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.j8unit.generator.api.render.OriginRenderer;
import org.junit.Test;

@SuppressWarnings("rawtypes")
public class RenderOriginBehaviourTest {

    private static final OriginRenderer ROB = new OriginRenderer() {};

    final static Class<Object> objectClass = Object.class;

    final static Class<Object[]> objectArrayClass = Object[].class;

    final static Class<Iterable> iterableClass = Iterable.class;

    final static Class<Enum> enumClass = Enum.class;

    @Test
    public void testViaObject()
    throws Exception {
        // Package
        assertEquals(JAVA_LANG, ROB.originPackageFor(objectClass).get());
        // Definition
        assertEquals("java.lang.Object", ROB.originCanonicalDefinitionOf(objectClass));
        // Name
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass));
        assertEquals(emptyList(), ROB.listOfTypeParameterWildcardsOf(objectClass));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(objectClass));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(objectClass));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Object.class", ROB.originCanonicalClassOf(objectClass));
        assertEquals("Object", ROB.originBasicNameOf(objectClass));
        assertEquals("Object.class", ROB.originBasicClassOf(objectClass));
        assertEquals("Object", ROB.originSimpleNameOf(objectClass));
        assertEquals("Object.class", ROB.originSimpleClassOf(objectClass));

        assertEquals("java.lang.Object.class", ROB.originCanonicalClassOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(objectClass));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass));
        assertEquals("java.lang.Object.class", ROB.originCanonicalClassOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(objectClass));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass));
        assertEquals("java.lang.Object.class", ROB.originCanonicalClassOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(objectClass));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(objectClass));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(objectClass, ROB::listOfTypeParameterDefinitionsOf));
    }

    @Test
    public void testViaObjectArray()
    throws Exception {
        // Package
        assertFalse(ROB.originPackageFor(objectArrayClass).isPresent());
        // Definition
        assertEquals("java.lang.Object[]", ROB.originCanonicalDefinitionOf(objectArrayClass));
        // Name
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass));
        assertEquals(emptyList(), ROB.listOfTypeParameterWildcardsOf(objectArrayClass));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(objectArrayClass));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(objectArrayClass));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Object[].class", ROB.originCanonicalClassOf(objectArrayClass));
        assertEquals("Object[]", ROB.originBasicNameOf(objectArrayClass));
        assertEquals("Object[].class", ROB.originBasicClassOf(objectArrayClass));
        assertEquals("Object[]", ROB.originSimpleNameOf(objectArrayClass));
        assertEquals("Object[].class", ROB.originSimpleClassOf(objectArrayClass));

        assertEquals("java.lang.Object[].class", ROB.originCanonicalClassOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(objectArrayClass));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass));
        assertEquals("java.lang.Object[].class", ROB.originCanonicalClassOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(objectArrayClass));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass));
        assertEquals("java.lang.Object[].class", ROB.originCanonicalClassOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(objectArrayClass));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(objectArrayClass));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(objectArrayClass, ROB::listOfTypeParameterDefinitionsOf));
    }

    @Test
    public void testViaIterable()
    throws Exception {
        assertEquals("Iterable", ROB.originSimpleNameOf(iterableClass));
        assertEquals("Iterable.class", ROB.originSimpleClassOf(iterableClass));
        assertEquals("java.lang.Iterable", ROB.originCanonicalNameOf(iterableClass));
        assertEquals("java.lang.Iterable.class", ROB.originCanonicalClassOf(iterableClass));
        assertEquals("java.lang.Iterable<?>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("T"), ROB.listOfTypeParameterNamesOf(iterableClass));
        assertEquals(asList("T"), ROB.listOfTypeVariableNamesOf(iterableClass));
        assertEquals("java.lang.Iterable<T>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("T extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(iterableClass));
        assertEquals("java.lang.Iterable<T extends java.lang.Object>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Iterable", ROB.originCanonicalNameOf(iterableClass));
        assertEquals("java.lang.Iterable.class", ROB.originCanonicalClassOf(iterableClass));
        assertEquals("java.lang.Iterable<?>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("T"), ROB.listOfTypeParameterNamesOf(iterableClass));
        assertEquals(asList("T"), ROB.listOfTypeVariableNamesOf(iterableClass));
        assertEquals("java.lang.Iterable<T>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("T extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(iterableClass));
        assertEquals("java.lang.Iterable<T extends java.lang.Object>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Iterable", ROB.originCanonicalNameOf(iterableClass));
        assertEquals("java.lang.Iterable.class", ROB.originCanonicalClassOf(iterableClass));
        assertEquals("java.lang.Iterable<?>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("T"), ROB.listOfTypeParameterNamesOf(iterableClass));
        assertEquals(asList("T"), ROB.listOfTypeVariableNamesOf(iterableClass));
        assertEquals("java.lang.Iterable<T>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("T extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(iterableClass));
        assertEquals("java.lang.Iterable<T extends java.lang.Object>", ROB.originCanonicalNameOf(iterableClass, ROB::listOfTypeParameterDefinitionsOf));
    }

    @Test
    public void testViaEnum()
    throws Exception {
        assertEquals("Enum", ROB.originSimpleNameOf(enumClass));
        assertEquals("Enum.class", ROB.originSimpleClassOf(enumClass));
        assertEquals("java.lang.Enum", ROB.originCanonicalNameOf(enumClass));
        assertEquals("java.lang.Enum.class", ROB.originCanonicalClassOf(enumClass));
        assertEquals("java.lang.Enum<?>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("E"), ROB.listOfTypeParameterNamesOf(enumClass));
        assertEquals(asList("E"), ROB.listOfTypeVariableNamesOf(enumClass));
        assertEquals("java.lang.Enum<E>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("E extends java.lang.Enum<E>"), ROB.listOfTypeParameterDefinitionsOf(enumClass));
        assertEquals("java.lang.Enum<E extends java.lang.Enum<E>>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Enum", ROB.originCanonicalNameOf(enumClass));
        assertEquals("java.lang.Enum.class", ROB.originCanonicalClassOf(enumClass));
        assertEquals("java.lang.Enum<?>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("E"), ROB.listOfTypeParameterNamesOf(enumClass));
        assertEquals(asList("E"), ROB.listOfTypeVariableNamesOf(enumClass));
        assertEquals("java.lang.Enum<E>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("E extends java.lang.Enum<E>"), ROB.listOfTypeParameterDefinitionsOf(enumClass));
        assertEquals("java.lang.Enum<E extends java.lang.Enum<E>>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.lang.Enum", ROB.originCanonicalNameOf(enumClass));
        assertEquals("java.lang.Enum.class", ROB.originCanonicalClassOf(enumClass));
        assertEquals("java.lang.Enum<?>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("E"), ROB.listOfTypeParameterNamesOf(enumClass));
        assertEquals(asList("E"), ROB.listOfTypeVariableNamesOf(enumClass));
        assertEquals("java.lang.Enum<E>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("E extends java.lang.Enum<E>"), ROB.listOfTypeParameterDefinitionsOf(enumClass));
        assertEquals("java.lang.Enum<E extends java.lang.Enum<E>>", ROB.originCanonicalNameOf(enumClass, ROB::listOfTypeParameterDefinitionsOf));
    }

    @Test
    public void testViaList()
    throws Exception {
        final Class<List> clazz = List.class;
        assertEquals("List", ROB.originSimpleNameOf(clazz));
        assertEquals("List.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.util.List", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.List.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.List<?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("E"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("E"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.List<E>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("E extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.List<E extends java.lang.Object>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.util.List", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.List.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.List<?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("E"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("E"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.List<E>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("E extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.List<E extends java.lang.Object>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.util.List", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.List.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.List<?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("E"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("E"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.List<E>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("E extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.List<E extends java.lang.Object>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
    }

    @Test
    public void testViaEntry()
    throws Exception {
        final Class<Entry> clazz = Entry.class;
        assertEquals("Entry", ROB.originSimpleNameOf(clazz));
        assertEquals("Entry.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.util.Map.Entry", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.Map.Entry.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.Map.Entry<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.Map.Entry<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("K extends java.lang.Object", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.Map.Entry<K extends java.lang.Object, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.util.Map.Entry", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.Map.Entry.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.Map.Entry<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.Map.Entry<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("K extends java.lang.Object", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.Map.Entry<K extends java.lang.Object, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.util.Map.Entry", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.Map.Entry.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.Map.Entry<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.Map.Entry<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("K extends java.lang.Object", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.Map.Entry<K extends java.lang.Object, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
    }

    @Test
    public void testViaEnumMap()
    throws Exception {
        final Class<EnumMap> clazz = EnumMap.class;
        assertEquals("EnumMap", ROB.originSimpleNameOf(clazz));
        assertEquals("EnumMap.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.util.EnumMap", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.EnumMap.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.EnumMap<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.EnumMap<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("K extends java.lang.Enum<K>", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.EnumMap<K extends java.lang.Enum<K>, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.util.EnumMap", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.EnumMap.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.EnumMap<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.EnumMap<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("K extends java.lang.Enum<K>", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.EnumMap<K extends java.lang.Enum<K>, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals("java.util.EnumMap", ROB.originCanonicalNameOf(clazz));
        assertEquals("java.util.EnumMap.class", ROB.originCanonicalClassOf(clazz));
        assertEquals("java.util.EnumMap<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        assertEquals("java.util.EnumMap<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals(asList("K extends java.lang.Enum<K>", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.EnumMap<K extends java.lang.Enum<K>, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
    }

    @Test
    public void test_simpleCanonicalNameOf()
    throws Exception {
        assertEquals("java.lang", ROB.originPackageFor(Object.class.getPackage()).get());
        assertEquals("java.util", ROB.originPackageFor(Map.Entry.class.getPackage()).get());
        assertEquals("byte", ROB.originSimpleNameOf(byte.class));
        assertEquals("byte[][]", ROB.originSimpleNameOf(byte[][].class));
        assertEquals("Object", ROB.originSimpleNameOf(Object.class));
        assertEquals("Object[]", ROB.originSimpleNameOf(Object[].class));
        assertEquals("Object[][][]", ROB.originSimpleNameOf(Object[][][].class));
        assertEquals("Entry", ROB.originSimpleNameOf(Map.Entry.class));
        assertEquals("Entry[]", ROB.originSimpleNameOf(Map.Entry[].class));
        assertEquals("Entry[][][]", ROB.originSimpleNameOf(Map.Entry[][][].class));
    }

    @Test
    public void test_originSimpleClassOf()
    throws Exception {
        assertEquals("byte.class", ROB.originSimpleClassOf(byte.class));
        assertEquals("byte[][].class", ROB.originSimpleClassOf(byte[][].class));
        assertEquals("Object.class", ROB.originSimpleClassOf(Object.class));
        assertEquals("Object[].class", ROB.originSimpleClassOf(Object[].class));
        assertEquals("Object[][][].class", ROB.originSimpleClassOf(Object[][][].class));
        assertEquals("Entry.class", ROB.originSimpleClassOf(Map.Entry.class));
        assertEquals("Entry[].class", ROB.originSimpleClassOf(Map.Entry[].class));
        assertEquals("Entry[][][].class", ROB.originSimpleClassOf(Map.Entry[][][].class));
    }

    @Test
    public void test_originCanonicalNameOf()
    throws Exception {
        assertEquals("byte", ROB.originCanonicalNameOf(byte.class));
        assertEquals("byte[][]", ROB.originCanonicalNameOf(byte[][].class));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(Object.class));
        assertEquals("java.lang.Object[]", ROB.originCanonicalNameOf(Object[].class));
        assertEquals("java.lang.Object[][][]", ROB.originCanonicalNameOf(Object[][][].class));
        assertEquals("java.util.Map.Entry", ROB.originCanonicalNameOf(Map.Entry.class));
        assertEquals("java.util.Map.Entry[]", ROB.originCanonicalNameOf(Map.Entry[].class));
        assertEquals("java.util.Map.Entry[][][]", ROB.originCanonicalNameOf(Map.Entry[][][].class));
    }

    @Test
    public void test_originCanonicalClassOf()
    throws Exception {
        assertEquals("byte.class", ROB.originCanonicalClassOf(byte.class));
        assertEquals("byte[][].class", ROB.originCanonicalClassOf(byte[][].class));
        assertEquals("java.lang.Object.class", ROB.originCanonicalClassOf(Object.class));
        assertEquals("java.lang.Object[].class", ROB.originCanonicalClassOf(Object[].class));
        assertEquals("java.lang.Object[][][].class", ROB.originCanonicalClassOf(Object[][][].class));
        assertEquals("java.util.Map.Entry.class", ROB.originCanonicalClassOf(Map.Entry.class));
        assertEquals("java.util.Map.Entry[].class", ROB.originCanonicalClassOf(Map.Entry[].class));
        assertEquals("java.util.Map.Entry[][][].class", ROB.originCanonicalClassOf(Map.Entry[][][].class));
    }

    @Test
    public void test_javadocNameOf()
    throws Exception {
        assertEquals("java.lang.Object#Object()", ROB.javadocNameOf(Object.class.getConstructors()[0]));
        assertEquals("java.lang.String#String()", ROB.javadocNameOf(String.class.getConstructor()));
        assertEquals("java.lang.String#String(java.lang.String)", ROB.javadocNameOf(String.class.getConstructor(String.class)));
        assertEquals("java.lang.String#String(byte[], java.nio.charset.Charset)", ROB.javadocNameOf(String.class.getConstructor(byte[].class, Charset.class)));
        assertEquals("java.util.List#equals(java.lang.Object)", ROB.javadocNameOf(List.class.getMethod("equals", Object.class)));
        assertEquals("java.util.Optional#ofNullable(java.lang.Object)", ROB.javadocNameOf(Optional.class.getMethod("ofNullable", Object.class)));
        assertEquals("java.lang.String#format(java.lang.String, java.lang.Object...)",
                     ROB.javadocNameOf(String.class.getMethod("format", String.class, Object[].class)));
        assertEquals("java.util.Arrays#asList(java.lang.Object...)", ROB.javadocNameOf(Arrays.class.getMethod("asList", Object[].class)));
        assertEquals("java.util.Map.Entry#equals(java.lang.Object)", ROB.javadocNameOf(Map.Entry.class, Object.class.getMethod("equals", Object.class)));
        assertEquals("java.util.Map.Entry#toString()", ROB.javadocNameOf(Map.Entry.class, Object.class.getMethod("toString")));
    }

    @Test
    public void test_Enum()
    throws Exception {
        final Class<? extends Enum> clazz = Enum.class;
        assertEquals("Enum", ROB.originSimpleNameOf(clazz));
        assertEquals("java.lang.Enum", ROB.originCanonicalNameOf(clazz));
        assertEquals("Enum.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.lang.Enum.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("E"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("E extends java.lang.Enum<E>"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.lang.Enum<?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.lang.Enum<E>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.lang.Enum<E extends java.lang.Enum<E>>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("E"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(genericSuperClass));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals(asList("E"), ROB.listOfTypeVariableNamesOf(genericInterfaces[0]));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(genericInterfaces[1]));
    }

    @Test
    public void test_EnumMap()
    throws Exception {
        final Class<? extends EnumMap> clazz = EnumMap.class;
        assertEquals("EnumMap", ROB.originSimpleNameOf(clazz));
        assertEquals("java.util.EnumMap", ROB.originCanonicalNameOf(clazz));
        assertEquals("EnumMap.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.util.EnumMap.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K extends java.lang.Enum<K>", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.EnumMap<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.util.EnumMap<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.util.EnumMap<K extends java.lang.Enum<K>, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(genericSuperClass));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(genericInterfaces[0]));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(genericInterfaces[1]));
    }

    @Test
    public void test_Supplier()
    throws Exception {
        final Class<? extends Supplier> clazz = Supplier.class;
        assertEquals("Supplier", ROB.originSimpleNameOf(clazz));
        assertEquals("java.util.function.Supplier", ROB.originCanonicalNameOf(clazz));
        assertEquals("Supplier.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.util.function.Supplier.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("T"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("T extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.function.Supplier<?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.util.function.Supplier<T>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.util.function.Supplier<T extends java.lang.Object>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("T"), ROB.listOfTypeVariableNamesOf(clazz));
    }

    @Test
    public void test_Entry()
    throws Exception {
        final Class<? extends Map.Entry> clazz = Map.Entry.class;
        assertEquals("Entry", ROB.originSimpleNameOf(clazz));
        assertEquals("java.util.Map.Entry", ROB.originCanonicalNameOf(clazz));
        assertEquals("Entry.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.util.Map.Entry.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K extends java.lang.Object", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.Map.Entry<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.util.Map.Entry<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.util.Map.Entry<K extends java.lang.Object, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
    }

    @Test
    public void test_SimpleImmutableEntry()
    throws Exception {
        final Class<? extends Map.Entry> clazz = AbstractMap.SimpleImmutableEntry.class;
        assertEquals("SimpleImmutableEntry", ROB.originSimpleNameOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry", ROB.originCanonicalNameOf(clazz));
        assertEquals("SimpleImmutableEntry.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("K extends java.lang.Object", "V extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<K, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.util.AbstractMap.SimpleImmutableEntry<K extends java.lang.Object, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(genericSuperClass));
    }

    @Test
    public void test_XmlAdapter()
    throws Exception {
        final Class<? extends XmlAdapter> clazz = javax.xml.bind.annotation.adapters.XmlAdapter.class;
        assertEquals("XmlAdapter", ROB.originSimpleNameOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter", ROB.originCanonicalNameOf(clazz));
        assertEquals("XmlAdapter.class", ROB.originSimpleClassOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("ValueType", "BoundType"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("ValueType extends java.lang.Object", "BoundType extends java.lang.Object"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<ValueType, BoundType>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("javax.xml.bind.annotation.adapters.XmlAdapter<ValueType extends java.lang.Object, BoundType extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("ValueType", "BoundType"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(genericSuperClass));
    }

    @Test
    public void test_HexBinaryAdapter()
    throws Exception {
        final Class<? extends HexBinaryAdapter> clazz = HexBinaryAdapter.class;
        assertEquals("HexBinaryAdapter", ROB.originSimpleNameOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", ROB.originCanonicalNameOf(clazz));
        assertEquals("HexBinaryAdapter.class", ROB.originSimpleClassOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(emptyList(), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("javax.xml.bind.annotation.adapters.HexBinaryAdapter", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(asList("java.lang.String", "byte[]"), ROB.listOfTypeVariableNamesOf(genericSuperClass));
    }

    @Test
    public void test_OfPrimitive()
    throws Exception {
        final Class<? extends OfPrimitive> clazz = Spliterator.OfPrimitive.class;
        assertEquals("OfPrimitive", ROB.originSimpleNameOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive", ROB.originCanonicalNameOf(clazz));
        assertEquals("OfPrimitive.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("T", "T_CONS", "T_SPLITR"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("T extends java.lang.Object", "T_CONS extends java.lang.Object",
                            "T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>"),
                     ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.util.Spliterator.OfPrimitive<?, ?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.util.Spliterator.OfPrimitive<T extends java.lang.Object, T_CONS extends java.lang.Object, T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("T", "T_CONS", "T_SPLITR"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals(asList("T"), ROB.listOfTypeVariableNamesOf(genericInterfaces[0]));
    }

    @Test
    public void test_Object()
    throws Exception {
        final Class<? extends Object> clazz = Object.class;
        assertEquals("Object", ROB.originSimpleNameOf(clazz));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(clazz));
        assertEquals("Object.class", ROB.originSimpleClassOf(clazz));
        assertEquals("java.lang.Object.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(emptyList(), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(emptyList(), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(emptyList(), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("java.lang.Object", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(clazz));
    }

    private static abstract class A<X extends Comparable<Y>, Y extends Enum<Y>>
    implements Comparable<X> {
    }

    @Test
    public void test_A()
    throws Exception {
        final Class<? extends A> clazz = A.class;
        assertEquals("A", ROB.originSimpleNameOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.A", ROB.originCanonicalNameOf(clazz));
        assertEquals("A.class", ROB.originSimpleClassOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.A.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("X", "Y"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("X extends java.lang.Comparable<Y>", "Y extends java.lang.Enum<Y>"), ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.A<?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.A<X, Y>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.A<X extends java.lang.Comparable<Y>, Y extends java.lang.Enum<Y>>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("X", "Y"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(emptyList(), ROB.listOfTypeVariableNamesOf(genericSuperClass));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals(asList("X"), ROB.listOfTypeVariableNamesOf(genericInterfaces[0]));
    }

    private static abstract class B<S extends T, U extends Comparable<V>, T, V extends Enum<V>>
    extends A<U, V>
    implements BiFunction<S, T, U> {
    }

    @Test
    public void test_B()
    throws Exception {
        final Class<? extends B> clazz = B.class;
        assertEquals("B", ROB.originSimpleNameOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.B", ROB.originCanonicalNameOf(clazz));
        assertEquals("B.class", ROB.originSimpleClassOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.B.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("S", "U", "T", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("S extends T", "U extends java.lang.Comparable<V>", "T extends java.lang.Object", "V extends java.lang.Enum<V>"),
                     ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.B<?, ?, ?, ?>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.B<S, U, T, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.B<S extends T, U extends java.lang.Comparable<V>, T extends java.lang.Object, V extends java.lang.Enum<V>>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("S", "U", "T", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(asList("U", "V"), ROB.listOfTypeVariableNamesOf(genericSuperClass));
        final Type[] genericInterfaces = clazz.getGenericInterfaces();
        assertEquals(asList("S", "T", "U"), ROB.listOfTypeVariableNamesOf(genericInterfaces[0]));
    }

    private static abstract class C<S extends java.util.Formatter.BigDecimalLayoutForm, U extends Comparable<V>, V extends Enum<V>>
    extends B<S, U, java.util.Formatter.BigDecimalLayoutForm, V> {
    }

    @Test
    public void test_C()
    throws Exception {
        final Class<? extends C> clazz = C.class;
        assertEquals("C", ROB.originSimpleNameOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.C", ROB.originCanonicalNameOf(clazz));
        assertEquals("C.class", ROB.originSimpleClassOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.C.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("S", "U", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("S extends java.util.Formatter.BigDecimalLayoutForm", "U extends java.lang.Comparable<V>", "V extends java.lang.Enum<V>"),
                     ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.C<?, ?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.C<S, U, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.C<S extends java.util.Formatter.BigDecimalLayoutForm, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("S", "U", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(asList("S", "U", "java.util.Formatter.BigDecimalLayoutForm", "V"), ROB.listOfTypeVariableNamesOf(genericSuperClass));
    }

    private static abstract class D<S extends Supplier<?>, U extends Comparable<V>, V extends Enum<V>>
    extends B<S, U, Supplier<?>, V> {
    }

    @Test
    public void test_D()
    throws Exception {
        final Class<? extends D> clazz = D.class;
        assertEquals("D", ROB.originSimpleNameOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.D", ROB.originCanonicalNameOf(clazz));
        assertEquals("D.class", ROB.originSimpleClassOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.D.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("S", "U", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("S extends java.util.function.Supplier<?>", "U extends java.lang.Comparable<V>", "V extends java.lang.Enum<V>"),
                     ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.D<?, ?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.D<S, U, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.D<S extends java.util.function.Supplier<?>, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("S", "U", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(asList("S", "U", "java.util.function.Supplier<?>", "V"), ROB.listOfTypeVariableNamesOf(genericSuperClass));
    }

    private static abstract class E<S extends BiFunction<U, V, ?>, U extends Comparable<V>, V extends Enum<V>>
    extends B<S, U, BiFunction<U, V, ?>, V> {
    }

    @Test
    public void test_E()
    throws Exception {
        final Class<? extends E> clazz = E.class;
        assertEquals("E", ROB.originSimpleNameOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.E", ROB.originCanonicalNameOf(clazz));
        assertEquals("E.class", ROB.originSimpleClassOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.E.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("S", "U", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("S extends java.util.function.BiFunction<U, V, ?>", "U extends java.lang.Comparable<V>", "V extends java.lang.Enum<V>"),
                     ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.E<?, ?, ?>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.E<S, U, V>", ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.E<S extends java.util.function.BiFunction<U, V, ?>, U extends java.lang.Comparable<V>, V extends java.lang.Enum<V>>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("S", "U", "V"), ROB.listOfTypeVariableNamesOf(clazz));
        final Type genericSuperClass = clazz.getGenericSuperclass();
        assertEquals(asList("S", "U", "java.util.function.BiFunction<U, V, ?>", "V"), ROB.listOfTypeVariableNamesOf(genericSuperClass));
    }

    private static interface NamespaceTest<TA extends OriginRenderer, TB extends String, TC extends java.util.Map.Entry<K, V>, K, V> {
    }

    @Test
    public void test_NamespaceTest()
    throws Exception {
        final Class<? extends NamespaceTest> clazz = NamespaceTest.class;
        assertEquals("NamespaceTest", ROB.originSimpleNameOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.NamespaceTest", ROB.originCanonicalNameOf(clazz));
        assertEquals("NamespaceTest.class", ROB.originSimpleClassOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.NamespaceTest.class", ROB.originCanonicalClassOf(clazz));
        assertEquals(asList("?", "?", "?", "?", "?"), ROB.listOfTypeParameterWildcardsOf(clazz));
        assertEquals(asList("TA", "TB", "TC", "K", "V"), ROB.listOfTypeParameterNamesOf(clazz));
        assertEquals(asList("TA extends org.j8unit.generator.api.render.OriginRenderer", "TB extends java.lang.String", "TC extends java.util.Map.Entry<K, V>",
                            "K extends java.lang.Object", "V extends java.lang.Object"),
                     ROB.listOfTypeParameterDefinitionsOf(clazz));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.NamespaceTest<?, ?, ?, ?, ?>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterWildcardsOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.NamespaceTest<TA, TB, TC, K, V>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterNamesOf));
        assertEquals("org.j8unit.generator.render.RenderOriginBehaviourTest.NamespaceTest<TA extends org.j8unit.generator.api.render.OriginRenderer, TB extends java.lang.String, TC extends java.util.Map.Entry<K, V>, K extends java.lang.Object, V extends java.lang.Object>",
                     ROB.originCanonicalNameOf(clazz, ROB::listOfTypeParameterDefinitionsOf));
        assertEquals(asList("TA", "TB", "TC", "K", "V"), ROB.listOfTypeVariableNamesOf(clazz));
    }

}
