package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.datatransfer.SystemFlavorMap class
 * java.awt.datatransfer.SystemFlavorMap}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SystemFlavorMapClassTests}.
 * </p>
 *
 * @see java.awt.datatransfer.SystemFlavorMap class java.awt.datatransfer.SystemFlavorMap (the hereby targeted
 *      class-under-test class)
 * @see SystemFlavorMapClassTests SystemFlavorMapClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SystemFlavorMapTests<SUT extends java.awt.datatransfer.SystemFlavorMap>
extends FlavorMapTests<SUT>, FlavorTableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#getNativesForFlavor(java.awt.datatransfer.DataFlavor) public
     * synchronized java.util.List
     * <java.lang.String> java.awt.datatransfer.SystemFlavorMap.getNativesForFlavor(java.awt.datatransfer.DataFlavor)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#getNativesForFlavor(java.awt.datatransfer.DataFlavor) public
     * synchronized java.util.List
     * java.awt.datatransfer.SystemFlavorMap.getNativesForFlavor(java.awt.datatransfer.DataFlavor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#getNativesForFlavor(java.awt.datatransfer.DataFlavor) public
     *      synchronized java.util.List
     *      java.awt.datatransfer.SystemFlavorMap.getNativesForFlavor(java.awt.datatransfer.DataFlavor) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#setNativesForFlavor(java.awt.datatransfer.DataFlavor, String[])
     * public synchronized void
     * java.awt.datatransfer.SystemFlavorMap.setNativesForFlavor(java.awt.datatransfer.DataFlavor,java.lang.String[])}.
     *
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#setNativesForFlavor(java.awt.datatransfer.DataFlavor, String[])
     * public synchronized void
     * java.awt.datatransfer.SystemFlavorMap.setNativesForFlavor(java.awt.datatransfer.DataFlavor,java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#setNativesForFlavor(java.awt.datatransfer.DataFlavor, String[]) public
     *      synchronized void
     *      java.awt.datatransfer.SystemFlavorMap.setNativesForFlavor(java.awt.datatransfer.DataFlavor,java.lang.String[
     *      ]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNativesForFlavor_DataFlavor_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#getNativesForFlavors(java.awt.datatransfer.DataFlavor[]) public
     * synchronized java.util.Map<java.awt.datatransfer.DataFlavor, java.lang.String>
     * java.awt.datatransfer.SystemFlavorMap.getNativesForFlavors(java.awt.datatransfer.DataFlavor[])}.
     *
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#getNativesForFlavors(java.awt.datatransfer.DataFlavor[]) public
     * synchronized java.util.Map
     * java.awt.datatransfer.SystemFlavorMap.getNativesForFlavors(java.awt.datatransfer.DataFlavor[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#getNativesForFlavors(java.awt.datatransfer.DataFlavor[]) public
     *      synchronized java.util.Map
     *      java.awt.datatransfer.SystemFlavorMap.getNativesForFlavors(java.awt.datatransfer.DataFlavor[]) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNativesForFlavors_DataFlavorArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#getFlavorsForNative(String) public synchronized
     * java.util.List
     * <java.awt.datatransfer.DataFlavor> java.awt.datatransfer.SystemFlavorMap.getFlavorsForNative(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#getFlavorsForNative(String) public synchronized
     * java.util.List java.awt.datatransfer.SystemFlavorMap.getFlavorsForNative(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#getFlavorsForNative(String) public synchronized java.util.List
     *      java.awt.datatransfer.SystemFlavorMap.getFlavorsForNative(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#addFlavorForUnencodedNative(String, java.awt.datatransfer.DataFlavor)
     * public synchronized void
     * java.awt.datatransfer.SystemFlavorMap.addFlavorForUnencodedNative(java.lang.String,java.awt.datatransfer.DataFlavor)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#addFlavorForUnencodedNative(String, java.awt.datatransfer.DataFlavor)
     * public synchronized void
     * java.awt.datatransfer.SystemFlavorMap.addFlavorForUnencodedNative(java.lang.String,java.awt.datatransfer.DataFlavor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#addFlavorForUnencodedNative(String, java.awt.datatransfer.DataFlavor)
     *      public synchronized void
     *      java.awt.datatransfer.SystemFlavorMap.addFlavorForUnencodedNative(java.lang.String,java.awt.datatransfer.
     *      DataFlavor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addFlavorForUnencodedNative_String_DataFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#setFlavorsForNative(String, java.awt.datatransfer.DataFlavor[])
     * public synchronized void
     * java.awt.datatransfer.SystemFlavorMap.setFlavorsForNative(java.lang.String,java.awt.datatransfer.DataFlavor[])}.
     *
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#setFlavorsForNative(String, java.awt.datatransfer.DataFlavor[])
     * public synchronized void
     * java.awt.datatransfer.SystemFlavorMap.setFlavorsForNative(java.lang.String,java.awt.datatransfer.DataFlavor[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#setFlavorsForNative(String, java.awt.datatransfer.DataFlavor[]) public
     *      synchronized void
     *      java.awt.datatransfer.SystemFlavorMap.setFlavorsForNative(java.lang.String,java.awt.datatransfer.DataFlavor[
     *      ]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFlavorsForNative_String_DataFlavorArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#getFlavorsForNatives(String[]) public synchronized
     * java.util.Map<java.lang.String, java.awt.datatransfer.DataFlavor>
     * java.awt.datatransfer.SystemFlavorMap.getFlavorsForNatives(java.lang.String[])}.
     *
     * <p>
     * Test method for {@link java.awt.datatransfer.SystemFlavorMap#getFlavorsForNatives(String[]) public synchronized
     * java.util.Map java.awt.datatransfer.SystemFlavorMap.getFlavorsForNatives(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#getFlavorsForNatives(String[]) public synchronized java.util.Map
     *      java.awt.datatransfer.SystemFlavorMap.getFlavorsForNatives(java.lang.String[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#addUnencodedNativeForFlavor(java.awt.datatransfer.DataFlavor, String)
     * public synchronized void
     * java.awt.datatransfer.SystemFlavorMap.addUnencodedNativeForFlavor(java.awt.datatransfer.DataFlavor,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.SystemFlavorMap#addUnencodedNativeForFlavor(java.awt.datatransfer.DataFlavor, String)
     * public synchronized void
     * java.awt.datatransfer.SystemFlavorMap.addUnencodedNativeForFlavor(java.awt.datatransfer.DataFlavor,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#addUnencodedNativeForFlavor(java.awt.datatransfer.DataFlavor, String)
     *      public synchronized void
     *      java.awt.datatransfer.SystemFlavorMap.addUnencodedNativeForFlavor(java.awt.datatransfer.DataFlavor,java.lang
     *      .String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addUnencodedNativeForFlavor_DataFlavor_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
