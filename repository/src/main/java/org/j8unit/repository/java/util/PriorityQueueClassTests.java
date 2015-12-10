package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.PriorityQueue class java.util.PriorityQueue}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.PriorityQueueTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.PriorityQueueTests
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PriorityQueueClassTests<SUT extends java.util.PriorityQueue>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.util.AbstractQueueClassTests<SUT> {

    /**
     * Test method for {@link java.util.PriorityQueue#PriorityQueue() public java.util.PriorityQueue()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PriorityQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.PriorityQueue<?> sut = null; // = new PriorityQueue();
    }

    /**
     * Test method for {@link java.util.PriorityQueue#PriorityQueue(java.util.Collection) public
     * java.util.PriorityQueue(java.util.Collection)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PriorityQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.PriorityQueue<?> sut = null; // = new PriorityQueue(java.util.Collection);
    }

    /**
     * Test method for {@link java.util.PriorityQueue#PriorityQueue(java.util.Comparator) public
     * java.util.PriorityQueue(java.util.Comparator)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PriorityQueue_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.PriorityQueue<?> sut = null; // = new PriorityQueue(java.util.Comparator);
    }

    /**
     * Test method for {@link java.util.PriorityQueue#PriorityQueue(int) public java.util.PriorityQueue(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PriorityQueue_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.PriorityQueue<?> sut = null; // = new PriorityQueue(int);
    }

    /**
     * Test method for {@link java.util.PriorityQueue#PriorityQueue(int,java.util.Comparator) public
     * java.util.PriorityQueue(int,java.util.Comparator)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PriorityQueue_int_Comparator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.PriorityQueue<?> sut = null; // = new PriorityQueue(int,java.util.Comparator);
    }

    /**
     * Test method for {@link java.util.PriorityQueue#PriorityQueue(java.util.PriorityQueue) public
     * java.util.PriorityQueue(java.util.PriorityQueue)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PriorityQueue_PriorityQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.PriorityQueue<?> sut = null; // = new PriorityQueue(java.util.PriorityQueue);
    }

    /**
     * Test method for {@link java.util.PriorityQueue#PriorityQueue(java.util.SortedSet) public
     * java.util.PriorityQueue(java.util.SortedSet)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PriorityQueue_SortedSet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.PriorityQueue<?> sut = null; // = new PriorityQueue(java.util.SortedSet);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.PriorityQueue.class.isAssignableFrom(sut));
    }

}
