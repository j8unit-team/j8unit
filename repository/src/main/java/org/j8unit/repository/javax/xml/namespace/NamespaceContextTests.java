package org.j8unit.repository.javax.xml.namespace;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.namespace.NamespaceContext interface javax.xml.namespace.NamespaceContext},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.namespace.NamespaceContextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NamespaceContextTests<SUT extends javax.xml.namespace.NamespaceContext>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.namespace.NamespaceContext#getNamespaceURI(java.lang.String) public abstract
     * java.lang.String javax.xml.namespace.NamespaceContext.getNamespaceURI(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamespaceURI_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.namespace.NamespaceContext#getPrefixes(java.lang.String) public abstract
     * java.util.Iterator javax.xml.namespace.NamespaceContext.getPrefixes(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrefixes_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.namespace.NamespaceContext#getPrefix(java.lang.String) public abstract
     * java.lang.String javax.xml.namespace.NamespaceContext.getPrefix(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrefix_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
