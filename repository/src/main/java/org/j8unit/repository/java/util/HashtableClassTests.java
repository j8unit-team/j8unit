package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.Hashtable class java.util.Hashtable}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.util.HashtableTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.HashtableTests
 */
@Category(J8UnitRepository.class)
public abstract interface HashtableClassTests<SUT extends Class<? extends java.util.Hashtable<K, V>>, K, V>
extends org.j8unit.repository.java.util.MapClassTests<SUT, K, V>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.util.DictionaryClassTests<SUT, K, V> {

    /**
     * Test method for {@link java.util.Hashtable#Hashtable(java.util.Map) public java.util.Hashtable(java.util.Map)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Hashtable_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Hashtable<K, V> sut = null; // = new Hashtable(java.util.Map);
    }

    /**
     * Test method for {@link java.util.Hashtable#Hashtable() public java.util.Hashtable()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Hashtable<K, V> sut = null; // = new Hashtable();
    }

    /**
     * Test method for {@link java.util.Hashtable#Hashtable(int) public java.util.Hashtable(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Hashtable_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Hashtable<K, V> sut = null; // = new Hashtable(int);
    }

    /**
     * Test method for {@link java.util.Hashtable#Hashtable(int,float) public java.util.Hashtable(int,float)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Hashtable_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Hashtable<K, V> sut = null; // = new Hashtable(int,float);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.Hashtable<K, V>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Hashtable.class.isAssignableFrom(sut));
    }

}
