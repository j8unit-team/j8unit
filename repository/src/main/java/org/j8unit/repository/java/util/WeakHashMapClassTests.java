package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.WeakHashMap class java.util.WeakHashMap}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.WeakHashMapTests}.
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
 * @see org.j8unit.repository.java.util.WeakHashMapTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.WeakHashMap
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WeakHashMapClassTests<SUT extends java.util.WeakHashMap>
extends org.j8unit.repository.java.util.MapClassTests<SUT>, org.j8unit.repository.java.util.AbstractMapClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.WeakHashMap#WeakHashMap() public java.util.WeakHashMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.WeakHashMap#WeakHashMap()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WeakHashMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.WeakHashMap<?, ?> sut = null; // = new WeakHashMap();
    }

    /**
     * <p>
     * Test method for {@link java.util.WeakHashMap#WeakHashMap(int) public java.util.WeakHashMap(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.WeakHashMap#WeakHashMap(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WeakHashMap_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.WeakHashMap<?, ?> sut = null; // = new WeakHashMap(int);
    }

    /**
     * <p>
     * Test method for {@link java.util.WeakHashMap#WeakHashMap(int, float) public java.util.WeakHashMap(int,float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.WeakHashMap#WeakHashMap(int, float)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WeakHashMap_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.WeakHashMap<?, ?> sut = null; // = new WeakHashMap(int, float);
    }

    /**
     * <p>
     * Test method for {@link java.util.WeakHashMap#WeakHashMap(java.util.Map) public
     * java.util.WeakHashMap(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.WeakHashMap#WeakHashMap(java.util.Map)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_WeakHashMap_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.WeakHashMap<?, ?> sut = null; // = new WeakHashMap(java.util.Map);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.util.WeakHashMap#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.WeakHashMap.class.isAssignableFrom(sut));
    }

}
