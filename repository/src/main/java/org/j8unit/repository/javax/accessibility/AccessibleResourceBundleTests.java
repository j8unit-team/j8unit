package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.accessibility.AccessibleResourceBundle class
 * javax.accessibility.AccessibleResourceBundle}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.accessibility.AccessibleResourceBundleClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AccessibleResourceBundleTests<SUT extends javax.accessibility.AccessibleResourceBundle>
extends org.j8unit.repository.java.util.ListResourceBundleTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleResourceBundle#getContents() public java.lang.Object[][]
     * javax.accessibility.AccessibleResourceBundle.getContents()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContents()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
