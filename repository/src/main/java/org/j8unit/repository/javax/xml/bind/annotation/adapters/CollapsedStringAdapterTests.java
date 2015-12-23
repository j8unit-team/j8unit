package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.annotation.adapters.CollapsedStringAdapter class
 * javax.xml.bind.annotation.adapters.CollapsedStringAdapter}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
 * class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.annotation.adapters.CollapsedStringAdapterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.bind.annotation.adapters.CollapsedStringAdapterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.annotation.adapters.CollapsedStringAdapter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollapsedStringAdapterTests<SUT extends javax.xml.bind.annotation.adapters.CollapsedStringAdapter>
extends org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlAdapterTests<SUT, java.lang.String, java.lang.String> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.CollapsedStringAdapter#marshal(java.lang.String) public
     * java.lang.String javax.xml.bind.annotation.adapters.CollapsedStringAdapter.marshal(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.annotation.adapters.CollapsedStringAdapter#marshal(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.CollapsedStringAdapter#unmarshal(java.lang.String)
     * public java.lang.String javax.xml.bind.annotation.adapters.CollapsedStringAdapter.unmarshal(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.bind.annotation.adapters.CollapsedStringAdapter#unmarshal(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
