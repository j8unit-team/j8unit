package org.j8unit.repository.javax.xml.namespace;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.namespace.NamespaceContext interface
 * javax.xml.namespace.NamespaceContext}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NamespaceContextClassTests}.
 * </p>
 *
 * @see javax.xml.namespace.NamespaceContext interface javax.xml.namespace.NamespaceContext (the hereby targeted
 *      class-under-test class)
 * @see NamespaceContextClassTests NamespaceContextClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamespaceContextTests<SUT extends javax.xml.namespace.NamespaceContext>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.namespace.NamespaceContext#getPrefixes(String) public abstract
     * java.util.Iterator javax.xml.namespace.NamespaceContext.getPrefixes(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.namespace.NamespaceContext#getPrefixes(String) public abstract
     * java.util.Iterator javax.xml.namespace.NamespaceContext.getPrefixes(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.namespace.NamespaceContext#getPrefixes(String) public abstract java.util.Iterator
     *      javax.xml.namespace.NamespaceContext.getPrefixes(java.lang.String) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.xml.namespace.NamespaceContext#getNamespaceURI(String) public abstract
     * java.lang.String javax.xml.namespace.NamespaceContext.getNamespaceURI(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.namespace.NamespaceContext#getNamespaceURI(String) public abstract
     * java.lang.String javax.xml.namespace.NamespaceContext.getNamespaceURI(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.namespace.NamespaceContext#getNamespaceURI(String) public abstract java.lang.String
     *      javax.xml.namespace.NamespaceContext.getNamespaceURI(java.lang.String) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.xml.namespace.NamespaceContext#getPrefix(String) public abstract java.lang.String
     * javax.xml.namespace.NamespaceContext.getPrefix(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.namespace.NamespaceContext#getPrefix(String) public abstract java.lang.String
     * javax.xml.namespace.NamespaceContext.getPrefix(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.namespace.NamespaceContext#getPrefix(String) public abstract java.lang.String
     *      javax.xml.namespace.NamespaceContext.getPrefix(java.lang.String) (the hereby targeted method-under-test)
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
