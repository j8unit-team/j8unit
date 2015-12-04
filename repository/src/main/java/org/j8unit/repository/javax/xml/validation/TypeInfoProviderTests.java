package org.j8unit.repository.javax.xml.validation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.validation.TypeInfoProvider class javax.xml.validation.TypeInfoProvider}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.validation.TypeInfoProviderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypeInfoProviderTests<SUT extends javax.xml.validation.TypeInfoProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.validation.TypeInfoProvider#getAttributeTypeInfo(int) public abstract
     * org.w3c.dom.TypeInfo javax.xml.validation.TypeInfoProvider.getAttributeTypeInfo(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeTypeInfo_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.validation.TypeInfoProvider#getElementTypeInfo() public abstract
     * org.w3c.dom.TypeInfo javax.xml.validation.TypeInfoProvider.getElementTypeInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementTypeInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.validation.TypeInfoProvider#isIdAttribute(int) public abstract boolean
     * javax.xml.validation.TypeInfoProvider.isIdAttribute(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isIdAttribute_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.validation.TypeInfoProvider#isSpecified(int) public abstract boolean
     * javax.xml.validation.TypeInfoProvider.isSpecified(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSpecified_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
