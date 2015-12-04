package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.URIReference interface javax.xml.crypto.URIReference}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.URIReferenceClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface URIReferenceTests<SUT extends javax.xml.crypto.URIReference>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.URIReference#getType() public abstract java.lang.String
     * javax.xml.crypto.URIReference.getType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.URIReference#getURI() public abstract java.lang.String
     * javax.xml.crypto.URIReference.getURI()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
