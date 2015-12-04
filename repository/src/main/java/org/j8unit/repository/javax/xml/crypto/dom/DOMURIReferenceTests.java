package org.j8unit.repository.javax.xml.crypto.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dom.DOMURIReference interface javax.xml.crypto.dom.DOMURIReference},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dom.DOMURIReferenceClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMURIReferenceTests<SUT extends javax.xml.crypto.dom.DOMURIReference>
extends org.j8unit.repository.javax.xml.crypto.URIReferenceTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dom.DOMURIReference#getHere() public abstract org.w3c.dom.Node
     * javax.xml.crypto.dom.DOMURIReference.getHere()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHere()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
