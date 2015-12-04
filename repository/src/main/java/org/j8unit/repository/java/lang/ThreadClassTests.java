package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.Thread class java.lang.Thread}, containing all class relevant test methods (at least
 * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.lang.ThreadTests}.
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
 * @see org.j8unit.repository.java.lang.ThreadTests
 */
@Category(J8UnitRepository.class)
public abstract interface ThreadClassTests<SUT extends Class<? extends java.lang.Thread>>
extends org.j8unit.repository.java.lang.RunnableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.lang.Thread#Thread(java.lang.Runnable) public java.lang.Thread(java.lang.Runnable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Thread_Runnable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.Thread sut = null; // = new Thread(java.lang.Runnable);
    }

    /**
     * Test method for {@link java.lang.Thread#Thread() public java.lang.Thread()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Thread()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.Thread sut = null; // = new Thread();
    }

    /**
     * Test method for {@link java.lang.Thread#Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String) public
     * java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Thread_ThreadGroup_Runnable_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.Thread sut = null; // = new Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String);
    }

    /**
     * Test method for {@link java.lang.Thread#Thread(java.lang.Runnable,java.lang.String) public
     * java.lang.Thread(java.lang.Runnable,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Thread_Runnable_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.Thread sut = null; // = new Thread(java.lang.Runnable,java.lang.String);
    }

    /**
     * Test method for {@link java.lang.Thread#Thread(java.lang.ThreadGroup,java.lang.String) public
     * java.lang.Thread(java.lang.ThreadGroup,java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Thread_ThreadGroup_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.Thread sut = null; // = new Thread(java.lang.ThreadGroup,java.lang.String);
    }

    /**
     * Test method for {@link java.lang.Thread#Thread(java.lang.String) public java.lang.Thread(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Thread_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.Thread sut = null; // = new Thread(java.lang.String);
    }

    /**
     * Test method for {@link java.lang.Thread#Thread(java.lang.ThreadGroup,java.lang.Runnable) public
     * java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Thread_ThreadGroup_Runnable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.Thread sut = null; // = new Thread(java.lang.ThreadGroup,java.lang.Runnable);
    }

    /**
     * Test method for {@link java.lang.Thread#Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String,long)
     * public java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String,long)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Thread_ThreadGroup_Runnable_String_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.Thread sut = null; // = new
                                           // Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String,long);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.lang.Thread> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.Thread.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.Thread#setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler) public
     * static void java.lang.Thread.setDefaultUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDefaultUncaughtExceptionHandler_UncaughtExceptionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#yield() public static native void java.lang.Thread.yield()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_yield()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#dumpStack() public static void java.lang.Thread.dumpStack()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dumpStack()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#getAllStackTraces() public static java.util.Map
     * java.lang.Thread.getAllStackTraces()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAllStackTraces()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#currentThread() public static native java.lang.Thread
     * java.lang.Thread.currentThread()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_currentThread()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#holdsLock(java.lang.Object) public static native boolean
     * java.lang.Thread.holdsLock(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_holdsLock_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#getDefaultUncaughtExceptionHandler() public static
     * java.lang.Thread$UncaughtExceptionHandler java.lang.Thread.getDefaultUncaughtExceptionHandler()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultUncaughtExceptionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#activeCount() public static int java.lang.Thread.activeCount()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activeCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#sleep(long) public static native void java.lang.Thread.sleep(long) throws
     * java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sleep_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#sleep(long,int) public static void java.lang.Thread.sleep(long,int)
     * throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sleep_long_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#interrupted() public static boolean java.lang.Thread.interrupted()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_interrupted()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.Thread#enumerate(java.lang.Thread[]) public static int
     * java.lang.Thread.enumerate(java.lang.Thread[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_enumerate_ThreadArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.lang.Thread$State class java.lang.Thread$State}, containing all class relevant test
     * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.lang.ThreadTests.StateTests}.
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
     * @see org.j8unit.repository.java.lang.ThreadTests.StateTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface StateClassTests<SUT extends Class<? extends java.lang.Thread.State>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.lang.Thread.State> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.lang.Thread.State> sut = createNewSUT();
            // assert assignability
            assertTrue(java.lang.Thread.State.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link java.lang.Thread.State#values() public static java.lang.Thread$State[]
         * java.lang.Thread$State.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.lang.Thread.State#valueOf(java.lang.String) public static java.lang.Thread$State
         * java.lang.Thread$State.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link java.lang.Thread$UncaughtExceptionHandler interface
     * java.lang.Thread$UncaughtExceptionHandler}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
     * instance relevant test methods is
     * {@link org.j8unit.repository.java.lang.ThreadTests.UncaughtExceptionHandlerTests}.
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
     * @see org.j8unit.repository.java.lang.ThreadTests.UncaughtExceptionHandlerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface UncaughtExceptionHandlerClassTests<SUT extends Class<? extends java.lang.Thread.UncaughtExceptionHandler>>
    extends J8UnitTest<SUT> {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.lang.Thread.UncaughtExceptionHandler> sut = createNewSUT();
            // assert assignability
            assertTrue(java.lang.Thread.UncaughtExceptionHandler.class.isAssignableFrom(sut));
        }

    }

}
