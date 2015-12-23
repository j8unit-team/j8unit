package org.j8unit.repository.javax.imageio.plugins.jpeg;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.imageio.plugins.jpeg.JPEGHuffmanTable class
 * javax.imageio.plugins.jpeg.JPEGHuffmanTable}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGHuffmanTableTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGHuffmanTableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.imageio.plugins.jpeg.JPEGHuffmanTable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JPEGHuffmanTableTests<SUT extends javax.imageio.plugins.jpeg.JPEGHuffmanTable>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.jpeg.JPEGHuffmanTable#getLengths() public short[]
     * javax.imageio.plugins.jpeg.JPEGHuffmanTable.getLengths()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.plugins.jpeg.JPEGHuffmanTable#getLengths()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLengths()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.jpeg.JPEGHuffmanTable#getValues() public short[]
     * javax.imageio.plugins.jpeg.JPEGHuffmanTable.getValues()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.plugins.jpeg.JPEGHuffmanTable#getValues()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValues()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.jpeg.JPEGHuffmanTable#toString() public java.lang.String
     * javax.imageio.plugins.jpeg.JPEGHuffmanTable.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.plugins.jpeg.JPEGHuffmanTable#toString()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
