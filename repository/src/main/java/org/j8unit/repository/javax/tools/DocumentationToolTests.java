package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.DocumentationTool interface javax.tools.DocumentationTool}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link DocumentationToolClassTests}.
 * </p>
 *
 * @see javax.tools.DocumentationTool interface javax.tools.DocumentationTool (the hereby targeted class-under-test
 *      class)
 * @see DocumentationToolClassTests DocumentationToolClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocumentationToolTests<SUT extends javax.tools.DocumentationTool>
extends ToolTests<SUT>, OptionCheckerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.tools.DocumentationTool#getTask(java.io.Writer, javax.tools.JavaFileManager, javax.tools.DiagnosticListener, Class, Iterable, Iterable)
     * public abstract javax.tools.DocumentationTool$DocumentationTask
     * javax.tools.DocumentationTool.getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener<?
     * super javax.tools.JavaFileObject>,java.lang.Class<?>,java.lang.Iterable<java.lang.String>,java.lang.Iterable<?
     * extends javax.tools.JavaFileObject>)}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.DocumentationTool#getTask(java.io.Writer, javax.tools.JavaFileManager, javax.tools.DiagnosticListener, Class, Iterable, Iterable)
     * public abstract javax.tools.DocumentationTool$DocumentationTask
     * javax.tools.DocumentationTool.getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener,java.lang.Class,java.lang.Iterable,java.lang.Iterable)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.DocumentationTool#getTask(java.io.Writer, javax.tools.JavaFileManager,
     *      javax.tools.DiagnosticListener, Class, Iterable, Iterable) public abstract
     *      javax.tools.DocumentationTool$DocumentationTask
     *      javax.tools.DocumentationTool.getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.
     *      DiagnosticListener,java.lang.Class,java.lang.Iterable,java.lang.Iterable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTask_Writer_JavaFileManager_DiagnosticListener_Class_Iterable_Iterable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.DocumentationTool#getStandardFileManager(javax.tools.DiagnosticListener, java.util.Locale, java.nio.charset.Charset)
     * public abstract javax.tools.StandardJavaFileManager
     * javax.tools.DocumentationTool.getStandardFileManager(javax.tools.DiagnosticListener<? super
     * javax.tools.JavaFileObject>,java.util.Locale,java.nio.charset.Charset)}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.DocumentationTool#getStandardFileManager(javax.tools.DiagnosticListener, java.util.Locale, java.nio.charset.Charset)
     * public abstract javax.tools.StandardJavaFileManager
     * javax.tools.DocumentationTool.getStandardFileManager(javax.tools.DiagnosticListener,java.util.Locale,java.nio.charset.Charset)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.DocumentationTool#getStandardFileManager(javax.tools.DiagnosticListener, java.util.Locale,
     *      java.nio.charset.Charset) public abstract javax.tools.StandardJavaFileManager
     *      javax.tools.DocumentationTool.getStandardFileManager(javax.tools.DiagnosticListener,java.util.Locale,java.
     *      nio.charset.Charset) (the hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.tools.DocumentationTool.Location class
     * javax.tools.DocumentationTool$Location}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link DocumentationToolClassTests.LocationClassTests}.
     * </p>
     *
     * @see javax.tools.DocumentationTool.Location class javax.tools.DocumentationTool$Location (the hereby targeted
     *      class-under-test class)
     * @see DocumentationToolClassTests.LocationClassTests DocumentationToolClassTests.LocationClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LocationTests<SUT extends javax.tools.DocumentationTool.Location>
    extends JavaFileManagerTests.LocationTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, javax.tools.DocumentationTool.Location> {

        /**
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.Location#getName() public java.lang.String
         * javax.tools.DocumentationTool$Location.getName()}.
         *
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.Location#getName() public java.lang.String
         * javax.tools.DocumentationTool$Location.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.tools.DocumentationTool.Location#getName() public java.lang.String
         *      javax.tools.DocumentationTool$Location.getName() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.Location#isOutputLocation() public boolean
         * javax.tools.DocumentationTool$Location.isOutputLocation()}.
         *
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.Location#isOutputLocation() public boolean
         * javax.tools.DocumentationTool$Location.isOutputLocation()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.tools.DocumentationTool.Location#isOutputLocation() public boolean
         *      javax.tools.DocumentationTool$Location.isOutputLocation() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_isOutputLocation()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.tools.DocumentationTool.DocumentationTask interface
     * javax.tools.DocumentationTool$DocumentationTask}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link DocumentationToolClassTests.DocumentationTaskClassTests}.
     * </p>
     *
     * @see javax.tools.DocumentationTool.DocumentationTask interface javax.tools.DocumentationTool$DocumentationTask
     *      (the hereby targeted class-under-test class)
     * @see DocumentationToolClassTests.DocumentationTaskClassTests
     *      DocumentationToolClassTests.DocumentationTaskClassTests (the complementary j8unit test interface containing
     *      the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DocumentationTaskTests<SUT extends javax.tools.DocumentationTool.DocumentationTask>
    extends org.j8unit.repository.java.util.concurrent.CallableTests<SUT, Boolean> {

        /**
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.DocumentationTask#call() public abstract
         * java.lang.Boolean javax.tools.DocumentationTool$DocumentationTask.call()}.
         *
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.DocumentationTask#call() public abstract
         * java.lang.Boolean javax.tools.DocumentationTool$DocumentationTask.call()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.tools.DocumentationTool.DocumentationTask#call() public abstract java.lang.Boolean
         *      javax.tools.DocumentationTool$DocumentationTask.call() (the hereby targeted method-under-test)
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
         * Test method for {@link javax.tools.DocumentationTool.DocumentationTask#setLocale(java.util.Locale) public
         * abstract void javax.tools.DocumentationTool$DocumentationTask.setLocale(java.util.Locale)}.
         *
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.DocumentationTask#setLocale(java.util.Locale) public
         * abstract void javax.tools.DocumentationTool$DocumentationTask.setLocale(java.util.Locale)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.tools.DocumentationTool.DocumentationTask#setLocale(java.util.Locale) public abstract void
         *      javax.tools.DocumentationTool$DocumentationTask.setLocale(java.util.Locale) (the hereby targeted
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
