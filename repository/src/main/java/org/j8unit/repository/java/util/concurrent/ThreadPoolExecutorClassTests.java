package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.ThreadPoolExecutor class java.util.concurrent.ThreadPoolExecutor},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests}.
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
 * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ThreadPoolExecutorClassTests<SUT extends java.util.concurrent.ThreadPoolExecutor>
extends org.j8unit.repository.java.util.concurrent.AbstractExecutorServiceClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ThreadPoolExecutor$AbortPolicy class
     * java.util.concurrent.ThreadPoolExecutor$AbortPolicy}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.AbortPolicyTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.AbortPolicyTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AbortPolicyClassTests<SUT extends java.util.concurrent.ThreadPoolExecutor.AbortPolicy>
    extends org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.concurrent.ThreadPoolExecutor.AbortPolicy#AbortPolicy() public
         * java.util.concurrent.ThreadPoolExecutor$AbortPolicy()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_AbortPolicy()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.concurrent.ThreadPoolExecutor.AbortPolicy sut = null; // = new AbortPolicy();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.ThreadPoolExecutor.AbortPolicy.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy class
     * java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.CallerRunsPolicyTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.CallerRunsPolicyTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CallerRunsPolicyClassTests<SUT extends java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy>
    extends org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy#CallerRunsPolicy() public
         * java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_CallerRunsPolicy()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy sut = null; // = new CallerRunsPolicy();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy class
     * java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy}, containing all class relevant test methods (at
     * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
     * class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.DiscardOldestPolicyTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.DiscardOldestPolicyTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DiscardOldestPolicyClassTests<SUT extends java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy>
    extends org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy#DiscardOldestPolicy()
         * public java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DiscardOldestPolicy()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy sut = null; // = new
                                                                                          // DiscardOldestPolicy();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.concurrent.ThreadPoolExecutor$DiscardPolicy class
     * java.util.concurrent.ThreadPoolExecutor$DiscardPolicy}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.DiscardPolicyTests}.
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
     *            the class' type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.DiscardPolicyTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DiscardPolicyClassTests<SUT extends java.util.concurrent.ThreadPoolExecutor.DiscardPolicy>
    extends org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.concurrent.ThreadPoolExecutor.DiscardPolicy#DiscardPolicy() public
         * java.util.concurrent.ThreadPoolExecutor$DiscardPolicy()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DiscardPolicy()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.concurrent.ThreadPoolExecutor.DiscardPolicy sut = null; // = new DiscardPolicy();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.concurrent.ThreadPoolExecutor.DiscardPolicy.class.isAssignableFrom(sut));
        }

    }

    /**
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue)
     * public
     * java.util.concurrent.ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ThreadPoolExecutor_int_int_long_TimeUnit_BlockingQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ThreadPoolExecutor sut = null; // = new
                                                                  // ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue);
    }

    /**
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.RejectedExecutionHandler)
     * public
     * java.util.concurrent.ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.RejectedExecutionHandler)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ThreadPoolExecutor_int_int_long_TimeUnit_BlockingQueue_RejectedExecutionHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ThreadPoolExecutor sut = null; // = new
                                                                  // ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.RejectedExecutionHandler);
    }

    /**
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.ThreadFactory)
     * public
     * java.util.concurrent.ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.ThreadFactory)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ThreadPoolExecutor_int_int_long_TimeUnit_BlockingQueue_ThreadFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ThreadPoolExecutor sut = null; // = new
                                                                  // ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.ThreadFactory);
    }

    /**
     * Test method for
     * {@link java.util.concurrent.ThreadPoolExecutor#ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.ThreadFactory,java.util.concurrent.RejectedExecutionHandler)
     * public
     * java.util.concurrent.ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.ThreadFactory,java.util.concurrent.RejectedExecutionHandler)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ThreadPoolExecutor_int_int_long_TimeUnit_BlockingQueue_ThreadFactory_RejectedExecutionHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.concurrent.ThreadPoolExecutor sut = null; // = new
                                                                  // ThreadPoolExecutor(int,int,long,java.util.concurrent.TimeUnit,java.util.concurrent.BlockingQueue,java.util.concurrent.ThreadFactory,java.util.concurrent.RejectedExecutionHandler);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.concurrent.ThreadPoolExecutor.class.isAssignableFrom(sut));
    }

}
