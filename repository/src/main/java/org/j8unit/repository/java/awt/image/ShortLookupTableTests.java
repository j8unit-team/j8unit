package org.j8unit.repository.java.awt.image;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.image.ShortLookupTable class java.awt.image.ShortLookupTable}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ShortLookupTableClassTests}.
 * </p>
 *
 * @see java.awt.image.ShortLookupTable class java.awt.image.ShortLookupTable (the hereby targeted class-under-test
 *      class)
 * @see ShortLookupTableClassTests ShortLookupTableClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ShortLookupTableTests<SUT extends java.awt.image.ShortLookupTable>
extends LookupTableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.ShortLookupTable#lookupPixel(int[], int[]) public int[]
     * java.awt.image.ShortLookupTable.lookupPixel(int[],int[])}.
     *
     * <p>
     * Test method for {@link java.awt.image.ShortLookupTable#lookupPixel(int[], int[]) public int[]
     * java.awt.image.ShortLookupTable.lookupPixel(int[],int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.ShortLookupTable#lookupPixel(int[], int[]) public int[]
     *      java.awt.image.ShortLookupTable.lookupPixel(int[],int[]) (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.image.ShortLookupTable#lookupPixel(short[], short[]) public short[]
     * java.awt.image.ShortLookupTable.lookupPixel(short[],short[])}.
     *
     * <p>
     * Test method for {@link java.awt.image.ShortLookupTable#lookupPixel(short[], short[]) public short[]
     * java.awt.image.ShortLookupTable.lookupPixel(short[],short[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.ShortLookupTable#lookupPixel(short[], short[]) public short[]
     *      java.awt.image.ShortLookupTable.lookupPixel(short[],short[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupPixel_shortArray_shortArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.ShortLookupTable#getTable() public final short[][]
     * java.awt.image.ShortLookupTable.getTable()}.
     *
     * <p>
     * Test method for {@link java.awt.image.ShortLookupTable#getTable() public final short[][]
     * java.awt.image.ShortLookupTable.getTable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.ShortLookupTable#getTable() public final short[][] java.awt.image.ShortLookupTable.getTable()
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

}
