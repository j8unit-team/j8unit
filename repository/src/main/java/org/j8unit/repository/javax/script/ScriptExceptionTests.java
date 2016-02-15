package org.j8unit.repository.javax.script;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.script.ScriptException class javax.script.ScriptException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ScriptExceptionClassTests}.
 * </p>
 *
 * @see javax.script.ScriptException class javax.script.ScriptException (the hereby targeted class-under-test class)
 * @see ScriptExceptionClassTests ScriptExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScriptExceptionTests<SUT extends javax.script.ScriptException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.script.ScriptException#getFileName() public java.lang.String
     * javax.script.ScriptException.getFileName()}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptException#getFileName() public java.lang.String
     * javax.script.ScriptException.getFileName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptException#getFileName() public java.lang.String
     *      javax.script.ScriptException.getFileName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFileName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.ScriptException#getMessage() public java.lang.String
     * javax.script.ScriptException.getMessage()}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptException#getMessage() public java.lang.String
     * javax.script.ScriptException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptException#getMessage() public java.lang.String javax.script.ScriptException.getMessage()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.ScriptException#getColumnNumber() public int
     * javax.script.ScriptException.getColumnNumber()}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptException#getColumnNumber() public int
     * javax.script.ScriptException.getColumnNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptException#getColumnNumber() public int javax.script.ScriptException.getColumnNumber()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColumnNumber()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.ScriptException#getLineNumber() public int
     * javax.script.ScriptException.getLineNumber()}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptException#getLineNumber() public int
     * javax.script.ScriptException.getLineNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptException#getLineNumber() public int javax.script.ScriptException.getLineNumber() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLineNumber()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
