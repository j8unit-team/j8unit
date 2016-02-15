package org.j8unit.repository.javax.print;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.Doc interface javax.print.Doc}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link DocClassTests}.
 * </p>
 *
 * @see javax.print.Doc interface javax.print.Doc (the hereby targeted class-under-test class)
 * @see DocClassTests DocClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocTests<SUT extends javax.print.Doc>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.Doc#getPrintData() public abstract java.lang.Object
     * javax.print.Doc.getPrintData() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.print.Doc#getPrintData() public abstract java.lang.Object
     * javax.print.Doc.getPrintData() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.Doc#getPrintData() public abstract java.lang.Object javax.print.Doc.getPrintData() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.Doc#getDocFlavor() public abstract javax.print.DocFlavor
     * javax.print.Doc.getDocFlavor()}.
     *
     * <p>
     * Test method for {@link javax.print.Doc#getDocFlavor() public abstract javax.print.DocFlavor
     * javax.print.Doc.getDocFlavor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.Doc#getDocFlavor() public abstract javax.print.DocFlavor javax.print.Doc.getDocFlavor() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDocFlavor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.Doc#getStreamForBytes() public abstract java.io.InputStream
     * javax.print.Doc.getStreamForBytes() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.print.Doc#getStreamForBytes() public abstract java.io.InputStream
     * javax.print.Doc.getStreamForBytes() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.Doc#getStreamForBytes() public abstract java.io.InputStream javax.print.Doc.getStreamForBytes()
     *      throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStreamForBytes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.Doc#getReaderForText() public abstract java.io.Reader
     * javax.print.Doc.getReaderForText() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.print.Doc#getReaderForText() public abstract java.io.Reader
     * javax.print.Doc.getReaderForText() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.Doc#getReaderForText() public abstract java.io.Reader javax.print.Doc.getReaderForText() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReaderForText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.Doc#getAttributes() public abstract javax.print.attribute.DocAttributeSet
     * javax.print.Doc.getAttributes()}.
     *
     * <p>
     * Test method for {@link javax.print.Doc#getAttributes() public abstract javax.print.attribute.DocAttributeSet
     * javax.print.Doc.getAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.Doc#getAttributes() public abstract javax.print.attribute.DocAttributeSet
     *      javax.print.Doc.getAttributes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
