package org.j8unit.repository.java.awt.image;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.image.LookupTable class java.awt.image.LookupTable}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LookupTableClassTests}.
 * </p>
 *
 * @see java.awt.image.LookupTable class java.awt.image.LookupTable (the hereby targeted class-under-test class)
 * @see LookupTableClassTests LookupTableClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LookupTableTests<SUT extends java.awt.image.LookupTable>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.LookupTable#lookupPixel(int[], int[]) public abstract int[]
     * java.awt.image.LookupTable.lookupPixel(int[],int[])}.
     *
     * <p>
     * Test method for {@link java.awt.image.LookupTable#lookupPixel(int[], int[]) public abstract int[]
     * java.awt.image.LookupTable.lookupPixel(int[],int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.LookupTable#lookupPixel(int[], int[]) public abstract int[]
     *      java.awt.image.LookupTable.lookupPixel(int[],int[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.awt.image.LookupTable#getOffset() public int java.awt.image.LookupTable.getOffset()}.
     *
     * <p>
     * Test method for {@link java.awt.image.LookupTable#getOffset() public int java.awt.image.LookupTable.getOffset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.LookupTable#getOffset() public int java.awt.image.LookupTable.getOffset() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.LookupTable#getNumComponents() public int
     * java.awt.image.LookupTable.getNumComponents()}.
     *
     * <p>
     * Test method for {@link java.awt.image.LookupTable#getNumComponents() public int
     * java.awt.image.LookupTable.getNumComponents()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.LookupTable#getNumComponents() public int java.awt.image.LookupTable.getNumComponents() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNumComponents()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
