package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.datatransfer.FlavorTable interface java.awt.datatransfer.FlavorTable}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.datatransfer.FlavorTableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FlavorTableTests<SUT extends java.awt.datatransfer.FlavorTable>
extends org.j8unit.repository.java.awt.datatransfer.FlavorMapTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorTable#getNativesForFlavor(java.awt.datatransfer.DataFlavor)
     * public abstract java.util.List
     * java.awt.datatransfer.FlavorTable.getNativesForFlavor(java.awt.datatransfer.DataFlavor)}.
     * </p>
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
     * Test method for {@link java.awt.datatransfer.FlavorTable#getFlavorsForNative(java.lang.String) public abstract
     * java.util.List java.awt.datatransfer.FlavorTable.getFlavorsForNative(java.lang.String)}.
     * </p>
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
