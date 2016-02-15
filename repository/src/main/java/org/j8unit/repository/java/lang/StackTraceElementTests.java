package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain StackTraceElement class java.lang.StackTraceElement}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link StackTraceElementClassTests}.
 * </p>
 *
 * @see StackTraceElement class java.lang.StackTraceElement (the hereby targeted class-under-test class)
 * @see StackTraceElementClassTests StackTraceElementClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StackTraceElementTests<SUT extends StackTraceElement>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link StackTraceElement#toString() public java.lang.String
     * java.lang.StackTraceElement.toString()}.
     *
     * <p>
     * Test method for {@link StackTraceElement#toString() public java.lang.String
     * java.lang.StackTraceElement.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see StackTraceElement#toString() public java.lang.String java.lang.StackTraceElement.toString() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link StackTraceElement#getClassName() public java.lang.String
     * java.lang.StackTraceElement.getClassName()}.
     *
     * <p>
     * Test method for {@link StackTraceElement#getClassName() public java.lang.String
     * java.lang.StackTraceElement.getClassName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see StackTraceElement#getClassName() public java.lang.String java.lang.StackTraceElement.getClassName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link StackTraceElement#getFileName() public java.lang.String
     * java.lang.StackTraceElement.getFileName()}.
     *
     * <p>
     * Test method for {@link StackTraceElement#getFileName() public java.lang.String
     * java.lang.StackTraceElement.getFileName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see StackTraceElement#getFileName() public java.lang.String java.lang.StackTraceElement.getFileName() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link StackTraceElement#isNativeMethod() public boolean
     * java.lang.StackTraceElement.isNativeMethod()}.
     *
     * <p>
     * Test method for {@link StackTraceElement#isNativeMethod() public boolean
     * java.lang.StackTraceElement.isNativeMethod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see StackTraceElement#isNativeMethod() public boolean java.lang.StackTraceElement.isNativeMethod() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isNativeMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link StackTraceElement#getLineNumber() public int java.lang.StackTraceElement.getLineNumber()}.
     *
     * <p>
     * Test method for {@link StackTraceElement#getLineNumber() public int java.lang.StackTraceElement.getLineNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see StackTraceElement#getLineNumber() public int java.lang.StackTraceElement.getLineNumber() (the hereby
     *      targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link StackTraceElement#hashCode() public int java.lang.StackTraceElement.hashCode()}.
     *
     * <p>
     * Test method for {@link StackTraceElement#hashCode() public int java.lang.StackTraceElement.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see StackTraceElement#hashCode() public int java.lang.StackTraceElement.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link StackTraceElement#equals(Object) public boolean
     * java.lang.StackTraceElement.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link StackTraceElement#equals(Object) public boolean
     * java.lang.StackTraceElement.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see StackTraceElement#equals(Object) public boolean java.lang.StackTraceElement.equals(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link StackTraceElement#getMethodName() public java.lang.String
     * java.lang.StackTraceElement.getMethodName()}.
     *
     * <p>
     * Test method for {@link StackTraceElement#getMethodName() public java.lang.String
     * java.lang.StackTraceElement.getMethodName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see StackTraceElement#getMethodName() public java.lang.String java.lang.StackTraceElement.getMethodName() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMethodName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
