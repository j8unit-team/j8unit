package org.j8unit.repository.java.util.concurrent;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.concurrent.ConcurrentHashMap class java.util.concurrent.ConcurrentHashMap},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests
 */
@Category(J8UnitRepository.class)
public abstract interface ConcurrentHashMapClassTests<SUT extends Class<? extends java.util.concurrent.ConcurrentHashMap<K,V>>, K, V>
extends org.j8unit.repository.java.util.concurrent.ConcurrentMapClassTests<SUT,K,V>,
        org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.util.AbstractMapClassTests<SUT,K,V>
{

    /**
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int) public java.util.concurrent.ConcurrentHashMap(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentHashMap<K,V> sut = null; // = new ConcurrentHashMap(int);
    }

    /**
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap() public java.util.concurrent.ConcurrentHashMap()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentHashMap<K,V> sut = null; // = new ConcurrentHashMap();
    }

    /**
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int,float) public java.util.concurrent.ConcurrentHashMap(int,float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap_int_float() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentHashMap<K,V> sut = null; // = new ConcurrentHashMap(int,float);
    }

    /**
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int,float,int) public java.util.concurrent.ConcurrentHashMap(int,float,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap_int_float_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentHashMap<K,V> sut = null; // = new ConcurrentHashMap(int,float,int);
    }

    /**
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(java.util.Map) public java.util.concurrent.ConcurrentHashMap(java.util.Map)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap_Map() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.concurrent.ConcurrentHashMap<K,V> sut = null; // = new ConcurrentHashMap(java.util.Map);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.concurrent.ConcurrentHashMap<K,V>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.ConcurrentHashMap.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#newKeySet() public static java.util.concurrent.ConcurrentHashMap$KeySetView java.util.concurrent.ConcurrentHashMap.newKeySet()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newKeySet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#newKeySet(int) public static java.util.concurrent.ConcurrentHashMap$KeySetView java.util.concurrent.ConcurrentHashMap.newKeySet(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newKeySet_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ConcurrentHashMap$KeySetView class java.util.concurrent.ConcurrentHashMap$KeySetView},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests.KeySetViewTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests.KeySetViewTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KeySetViewClassTests<SUT extends Class<? extends java.util.concurrent.ConcurrentHashMap.KeySetView<K,V>>, K, V>
    extends org.j8unit.repository.java.util.SetClassTests<SUT,K>,
            org.j8unit.repository.java.io.SerializableClassTests<SUT>,
            org.j8unit.repository.java.util.CollectionClassTests<SUT,K>,
            org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.concurrent.ConcurrentHashMap.KeySetView<K,V>> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.ConcurrentHashMap.KeySetView.class.isAssignableFrom(sut));
        }

    }

}
