package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.datatransfer.FlavorTable interface
 * java.awt.datatransfer.FlavorTable}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.datatransfer.FlavorTableTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.datatransfer.FlavorTableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.datatransfer.FlavorTable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FlavorTableTests<SUT extends java.awt.datatransfer.FlavorTable>
extends org.j8unit.repository.java.awt.datatransfer.FlavorMapTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorTable#getFlavorsForNative(java.lang.String) public abstract
     * java.util.List java.awt.datatransfer.FlavorTable.getFlavorsForNative(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.datatransfer.FlavorTable#getFlavorsForNative(java.lang.String)
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

    /**
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
     * @j8unit.aim java.awt.datatransfer.FlavorTable#getNativesForFlavor(java.awt.datatransfer.DataFlavor)
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

}
