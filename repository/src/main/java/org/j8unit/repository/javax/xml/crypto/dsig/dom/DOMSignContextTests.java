package org.j8unit.repository.javax.xml.crypto.dsig.dom;

import javax.xml.crypto.dsig.dom.DOMSignContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.xml.crypto.dom.DOMCryptoContextTests;
import org.j8unit.repository.javax.xml.crypto.dsig.XMLSignContextTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link DOMSignContext
 * public class javax.xml.crypto.dsig.dom.DOMSignContext}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.dom.DOMSignContextClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMSignContextTests<SUT extends DOMSignContext>
extends XMLSignContextTests<SUT>, DOMCryptoContextTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMSignContext]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.dsig.dom.DOMSignContext#getNextSibling() public org.w3c.dom.Node
     * javax.xml.crypto.dsig.dom.DOMSignContext.getNextSibling()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextSibling()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.crypto.dsig.dom.DOMSignContext#getParent()
     * public org.w3c.dom.Node javax.xml.crypto.dsig.dom.DOMSignContext.getParent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.dsig.dom.DOMSignContext#setParent(org.w3c.dom.Node) public void
     * javax.xml.crypto.dsig.dom.DOMSignContext.setParent(org.w3c.dom.Node)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setParent_Node()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.dsig.dom.DOMSignContext#setNextSibling(org.w3c.dom.Node) public void
     * javax.xml.crypto.dsig.dom.DOMSignContext.setNextSibling(org.w3c.dom.Node)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNextSibling_Node()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMSignContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.dom.DOMSignContext]

}
