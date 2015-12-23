package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.soap.Text interface javax.xml.soap.Text}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.javax.xml.soap.TextTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.soap.TextClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.soap.Text
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextTests<SUT extends javax.xml.soap.Text>
extends org.j8unit.repository.javax.xml.soap.NodeTests<SUT>, org.j8unit.repository.org.w3c.dom.TextTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.Text#isComment() public abstract boolean javax.xml.soap.Text.isComment()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.soap.Text#isComment()
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
