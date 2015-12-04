package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.ForkJoinPool class java.util.concurrent.ForkJoinPool}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.ForkJoinPoolTests}.
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
 * @see org.j8unit.repository.java.util.concurrent.ForkJoinPoolTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForkJoinPoolClassTests<SUT extends Class<? extends java.util.concurrent.ForkJoinPool>>
extends org.j8unit.repository.java.util.concurrent.AbstractExecutorServiceClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory interface
     * java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.ForkJoinPoolTests.ForkJoinWorkerThreadFactoryTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ForkJoinPoolTests.ForkJoinWorkerThreadFactoryTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ForkJoinWorkerThreadFactoryClassTests<SUT extends Class<? extends java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ForkJoinPool$ManagedBlocker interface
     * java.util.concurrent.ForkJoinPool$ManagedBlocker}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.ForkJoinPoolTests.ManagedBlockerTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ForkJoinPoolTests.ManagedBlockerTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ManagedBlockerClassTests<SUT extends Class<? extends java.util.concurrent.ForkJoinPool.ManagedBlocker>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.concurrent.ForkJoinPool.ManagedBlocker> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.ForkJoinPool.ManagedBlocker.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for {@link java.util.concurrent.ForkJoinPool#ForkJoinPool() public
     * java.util.concurrent.ForkJoinPool()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ForkJoinPool()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ForkJoinPool sut = null; // = new ForkJoinPool();
    }

    /**
     * Test method for {@link java.util.concurrent.ForkJoinPool#ForkJoinPool(int) public
     * java.util.concurrent.ForkJoinPool(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ForkJoinPool_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ForkJoinPool sut = null; // = new ForkJoinPool(int);
    }

    /**
     * Test method for
     * {@link java.util.concurrent.ForkJoinPool#ForkJoinPool(int,java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,java.lang.Thread.UncaughtExceptionHandler,boolean)
     * public
     * java.util.concurrent.ForkJoinPool(int,java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory,java.lang.Thread$UncaughtExceptionHandler,boolean)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ForkJoinPool_int_ForkJoinWorkerThreadFactory_UncaughtExceptionHandler_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ForkJoinPool sut = null; // = new
                                                            // ForkJoinPool(int,java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,java.lang.Thread.UncaughtExceptionHandler,boolean);
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#commonPool() public static
     * java.util.concurrent.ForkJoinPool java.util.concurrent.ForkJoinPool.commonPool()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_commonPool()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinPool#getCommonPoolParallelism() public static int
     * java.util.concurrent.ForkJoinPool.getCommonPoolParallelism()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCommonPoolParallelism()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ForkJoinPool#managedBlock(java.util.concurrent.ForkJoinPool.ManagedBlocker) public
     * static void java.util.concurrent.ForkJoinPool.managedBlock(java.util.concurrent.ForkJoinPool$ManagedBlocker)
     * throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_managedBlock_ManagedBlocker()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.concurrent.ForkJoinPool> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.ForkJoinPool.class.isAssignableFrom(sut));
    }

}
