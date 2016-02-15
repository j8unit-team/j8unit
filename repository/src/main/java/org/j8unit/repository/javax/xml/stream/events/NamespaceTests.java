package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.events.Namespace interface
 * javax.xml.stream.events.Namespace}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link NamespaceClassTests}.
 * </p>
 *
 * @see javax.xml.stream.events.Namespace interface javax.xml.stream.events.Namespace (the hereby targeted
 *      class-under-test class)
 * @see NamespaceClassTests NamespaceClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamespaceTests<SUT extends javax.xml.stream.events.Namespace>
extends AttributeTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.Namespace#getPrefix() public abstract java.lang.String
     * javax.xml.stream.events.Namespace.getPrefix()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.events.Namespace#getPrefix() public abstract java.lang.String
     * javax.xml.stream.events.Namespace.getPrefix()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.events.Namespace#getPrefix() public abstract java.lang.String
     *      javax.xml.stream.events.Namespace.getPrefix() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrefix()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.Namespace#getNamespaceURI() public abstract java.lang.String
     * javax.xml.stream.events.Namespace.getNamespaceURI()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.events.Namespace#getNamespaceURI() public abstract java.lang.String
     * javax.xml.stream.events.Namespace.getNamespaceURI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.events.Namespace#getNamespaceURI() public abstract java.lang.String
     *      javax.xml.stream.events.Namespace.getNamespaceURI() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamespaceURI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.Namespace#isDefaultNamespaceDeclaration() public abstract boolean
     * javax.xml.stream.events.Namespace.isDefaultNamespaceDeclaration()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.events.Namespace#isDefaultNamespaceDeclaration() public abstract boolean
     * javax.xml.stream.events.Namespace.isDefaultNamespaceDeclaration()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.events.Namespace#isDefaultNamespaceDeclaration() public abstract boolean
     *      javax.xml.stream.events.Namespace.isDefaultNamespaceDeclaration() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDefaultNamespaceDeclaration()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
