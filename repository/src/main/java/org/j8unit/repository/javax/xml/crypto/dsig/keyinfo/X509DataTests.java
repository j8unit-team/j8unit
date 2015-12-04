package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.keyinfo.X509Data interface javax.xml.crypto.dsig.keyinfo.X509Data},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.X509DataClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface X509DataTests<SUT extends javax.xml.crypto.dsig.keyinfo.X509Data>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.X509Data#getContent() public abstract java.util.List
     * javax.xml.crypto.dsig.keyinfo.X509Data.getContent()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
