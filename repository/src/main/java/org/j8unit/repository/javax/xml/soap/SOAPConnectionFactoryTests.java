package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.soap.SOAPConnectionFactory class javax.xml.soap.SOAPConnectionFactory}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.soap.SOAPConnectionFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SOAPConnectionFactoryTests<SUT extends javax.xml.soap.SOAPConnectionFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPConnectionFactory#createConnection() public abstract
     * javax.xml.soap.SOAPConnection javax.xml.soap.SOAPConnectionFactory.createConnection() throws
     * javax.xml.soap.SOAPException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createConnection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
