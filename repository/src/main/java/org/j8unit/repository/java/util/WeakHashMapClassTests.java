package org.j8unit.repository.java.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.WeakHashMap class java.util.WeakHashMap},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.WeakHashMapTests}.
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
 * @see org.j8unit.repository.java.util.WeakHashMapTests
 */
@Category(J8UnitRepository.class)
public abstract interface WeakHashMapClassTests<SUT extends Class<? extends java.util.WeakHashMap<K,V>>, K, V>
extends org.j8unit.repository.java.util.MapClassTests<SUT,K,V>,
        org.j8unit.repository.java.util.AbstractMapClassTests<SUT,K,V>
{

    /**
     * Test method for {@link java.util.WeakHashMap#WeakHashMap(java.util.Map) public java.util.WeakHashMap(java.util.Map)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WeakHashMap_Map() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.WeakHashMap<K,V> sut = null; // = new WeakHashMap(java.util.Map);
    }

    /**
     * Test method for {@link java.util.WeakHashMap#WeakHashMap(int) public java.util.WeakHashMap(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WeakHashMap_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.WeakHashMap<K,V> sut = null; // = new WeakHashMap(int);
    }

    /**
     * Test method for {@link java.util.WeakHashMap#WeakHashMap(int,float) public java.util.WeakHashMap(int,float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WeakHashMap_int_float() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.WeakHashMap<K,V> sut = null; // = new WeakHashMap(int,float);
    }

    /**
     * Test method for {@link java.util.WeakHashMap#WeakHashMap() public java.util.WeakHashMap()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WeakHashMap() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.WeakHashMap<K,V> sut = null; // = new WeakHashMap();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.WeakHashMap<K,V>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.WeakHashMap.class.isAssignableFrom(sut));
    }

}
