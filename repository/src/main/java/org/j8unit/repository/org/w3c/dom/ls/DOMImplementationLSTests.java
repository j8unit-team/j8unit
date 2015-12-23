package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.ls.DOMImplementationLS interface
 * org.w3c.dom.ls.DOMImplementationLS}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.ls.DOMImplementationLSTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.ls.DOMImplementationLSClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.ls.DOMImplementationLS
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMImplementationLSTests<SUT extends org.w3c.dom.ls.DOMImplementationLS>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.DOMImplementationLS#createLSInput() public abstract org.w3c.dom.ls.LSInput
     * org.w3c.dom.ls.DOMImplementationLS.createLSInput()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.ls.DOMImplementationLS#createLSInput()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.ls.DOMImplementationLS#createLSOutput()
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
     * Test method for {@link org.w3c.dom.ls.DOMImplementationLS#createLSParser(short, java.lang.String) public abstract
     * org.w3c.dom.ls.LSParser org.w3c.dom.ls.DOMImplementationLS.createLSParser(short,java.lang.String) throws
     * org.w3c.dom.DOMException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.ls.DOMImplementationLS#createLSParser(short, java.lang.String)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.ls.DOMImplementationLS#createLSSerializer()
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
