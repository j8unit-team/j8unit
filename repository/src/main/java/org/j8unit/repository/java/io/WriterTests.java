package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.Writer class java.io.Writer}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link WriterClassTests}.
 * </p>
 *
 * @see java.io.Writer class java.io.Writer (the hereby targeted class-under-test class)
 * @see WriterClassTests WriterClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WriterTests<SUT extends java.io.Writer>
extends org.j8unit.repository.java.lang.AppendableTests<SUT>, CloseableTests<SUT>, FlushableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.Writer#write(char[]) public void java.io.Writer.write(char[]) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#write(char[]) public void java.io.Writer.write(char[]) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#write(char[]) public void java.io.Writer.write(char[]) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_charArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#write(char[], int, int) public abstract void
     * java.io.Writer.write(char[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#write(char[], int, int) public abstract void
     * java.io.Writer.write(char[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#write(char[], int, int) public abstract void java.io.Writer.write(char[],int,int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_charArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#write(int) public void java.io.Writer.write(int) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#write(int) public void java.io.Writer.write(int) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#write(int) public void java.io.Writer.write(int) throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#write(String, int, int) public void
     * java.io.Writer.write(java.lang.String,int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#write(String, int, int) public void
     * java.io.Writer.write(java.lang.String,int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#write(String, int, int) public void java.io.Writer.write(java.lang.String,int,int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_String_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#write(String) public void java.io.Writer.write(java.lang.String) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#write(String) public void java.io.Writer.write(java.lang.String) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#write(String) public void java.io.Writer.write(java.lang.String) throws java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#close() public abstract void java.io.Writer.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#close() public abstract void java.io.Writer.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#close() public abstract void java.io.Writer.close() throws java.io.IOException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#append(CharSequence, int, int) public java.io.Writer
     * java.io.Writer.append(java.lang.CharSequence,int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#append(CharSequence, int, int) public java.io.Writer
     * java.io.Writer.append(java.lang.CharSequence,int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#append(CharSequence, int, int) public java.io.Writer
     *      java.io.Writer.append(java.lang.CharSequence,int,int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_append_CharSequence_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#append(char) public java.io.Writer java.io.Writer.append(char) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#append(char) public java.io.Writer java.io.Writer.append(char) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#append(char) public java.io.Writer java.io.Writer.append(char) throws java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_append_char()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#append(CharSequence) public java.io.Writer
     * java.io.Writer.append(java.lang.CharSequence) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#append(CharSequence) public java.io.Writer
     * java.io.Writer.append(java.lang.CharSequence) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#append(CharSequence) public java.io.Writer java.io.Writer.append(java.lang.CharSequence)
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_append_CharSequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Writer#flush() public abstract void java.io.Writer.flush() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Writer#flush() public abstract void java.io.Writer.flush() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Writer#flush() public abstract void java.io.Writer.flush() throws java.io.IOException (the hereby
     *      targeted method-under-test)
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
