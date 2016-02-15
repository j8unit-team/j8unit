package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.Console class java.io.Console}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link ConsoleClassTests}.
 * </p>
 *
 * @see java.io.Console class java.io.Console (the hereby targeted class-under-test class)
 * @see ConsoleClassTests ConsoleClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConsoleTests<SUT extends java.io.Console>
extends FlushableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.Console#writer() public java.io.PrintWriter java.io.Console.writer()}.
     *
     * <p>
     * Test method for {@link java.io.Console#writer() public java.io.PrintWriter java.io.Console.writer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#writer() public java.io.PrintWriter java.io.Console.writer() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Console#format(String, Object...) public java.io.Console
     * java.io.Console.format(java.lang.String,java.lang.Object...)}.
     *
     * <p>
     * Test method for {@link java.io.Console#format(String, Object...) public java.io.Console
     * java.io.Console.format(java.lang.String,java.lang.Object...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#format(String, Object...) public java.io.Console
     *      java.io.Console.format(java.lang.String,java.lang.Object[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_format_String_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Console#readPassword(String, Object...) public char[]
     * java.io.Console.readPassword(java.lang.String,java.lang.Object...)}.
     *
     * <p>
     * Test method for {@link java.io.Console#readPassword(String, Object...) public char[]
     * java.io.Console.readPassword(java.lang.String,java.lang.Object...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#readPassword(String, Object...) public char[]
     *      java.io.Console.readPassword(java.lang.String,java.lang.Object[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readPassword_String_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Console#readPassword() public char[] java.io.Console.readPassword()}.
     *
     * <p>
     * Test method for {@link java.io.Console#readPassword() public char[] java.io.Console.readPassword()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#readPassword() public char[] java.io.Console.readPassword() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readPassword()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Console#printf(String, Object...) public java.io.Console
     * java.io.Console.printf(java.lang.String,java.lang.Object...)}.
     *
     * <p>
     * Test method for {@link java.io.Console#printf(String, Object...) public java.io.Console
     * java.io.Console.printf(java.lang.String,java.lang.Object...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#printf(String, Object...) public java.io.Console
     *      java.io.Console.printf(java.lang.String,java.lang.Object[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printf_String_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Console#readLine() public java.lang.String java.io.Console.readLine()}.
     *
     * <p>
     * Test method for {@link java.io.Console#readLine() public java.lang.String java.io.Console.readLine()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#readLine() public java.lang.String java.io.Console.readLine() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readLine()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Console#readLine(String, Object...) public java.lang.String
     * java.io.Console.readLine(java.lang.String,java.lang.Object...)}.
     *
     * <p>
     * Test method for {@link java.io.Console#readLine(String, Object...) public java.lang.String
     * java.io.Console.readLine(java.lang.String,java.lang.Object...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#readLine(String, Object...) public java.lang.String
     *      java.io.Console.readLine(java.lang.String,java.lang.Object[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readLine_String_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Console#reader() public java.io.Reader java.io.Console.reader()}.
     *
     * <p>
     * Test method for {@link java.io.Console#reader() public java.io.Reader java.io.Console.reader()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#reader() public java.io.Reader java.io.Console.reader() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Console#flush() public void java.io.Console.flush()}.
     *
     * <p>
     * Test method for {@link java.io.Console#flush() public void java.io.Console.flush()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Console#flush() public void java.io.Console.flush() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_flush()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
