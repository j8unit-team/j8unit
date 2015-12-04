package org.j8unit.repository.javax.swing.text.html.parser;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.parser.ParserDelegator class javax.swing.text.html.parser.ParserDelegator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.parser.ParserDelegatorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ParserDelegatorTests<SUT extends javax.swing.text.html.parser.ParserDelegator>
extends org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.parser.ParserDelegator#parse(java.io.Reader,javax.swing.text.html.HTMLEditorKit.ParserCallback,boolean) public void javax.swing.text.html.parser.ParserDelegator.parse(java.io.Reader,javax.swing.text.html.HTMLEditorKit$ParserCallback,boolean) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_parse_Reader_ParserCallback_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
