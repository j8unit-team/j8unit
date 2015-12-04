package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.ls.DOMImplementationLS interface org.w3c.dom.ls.DOMImplementationLS}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.ls.DOMImplementationLSClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMImplementationLSTests<SUT extends org.w3c.dom.ls.DOMImplementationLS>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.DOMImplementationLS#createLSInput() public abstract org.w3c.dom.ls.LSInput
     * org.w3c.dom.ls.DOMImplementationLS.createLSInput()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createLSInput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.DOMImplementationLS#createLSOutput() public abstract
     * org.w3c.dom.ls.LSOutput org.w3c.dom.ls.DOMImplementationLS.createLSOutput()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createLSOutput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.DOMImplementationLS#createLSParser(short,java.lang.String) public abstract
     * org.w3c.dom.ls.LSParser org.w3c.dom.ls.DOMImplementationLS.createLSParser(short,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createLSParser_short_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.DOMImplementationLS#createLSSerializer() public abstract
     * org.w3c.dom.ls.LSSerializer org.w3c.dom.ls.DOMImplementationLS.createLSSerializer()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createLSSerializer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
