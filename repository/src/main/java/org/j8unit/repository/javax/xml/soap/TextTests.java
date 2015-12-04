package org.j8unit.repository.javax.xml.soap;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.soap.Text interface javax.xml.soap.Text},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.soap.TextClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TextTests<SUT extends javax.xml.soap.Text>
extends org.j8unit.repository.javax.xml.soap.NodeTests<SUT>,
        org.j8unit.repository.org.w3c.dom.TextTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.soap.Text#isComment() public abstract boolean javax.xml.soap.Text.isComment()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isComment() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
