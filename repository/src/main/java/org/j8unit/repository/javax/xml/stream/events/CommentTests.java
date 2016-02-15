package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.events.Comment interface javax.xml.stream.events.Comment}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link CommentClassTests}.
 * </p>
 *
 * @see javax.xml.stream.events.Comment interface javax.xml.stream.events.Comment (the hereby targeted class-under-test
 *      class)
 * @see CommentClassTests CommentClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CommentTests<SUT extends javax.xml.stream.events.Comment>
extends XMLEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.Comment#getText() public abstract java.lang.String
     * javax.xml.stream.events.Comment.getText()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.events.Comment#getText() public abstract java.lang.String
     * javax.xml.stream.events.Comment.getText()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.events.Comment#getText() public abstract java.lang.String
     *      javax.xml.stream.events.Comment.getText() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
