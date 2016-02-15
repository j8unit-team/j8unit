package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.datatransfer.FlavorTable interface
 * java.awt.datatransfer.FlavorTable}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link FlavorTableClassTests}.
 * </p>
 *
 * @see java.awt.datatransfer.FlavorTable interface java.awt.datatransfer.FlavorTable (the hereby targeted
 *      class-under-test class)
 * @see FlavorTableClassTests FlavorTableClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FlavorTableTests<SUT extends java.awt.datatransfer.FlavorTable>
extends FlavorMapTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorTable#getNativesForFlavor(java.awt.datatransfer.DataFlavor)
     * public abstract java.util.List
     * <java.lang.String> java.awt.datatransfer.FlavorTable.getNativesForFlavor(java.awt.datatransfer.DataFlavor)}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorTable#getNativesForFlavor(java.awt.datatransfer.DataFlavor)
     * public abstract java.util.List
     * java.awt.datatransfer.FlavorTable.getNativesForFlavor(java.awt.datatransfer.DataFlavor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.FlavorTable#getNativesForFlavor(java.awt.datatransfer.DataFlavor) public abstract
     *      java.util.List java.awt.datatransfer.FlavorTable.getNativesForFlavor(java.awt.datatransfer.DataFlavor) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNativesForFlavor_DataFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorTable#getFlavorsForNative(String) public abstract
     * java.util.List
     * <java.awt.datatransfer.DataFlavor> java.awt.datatransfer.FlavorTable.getFlavorsForNative(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorTable#getFlavorsForNative(String) public abstract
     * java.util.List java.awt.datatransfer.FlavorTable.getFlavorsForNative(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.FlavorTable#getFlavorsForNative(String) public abstract java.util.List
     *      java.awt.datatransfer.FlavorTable.getFlavorsForNative(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlavorsForNative_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
