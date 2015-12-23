package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.LinkedHashMap class java.util.LinkedHashMap}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.LinkedHashMapTests}.
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
 * @see org.j8unit.repository.java.util.LinkedHashMapTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.LinkedHashMap
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LinkedHashMapClassTests<SUT extends java.util.LinkedHashMap>
extends org.j8unit.repository.java.util.MapClassTests<SUT>, org.j8unit.repository.java.util.HashMapClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.LinkedHashMap#LinkedHashMap() public java.util.LinkedHashMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.LinkedHashMap#LinkedHashMap()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedHashMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.LinkedHashMap<?, ?> sut = null; // = new LinkedHashMap();
    }

    /**
     * <p>
     * Test method for {@link java.util.LinkedHashMap#LinkedHashMap(int) public java.util.LinkedHashMap(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.LinkedHashMap#LinkedHashMap(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedHashMap_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.LinkedHashMap<?, ?> sut = null; // = new LinkedHashMap(int);
    }

    /**
     * <p>
     * Test method for {@link java.util.LinkedHashMap#LinkedHashMap(int, float) public
     * java.util.LinkedHashMap(int,float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.LinkedHashMap#LinkedHashMap(int, float)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedHashMap_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.LinkedHashMap<?, ?> sut = null; // = new LinkedHashMap(int, float);
    }

    /**
     * <p>
     * Test method for {@link java.util.LinkedHashMap#LinkedHashMap(int, float, boolean) public
     * java.util.LinkedHashMap(int,float,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.LinkedHashMap#LinkedHashMap(int, float, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedHashMap_int_float_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.LinkedHashMap<?, ?> sut = null; // = new LinkedHashMap(int, float, boolean);
    }

    /**
     * <p>
     * Test method for {@link java.util.LinkedHashMap#LinkedHashMap(java.util.Map) public
     * java.util.LinkedHashMap(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.LinkedHashMap#LinkedHashMap(java.util.Map)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedHashMap_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.LinkedHashMap<?, ?> sut = null; // = new LinkedHashMap(java.util.Map);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.util.LinkedHashMap#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.LinkedHashMap.class.isAssignableFrom(sut));
    }

}
