package org.j8unit.repository.javax.tools;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.tools.DocumentationTool interface javax.tools.DocumentationTool},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.tools.DocumentationToolClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocumentationToolTests<SUT extends javax.tools.DocumentationTool>
extends org.j8unit.repository.javax.tools.ToolTests<SUT>,
        org.j8unit.repository.javax.tools.OptionCheckerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.tools.DocumentationTool#getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener,java.lang.Class,java.lang.Iterable,java.lang.Iterable) public abstract javax.tools.DocumentationTool$DocumentationTask javax.tools.DocumentationTool.getTask(java.io.Writer,javax.tools.JavaFileManager,javax.tools.DiagnosticListener,java.lang.Class,java.lang.Iterable,java.lang.Iterable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTask_Writer_JavaFileManager_DiagnosticListener_Class_Iterable_Iterable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.DocumentationTool#getStandardFileManager(javax.tools.DiagnosticListener,java.util.Locale,java.nio.charset.Charset) public abstract javax.tools.StandardJavaFileManager javax.tools.DocumentationTool.getStandardFileManager(javax.tools.DiagnosticListener,java.util.Locale,java.nio.charset.Charset)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStandardFileManager_DiagnosticListener_Locale_Charset() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.tools.DocumentationTool$DocumentationTask interface javax.tools.DocumentationTool$DocumentationTask},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.tools.DocumentationToolClassTests.DocumentationTaskClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface DocumentationTaskTests<SUT extends javax.tools.DocumentationTool.DocumentationTask>
    extends org.j8unit.repository.java.util.concurrent.CallableTests<SUT,java.lang.Boolean>
    {

        /**
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.DocumentationTask#call() public abstract java.lang.Boolean javax.tools.DocumentationTool$DocumentationTask.call()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_call() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.DocumentationTask#setLocale(java.util.Locale) public abstract void javax.tools.DocumentationTool$DocumentationTask.setLocale(java.util.Locale)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setLocale_Locale() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.tools.DocumentationTool$Location class javax.tools.DocumentationTool$Location},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.tools.DocumentationToolClassTests.LocationClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LocationTests<SUT extends javax.tools.DocumentationTool.Location>
    extends org.j8unit.repository.javax.tools.JavaFileManagerTests.LocationTests<SUT>,
            org.j8unit.repository.java.lang.EnumTests<SUT,javax.tools.DocumentationTool.Location>
    {

        /**
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.Location#getName() public java.lang.String javax.tools.DocumentationTool$Location.getName()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getName() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.tools.DocumentationTool.Location#isOutputLocation() public boolean javax.tools.DocumentationTool$Location.isOutputLocation()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_isOutputLocation() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
