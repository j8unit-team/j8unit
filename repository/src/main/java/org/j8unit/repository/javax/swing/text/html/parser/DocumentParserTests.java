package org.j8unit.repository.javax.swing.text.html.parser;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.parser.DocumentParser class javax.swing.text.html.parser.DocumentParser},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.parser.DocumentParserClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocumentParserTests<SUT extends javax.swing.text.html.parser.DocumentParser>
extends org.j8unit.repository.javax.swing.text.html.parser.ParserTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.html.parser.DocumentParser#parse(java.io.Reader,javax.swing.text.html.HTMLEditorKit.ParserCallback,boolean)
     * public void
     * javax.swing.text.html.parser.DocumentParser.parse(java.io.Reader,javax.swing.text.html.HTMLEditorKit$ParserCallback,boolean)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_Reader_ParserCallback_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
