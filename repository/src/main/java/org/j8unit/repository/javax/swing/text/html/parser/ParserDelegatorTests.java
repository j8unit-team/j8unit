package org.j8unit.repository.javax.swing.text.html.parser;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.html.parser.ParserDelegator class
 * javax.swing.text.html.parser.ParserDelegator}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ParserDelegatorClassTests}.
 * </p>
 *
 * @see javax.swing.text.html.parser.ParserDelegator class javax.swing.text.html.parser.ParserDelegator (the hereby
 *      targeted class-under-test class)
 * @see ParserDelegatorClassTests ParserDelegatorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParserDelegatorTests<SUT extends javax.swing.text.html.parser.ParserDelegator>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.html.parser.ParserDelegator#parse(java.io.Reader, javax.swing.text.html.HTMLEditorKit.ParserCallback, boolean)
     * public void
     * javax.swing.text.html.parser.ParserDelegator.parse(java.io.Reader,javax.swing.text.html.HTMLEditorKit$ParserCallback,boolean)
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.text.html.parser.ParserDelegator#parse(java.io.Reader, javax.swing.text.html.HTMLEditorKit.ParserCallback, boolean)
     * public void
     * javax.swing.text.html.parser.ParserDelegator.parse(java.io.Reader,javax.swing.text.html.HTMLEditorKit$ParserCallback,boolean)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.html.parser.ParserDelegator#parse(java.io.Reader,
     *      javax.swing.text.html.HTMLEditorKit.ParserCallback, boolean) public void
     *      javax.swing.text.html.parser.ParserDelegator.parse(java.io.Reader,javax.swing.text.html.
     *      HTMLEditorKit$ParserCallback,boolean) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_parse_Reader_ParserCallback_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
