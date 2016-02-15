package org.j8unit.repository.java.awt.image;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.image.ByteLookupTable class java.awt.image.ByteLookupTable}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ByteLookupTableClassTests}.
 * </p>
 *
 * @see java.awt.image.ByteLookupTable class java.awt.image.ByteLookupTable (the hereby targeted class-under-test class)
 * @see ByteLookupTableClassTests ByteLookupTableClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ByteLookupTableTests<SUT extends java.awt.image.ByteLookupTable>
extends LookupTableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.ByteLookupTable#getTable() public final byte[][]
     * java.awt.image.ByteLookupTable.getTable()}.
     *
     * <p>
     * Test method for {@link java.awt.image.ByteLookupTable#getTable() public final byte[][]
     * java.awt.image.ByteLookupTable.getTable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.ByteLookupTable#getTable() public final byte[][] java.awt.image.ByteLookupTable.getTable()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.ByteLookupTable#lookupPixel(int[], int[]) public int[]
     * java.awt.image.ByteLookupTable.lookupPixel(int[],int[])}.
     *
     * <p>
     * Test method for {@link java.awt.image.ByteLookupTable#lookupPixel(int[], int[]) public int[]
     * java.awt.image.ByteLookupTable.lookupPixel(int[],int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.ByteLookupTable#lookupPixel(int[], int[]) public int[]
     *      java.awt.image.ByteLookupTable.lookupPixel(int[],int[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lookupPixel_intArray_intArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.ByteLookupTable#lookupPixel(byte[], byte[]) public byte[]
     * java.awt.image.ByteLookupTable.lookupPixel(byte[],byte[])}.
     *
     * <p>
     * Test method for {@link java.awt.image.ByteLookupTable#lookupPixel(byte[], byte[]) public byte[]
     * java.awt.image.ByteLookupTable.lookupPixel(byte[],byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.ByteLookupTable#lookupPixel(byte[], byte[]) public byte[]
     *      java.awt.image.ByteLookupTable.lookupPixel(byte[],byte[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupPixel_byteArray_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
