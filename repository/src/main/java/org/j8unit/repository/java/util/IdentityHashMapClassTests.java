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
 * Test class for {@link java.util.IdentityHashMap class java.util.IdentityHashMap},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.IdentityHashMapTests}.
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
 * @see org.j8unit.repository.java.util.IdentityHashMapTests
 */
@Category(J8UnitRepository.class)
public abstract interface IdentityHashMapClassTests<SUT extends Class<? extends java.util.IdentityHashMap<K,V>>, K, V>
extends org.j8unit.repository.java.util.MapClassTests<SUT,K,V>,
        org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
        org.j8unit.repository.java.util.AbstractMapClassTests<SUT,K,V>
{

    /**
     * Test method for {@link java.util.IdentityHashMap#IdentityHashMap() public java.util.IdentityHashMap()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_IdentityHashMap() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.IdentityHashMap<K,V> sut = null; // = new IdentityHashMap();
    }

    /**
     * Test method for {@link java.util.IdentityHashMap#IdentityHashMap(java.util.Map) public java.util.IdentityHashMap(java.util.Map)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_IdentityHashMap_Map() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.IdentityHashMap<K,V> sut = null; // = new IdentityHashMap(java.util.Map);
    }

    /**
     * Test method for {@link java.util.IdentityHashMap#IdentityHashMap(int) public java.util.IdentityHashMap(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_IdentityHashMap_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.util.IdentityHashMap<K,V> sut = null; // = new IdentityHashMap(int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.IdentityHashMap<K,V>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.IdentityHashMap.class.isAssignableFrom(sut));
    }

}
