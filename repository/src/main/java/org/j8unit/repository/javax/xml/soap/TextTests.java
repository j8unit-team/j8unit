package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.soap.Text interface javax.xml.soap.Text}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.soap.TextClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextTests<SUT extends javax.xml.soap.Text>
extends org.j8unit.repository.javax.xml.soap.NodeTests<SUT>, org.j8unit.repository.org.w3c.dom.TextTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.Text#isComment() public abstract boolean javax.xml.soap.Text.isComment()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isComment()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
