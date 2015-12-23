package org.j8unit.repository.java.util.concurrent.locks;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.locks.ReentrantReadWriteLock class
 * java.util.concurrent.locks.ReentrantReadWriteLock}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests}.
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
 * @see org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.locks.ReentrantReadWriteLock
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReentrantReadWriteLockClassTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock>
extends org.j8unit.repository.java.util.concurrent.locks.ReadWriteLockClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock class
     * java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests.ReadLockTests}.
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
     * @see org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests.ReadLockTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ReadLockClassTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock>
    extends org.j8unit.repository.java.util.concurrent.locks.LockClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock class
     * java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart
     * J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests.WriteLockTests}.
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
     * @see org.j8unit.repository.java.util.concurrent.locks.ReentrantReadWriteLockTests.WriteLockTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface WriteLockClassTests<SUT extends java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock>
    extends org.j8unit.repository.java.util.concurrent.locks.LockClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#ReentrantReadWriteLock() public
     * java.util.concurrent.locks.ReentrantReadWriteLock()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.ReentrantReadWriteLock#ReentrantReadWriteLock()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ReentrantReadWriteLock()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.locks.ReentrantReadWriteLock sut = null; // = new ReentrantReadWriteLock();
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.locks.ReentrantReadWriteLock#ReentrantReadWriteLock(boolean) public
     * java.util.concurrent.locks.ReentrantReadWriteLock(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.locks.ReentrantReadWriteLock#ReentrantReadWriteLock(boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ReentrantReadWriteLock_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.locks.ReentrantReadWriteLock sut = null; // = new ReentrantReadWriteLock(boolean);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.util.concurrent.locks.ReentrantReadWriteLock#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.locks.ReentrantReadWriteLock.class.isAssignableFrom(sut));
    }

}
