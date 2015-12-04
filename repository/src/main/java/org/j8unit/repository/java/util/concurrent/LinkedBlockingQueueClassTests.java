package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.LinkedBlockingQueue class java.util.concurrent.LinkedBlockingQueue},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.LinkedBlockingQueueTests}.
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
 * @see org.j8unit.repository.java.util.concurrent.LinkedBlockingQueueTests
 */
@Category(J8UnitRepository.class)
public abstract interface LinkedBlockingQueueClassTests<SUT extends Class<? extends java.util.concurrent.LinkedBlockingQueue<E>>, E>
extends org.j8unit.repository.java.util.concurrent.BlockingQueueClassTests<SUT, E>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.util.AbstractQueueClassTests<SUT, E> {

    /**
     * Test method for {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue(int) public
     * java.util.concurrent.LinkedBlockingQueue(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedBlockingQueue_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.LinkedBlockingQueue<E> sut = null; // = new LinkedBlockingQueue(int);
    }

    /**
     * Test method for {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue() public
     * java.util.concurrent.LinkedBlockingQueue()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedBlockingQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.LinkedBlockingQueue<E> sut = null; // = new LinkedBlockingQueue();
    }

    /**
     * Test method for {@link java.util.concurrent.LinkedBlockingQueue#LinkedBlockingQueue(java.util.Collection) public
     * java.util.concurrent.LinkedBlockingQueue(java.util.Collection)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LinkedBlockingQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.LinkedBlockingQueue<E> sut = null; // = new
                                                                      // LinkedBlockingQueue(java.util.Collection);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.concurrent.LinkedBlockingQueue<E>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.LinkedBlockingQueue.class.isAssignableFrom(sut));
    }

}
