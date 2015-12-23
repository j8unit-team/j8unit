package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.ConcurrentHashMap class
 * java.util.concurrent.ConcurrentHashMap}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.ConcurrentHashMap
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentHashMapClassTests<SUT extends java.util.concurrent.ConcurrentHashMap>
extends org.j8unit.repository.java.util.concurrent.ConcurrentMapClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.util.AbstractMapClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.concurrent.ConcurrentHashMap.KeySetView class
     * java.util.concurrent.ConcurrentHashMap$KeySetView}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests.KeySetViewTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.java.util.concurrent.ConcurrentHashMapTests.KeySetViewTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap.KeySetView
     */
    @SuppressWarnings("rawtypes")
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeySetViewClassTests<SUT extends java.util.concurrent.ConcurrentHashMap.KeySetView>
    extends org.j8unit.repository.java.util.SetClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.util.CollectionClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.util.concurrent.ConcurrentHashMap.KeySetView#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.ConcurrentHashMap.KeySetView.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap() public
     * java.util.concurrent.ConcurrentHashMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentHashMap<?, ?> sut = null; // = new ConcurrentHashMap();
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int) public
     * java.util.concurrent.ConcurrentHashMap(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentHashMap<?, ?> sut = null; // = new ConcurrentHashMap(int);
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int, float) public
     * java.util.concurrent.ConcurrentHashMap(int,float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int, float)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentHashMap<?, ?> sut = null; // = new ConcurrentHashMap(int, float);
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int, float, int) public
     * java.util.concurrent.ConcurrentHashMap(int,float,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int, float, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap_int_float_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentHashMap<?, ?> sut = null; // = new ConcurrentHashMap(int, float, int);
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(java.util.Map) public
     * java.util.concurrent.ConcurrentHashMap(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(java.util.Map)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentHashMap_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentHashMap<?, ?> sut = null; // = new ConcurrentHashMap(java.util.Map);
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#newKeySet() public static
     * java.util.concurrent.ConcurrentHashMap$KeySetView java.util.concurrent.ConcurrentHashMap.newKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap#newKeySet()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newKeySet()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentHashMap#newKeySet(int) public static
     * java.util.concurrent.ConcurrentHashMap$KeySetView java.util.concurrent.ConcurrentHashMap.newKeySet(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap#newKeySet(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newKeySet_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.util.concurrent.ConcurrentHashMap#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.ConcurrentHashMap.class.isAssignableFrom(sut));
    }

}
