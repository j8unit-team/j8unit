package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.TreeSet class java.util.TreeSet}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.TreeSetTests}.
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
 * @see org.j8unit.repository.java.util.TreeSetTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.TreeSet
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TreeSetClassTests<SUT extends java.util.TreeSet>
extends org.j8unit.repository.java.util.NavigableSetClassTests<SUT>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.util.AbstractSetClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.TreeSet#TreeSet() public java.util.TreeSet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.TreeSet#TreeSet()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TreeSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.TreeSet<?> sut = null; // = new TreeSet();
    }

    /**
     * <p>
     * Test method for {@link java.util.TreeSet#TreeSet(java.util.Collection) public
     * java.util.TreeSet(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.TreeSet#TreeSet(java.util.Collection)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TreeSet_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.TreeSet<?> sut = null; // = new TreeSet(java.util.Collection);
    }

    /**
     * <p>
     * Test method for {@link java.util.TreeSet#TreeSet(java.util.Comparator) public
     * java.util.TreeSet(java.util.Comparator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.TreeSet#TreeSet(java.util.Comparator)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TreeSet_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.TreeSet<?> sut = null; // = new TreeSet(java.util.Comparator);
    }

    /**
     * <p>
     * Test method for {@link java.util.TreeSet#TreeSet(java.util.SortedSet) public
     * java.util.TreeSet(java.util.SortedSet)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.TreeSet#TreeSet(java.util.SortedSet)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TreeSet_SortedSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.TreeSet<?> sut = null; // = new TreeSet(java.util.SortedSet);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.util.TreeSet#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.TreeSet.class.isAssignableFrom(sut));
    }

}
