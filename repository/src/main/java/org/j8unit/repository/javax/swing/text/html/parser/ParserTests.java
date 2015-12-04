package org.j8unit.repository.javax.swing.text.html.parser;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.parser.Parser class javax.swing.text.html.parser.Parser}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.parser.ParserClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParserTests<SUT extends javax.swing.text.html.parser.Parser>
extends org.j8unit.repository.javax.swing.text.html.parser.DTDConstantsTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.parser.Parser#parse(java.io.Reader) public synchronized void
     * javax.swing.text.html.parser.Parser.parse(java.io.Reader) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_Reader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.parser.Parser#parseDTDMarkup() public java.lang.String
     * javax.swing.text.html.parser.Parser.parseDTDMarkup() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parseDTDMarkup()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
