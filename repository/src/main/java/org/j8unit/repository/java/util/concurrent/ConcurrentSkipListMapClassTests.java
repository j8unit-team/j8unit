package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.ConcurrentSkipListMap class
 * java.util.concurrent.ConcurrentSkipListMap}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.util.concurrent.ConcurrentSkipListMapTests}.
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
 * @see org.j8unit.repository.java.util.concurrent.ConcurrentSkipListMapTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.ConcurrentSkipListMap
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentSkipListMapClassTests<SUT extends java.util.concurrent.ConcurrentSkipListMap>
extends org.j8unit.repository.java.util.concurrent.ConcurrentNavigableMapClassTests<SUT>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.util.AbstractMapClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#ConcurrentSkipListMap() public
     * java.util.concurrent.ConcurrentSkipListMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentSkipListMap#ConcurrentSkipListMap()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentSkipListMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentSkipListMap<?, ?> sut = null; // = new ConcurrentSkipListMap();
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#ConcurrentSkipListMap(java.util.Comparator)
     * public java.util.concurrent.ConcurrentSkipListMap(java.util.Comparator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentSkipListMap#ConcurrentSkipListMap(java.util.Comparator)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentSkipListMap_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentSkipListMap<?, ?> sut = null; // = new
                                                                           // ConcurrentSkipListMap(java.util.Comparator);
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#ConcurrentSkipListMap(java.util.Map) public
     * java.util.concurrent.ConcurrentSkipListMap(java.util.Map)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentSkipListMap#ConcurrentSkipListMap(java.util.Map)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentSkipListMap_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentSkipListMap<?, ?> sut = null; // = new
                                                                           // ConcurrentSkipListMap(java.util.Map);
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentSkipListMap#ConcurrentSkipListMap(java.util.SortedMap)
     * public java.util.concurrent.ConcurrentSkipListMap(java.util.SortedMap)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentSkipListMap#ConcurrentSkipListMap(java.util.SortedMap)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ConcurrentSkipListMap_SortedMap()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ConcurrentSkipListMap<?, ?> sut = null; // = new
                                                                           // ConcurrentSkipListMap(java.util.SortedMap);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.util.concurrent.ConcurrentSkipListMap#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.ConcurrentSkipListMap.class.isAssignableFrom(sut));
    }

}
