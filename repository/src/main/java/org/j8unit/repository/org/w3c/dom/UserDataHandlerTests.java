package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.UserDataHandler interface org.w3c.dom.UserDataHandler}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link UserDataHandlerClassTests}.
 * </p>
 *
 * @see org.w3c.dom.UserDataHandler interface org.w3c.dom.UserDataHandler (the hereby targeted class-under-test class)
 * @see UserDataHandlerClassTests UserDataHandlerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UserDataHandlerTests<SUT extends org.w3c.dom.UserDataHandler>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.UserDataHandler#handle(short, String, Object, org.w3c.dom.Node, org.w3c.dom.Node) public
     * abstract void
     * org.w3c.dom.UserDataHandler.handle(short,java.lang.String,java.lang.Object,org.w3c.dom.Node,org.w3c.dom.Node)}.
     *
     * <p>
     * Test method for
     * {@link org.w3c.dom.UserDataHandler#handle(short, String, Object, org.w3c.dom.Node, org.w3c.dom.Node) public
     * abstract void
     * org.w3c.dom.UserDataHandler.handle(short,java.lang.String,java.lang.Object,org.w3c.dom.Node,org.w3c.dom.Node)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.UserDataHandler#handle(short, String, Object, org.w3c.dom.Node, org.w3c.dom.Node) public
     *      abstract void
     *      org.w3c.dom.UserDataHandler.handle(short,java.lang.String,java.lang.Object,org.w3c.dom.Node,org.w3c.dom.
     *      Node) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handle_short_String_Object_Node_Node()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
