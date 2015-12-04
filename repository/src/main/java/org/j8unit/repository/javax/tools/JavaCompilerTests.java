package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.tools.JavaCompiler interface javax.tools.JavaCompiler}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.tools.JavaCompilerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface JavaCompilerTests<SUT extends javax.tools.JavaCompiler>
extends org.j8unit.repository.javax.tools.ToolTests<SUT>, org.j8unit.repository.javax.tools.OptionCheckerTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.tools.JavaCompiler$CompilationTask interface
     * javax.tools.JavaCompiler$CompilationTask}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.tools.JavaCompilerClassTests.CompilationTaskClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CompilationTaskTests<SUT extends javax.tools.JavaCompiler.CompilationTask>
    extends org.j8unit.repository.java.util.concurrent.CallableTests<SUT, java.lang.Boolean> {

        /**
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#call() public abstract java.lang.Boolean
         * javax.tools.JavaCompiler$CompilationTask.call()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_call()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#setLocale(java.util.Locale) public abstract
         * void javax.tools.JavaCompiler$CompilationTask.setLocale(java.util.Locale)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setLocale_Locale()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#setProcessors(java.lang.Iterable) public
         * abstract void javax.tools.JavaCompiler$CompilationTask.setProcessors(java.lang.Iterable)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setProcessors_Iterable()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaCompiler#getStandardFileManager(javax.tools.DiagnosticListener,java.util.Locale,java.nio.charset.Charset)
     * public abstract javax.tools.StandardJavaFileManager
     * javax.tools.JavaCompiler.getStandardFileManager(javax.tools.DiagnosticListener,java.util.Locale,java.nio.charset.Charset)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStandardFileManager_DiagnosticListener_Locale_Charset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaCompiler#getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener,java.lang.Iterable,java.lang.Iterable,java.lang.Iterable)
     * public abstract javax.tools.JavaCompiler$CompilationTask
     * javax.tools.JavaCompiler.getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener,java.lang.Iterable,java.lang.Iterable,java.lang.Iterable)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTask_Writer_JavaFileManager_DiagnosticListener_Iterable_Iterable_Iterable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
