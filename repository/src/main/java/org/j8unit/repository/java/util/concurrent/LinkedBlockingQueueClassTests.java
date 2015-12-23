package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.LinkedBlockingQueue class
 * java.util.concurrent.LinkedBlockingQueue}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.java.util.concurrent.LinkedBlockingQueueTests}.
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
 * @see org.j8unit.repository.java.util.concurrent.LinkedBlockingQueueTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.LinkedBlockingQueue
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LinkedBlockingQueueClassTests<SUT extends java.util.concurrent.LinkedBlockingQueue>
extends org.j8unit.repository.java.util.concurrent.BlockingQueueClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.util.AbstractQueueClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue() public
     * java.util.concurrent.LinkedBlockingQueue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedBlockingQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.LinkedBlockingQueue<?> sut = null; // = new LinkedBlockingQueue();
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue(java.util.Collection) public
     * java.util.concurrent.LinkedBlockingQueue(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue(java.util.Collection)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedBlockingQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.LinkedBlockingQueue<?> sut = null; // = new
                                                                      // LinkedBlockingQueue(java.util.Collection);
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue(int) public
     * java.util.concurrent.LinkedBlockingQueue(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedBlockingQueue_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.LinkedBlockingQueue<?> sut = null; // = new LinkedBlockingQueue(int);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.util.concurrent.LinkedBlockingQueue#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.LinkedBlockingQueue.class.isAssignableFrom(sut));
    }

}
