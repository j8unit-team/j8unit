package org.j8unit.repository.java.util.zip;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.zip.GZIPInputStream class java.util.zip.GZIPInputStream}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.zip.GZIPInputStreamClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface GZIPInputStreamTests<SUT extends java.util.zip.GZIPInputStream>
extends org.j8unit.repository.java.util.zip.InflaterInputStreamTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.zip.GZIPInputStream#read(byte[],int,int) public int
     * java.util.zip.GZIPInputStream.read(byte[],int,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.zip.GZIPInputStream#close() public void java.util.zip.GZIPInputStream.close()
     * throws java.io.IOException}.
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

}
