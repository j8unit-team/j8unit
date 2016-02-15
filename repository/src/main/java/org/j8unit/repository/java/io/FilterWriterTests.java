package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.FilterWriter class java.io.FilterWriter}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link FilterWriterClassTests}.
 * </p>
 *
 * @see java.io.FilterWriter class java.io.FilterWriter (the hereby targeted class-under-test class)
 * @see FilterWriterClassTests FilterWriterClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilterWriterTests<SUT extends java.io.FilterWriter>
extends WriterTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.FilterWriter#flush() public void java.io.FilterWriter.flush() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.FilterWriter#flush() public void java.io.FilterWriter.flush() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.FilterWriter#flush() public void java.io.FilterWriter.flush() throws java.io.IOException (the hereby
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

    /**
     * <p>
     * Test method for {@link java.io.FilterWriter#write(String, int, int) public void
     * java.io.FilterWriter.write(java.lang.String,int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.FilterWriter#write(String, int, int) public void
     * java.io.FilterWriter.write(java.lang.String,int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.FilterWriter#write(String, int, int) public void
     *      java.io.FilterWriter.write(java.lang.String,int,int) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.io.FilterWriter#write(char[], int, int) public void
     * java.io.FilterWriter.write(char[],int,int) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.FilterWriter#write(char[], int, int) public void
     * java.io.FilterWriter.write(char[],int,int) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.FilterWriter#write(char[], int, int) public void java.io.FilterWriter.write(char[],int,int) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.io.FilterWriter#write(int) public void java.io.FilterWriter.write(int) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.FilterWriter#write(int) public void java.io.FilterWriter.write(int) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.FilterWriter#write(int) public void java.io.FilterWriter.write(int) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.io.FilterWriter#close() public void java.io.FilterWriter.close() throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.FilterWriter#close() public void java.io.FilterWriter.close() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.FilterWriter#close() public void java.io.FilterWriter.close() throws java.io.IOException (the hereby
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

}
