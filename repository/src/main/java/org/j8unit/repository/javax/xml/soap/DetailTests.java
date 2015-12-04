package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.soap.Detail interface javax.xml.soap.Detail}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.soap.DetailClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DetailTests<SUT extends javax.xml.soap.Detail>
extends org.j8unit.repository.javax.xml.soap.SOAPFaultElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.Detail#addDetailEntry(javax.xml.soap.Name) public abstract
     * javax.xml.soap.DetailEntry javax.xml.soap.Detail.addDetailEntry(javax.xml.soap.Name) throws
     * javax.xml.soap.SOAPException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addDetailEntry_Name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.Detail#addDetailEntry(javax.xml.namespace.QName) public abstract
     * javax.xml.soap.DetailEntry javax.xml.soap.Detail.addDetailEntry(javax.xml.namespace.QName) throws
     * javax.xml.soap.SOAPException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addDetailEntry_QName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.Detail#getDetailEntries() public abstract java.util.Iterator
     * javax.xml.soap.Detail.getDetailEntries()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDetailEntries()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
