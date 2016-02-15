package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.datatransfer.FlavorMap interface java.awt.datatransfer.FlavorMap}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link FlavorMapClassTests}.
 * </p>
 *
 * @see java.awt.datatransfer.FlavorMap interface java.awt.datatransfer.FlavorMap (the hereby targeted class-under-test
 *      class)
 * @see FlavorMapClassTests FlavorMapClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FlavorMapTests<SUT extends java.awt.datatransfer.FlavorMap>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorMap#getFlavorsForNatives(String[]) public abstract
     * java.util.Map<java.lang.String, java.awt.datatransfer.DataFlavor>
     * java.awt.datatransfer.FlavorMap.getFlavorsForNatives(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorMap#getFlavorsForNatives(String[]) public abstract
     * java.util.Map java.awt.datatransfer.FlavorMap.getFlavorsForNatives(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.FlavorMap#getFlavorsForNatives(String[]) public abstract java.util.Map
     *      java.awt.datatransfer.FlavorMap.getFlavorsForNatives(java.lang.String[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlavorsForNatives_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorMap#getNativesForFlavors(java.awt.datatransfer.DataFlavor[])
     * public abstract java.util.Map<java.awt.datatransfer.DataFlavor, java.lang.String>
     * java.awt.datatransfer.FlavorMap.getNativesForFlavors(java.awt.datatransfer.DataFlavor[])}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.FlavorMap#getNativesForFlavors(java.awt.datatransfer.DataFlavor[])
     * public abstract java.util.Map
     * java.awt.datatransfer.FlavorMap.getNativesForFlavors(java.awt.datatransfer.DataFlavor[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.FlavorMap#getNativesForFlavors(java.awt.datatransfer.DataFlavor[]) public abstract
     *      java.util.Map java.awt.datatransfer.FlavorMap.getNativesForFlavors(java.awt.datatransfer.DataFlavor[]) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNativesForFlavors_DataFlavorArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
