package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.io.InputStreamReader class java.io.InputStreamReader}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.io.InputStreamReaderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InputStreamReaderTests<SUT extends java.io.InputStreamReader>
extends org.j8unit.repository.java.io.ReaderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.InputStreamReader#close() public void java.io.InputStreamReader.close() throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.InputStreamReader#getEncoding() public java.lang.String
     * java.io.InputStreamReader.getEncoding()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEncoding()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.InputStreamReader#read() public int java.io.InputStreamReader.read() throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.InputStreamReader#read(char[],int,int) public int
     * java.io.InputStreamReader.read(char[],int,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_charArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.InputStreamReader#ready() public boolean java.io.InputStreamReader.ready() throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_ready()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}