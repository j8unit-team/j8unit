package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.JavaCompiler interface javax.tools.JavaCompiler}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JavaCompilerClassTests}.
 * </p>
 *
 * @see javax.tools.JavaCompiler interface javax.tools.JavaCompiler (the hereby targeted class-under-test class)
 * @see JavaCompilerClassTests JavaCompilerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JavaCompilerTests<SUT extends javax.tools.JavaCompiler>
extends ToolTests<SUT>, OptionCheckerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.tools.JavaCompiler#getStandardFileManager(javax.tools.DiagnosticListener, java.util.Locale, java.nio.charset.Charset)
     * public abstract javax.tools.StandardJavaFileManager
     * javax.tools.JavaCompiler.getStandardFileManager(javax.tools.DiagnosticListener<? super
     * javax.tools.JavaFileObject>,java.util.Locale,java.nio.charset.Charset)}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.JavaCompiler#getStandardFileManager(javax.tools.DiagnosticListener, java.util.Locale, java.nio.charset.Charset)
     * public abstract javax.tools.StandardJavaFileManager
     * javax.tools.JavaCompiler.getStandardFileManager(javax.tools.DiagnosticListener,java.util.Locale,java.nio.charset.Charset)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.JavaCompiler#getStandardFileManager(javax.tools.DiagnosticListener, java.util.Locale,
     *      java.nio.charset.Charset) public abstract javax.tools.StandardJavaFileManager
     *      javax.tools.JavaCompiler.getStandardFileManager(javax.tools.DiagnosticListener,java.util.Locale,java.nio.
     *      charset.Charset) (the hereby targeted method-under-test)
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
     * {@link javax.tools.JavaCompiler#getTask(java.io.Writer, javax.tools.JavaFileManager, javax.tools.DiagnosticListener, Iterable, Iterable, Iterable)
     * public abstract javax.tools.JavaCompiler$CompilationTask
     * javax.tools.JavaCompiler.getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener<?
     * super javax.tools.JavaFileObject>,java.lang.Iterable<java.lang.String>,java.lang.Iterable
     * <java.lang.String>,java.lang.Iterable<? extends javax.tools.JavaFileObject>)}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.JavaCompiler#getTask(java.io.Writer, javax.tools.JavaFileManager, javax.tools.DiagnosticListener, Iterable, Iterable, Iterable)
     * public abstract javax.tools.JavaCompiler$CompilationTask
     * javax.tools.JavaCompiler.getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener,java.lang.Iterable,java.lang.Iterable,java.lang.Iterable)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.JavaCompiler#getTask(java.io.Writer, javax.tools.JavaFileManager,
     *      javax.tools.DiagnosticListener, Iterable, Iterable, Iterable) public abstract
     *      javax.tools.JavaCompiler$CompilationTask
     *      javax.tools.JavaCompiler.getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener,
     *      java.lang.Iterable,java.lang.Iterable,java.lang.Iterable) (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.tools.JavaCompiler.CompilationTask interface
     * javax.tools.JavaCompiler$CompilationTask}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link JavaCompilerClassTests.CompilationTaskClassTests}.
     * </p>
     *
     * @see javax.tools.JavaCompiler.CompilationTask interface javax.tools.JavaCompiler$CompilationTask (the hereby
     *      targeted class-under-test class)
     * @see JavaCompilerClassTests.CompilationTaskClassTests JavaCompilerClassTests.CompilationTaskClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CompilationTaskTests<SUT extends javax.tools.JavaCompiler.CompilationTask>
    extends org.j8unit.repository.java.util.concurrent.CallableTests<SUT, Boolean> {

        /**
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#call() public abstract java.lang.Boolean
         * javax.tools.JavaCompiler$CompilationTask.call()}.
         *
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#call() public abstract java.lang.Boolean
         * javax.tools.JavaCompiler$CompilationTask.call()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.tools.JavaCompiler.CompilationTask#call() public abstract java.lang.Boolean
         *      javax.tools.JavaCompiler$CompilationTask.call() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_call()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#setProcessors(Iterable) public abstract void
         * javax.tools.JavaCompiler$CompilationTask.setProcessors(java.lang.Iterable<? extends
         * javax.annotation.processing.Processor>)}.
         *
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#setProcessors(Iterable) public abstract void
         * javax.tools.JavaCompiler$CompilationTask.setProcessors(java.lang.Iterable)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.tools.JavaCompiler.CompilationTask#setProcessors(Iterable) public abstract void
         *      javax.tools.JavaCompiler$CompilationTask.setProcessors(java.lang.Iterable) (the hereby targeted
         *      method-under-test)
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

        /**
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#setLocale(java.util.Locale) public abstract
         * void javax.tools.JavaCompiler$CompilationTask.setLocale(java.util.Locale)}.
         *
         * <p>
         * Test method for {@link javax.tools.JavaCompiler.CompilationTask#setLocale(java.util.Locale) public abstract
         * void javax.tools.JavaCompiler$CompilationTask.setLocale(java.util.Locale)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.tools.JavaCompiler.CompilationTask#setLocale(java.util.Locale) public abstract void
         *      javax.tools.JavaCompiler$CompilationTask.setLocale(java.util.Locale) (the hereby targeted
         *      method-under-test)
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

    }

}
