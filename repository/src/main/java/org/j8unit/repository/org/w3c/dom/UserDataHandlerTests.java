package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.w3c.dom.UserDataHandler;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link UserDataHandler
 * public abstract interface org.w3c.dom.UserDataHandler}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.w3c.dom.UserDataHandlerClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UserDataHandlerTests<SUT extends UserDataHandler>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.UserDataHandler]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.w3c.dom.UserDataHandler#handle(short, String, Object, org.w3c.dom.Node, org.w3c.dom.Node) public
     * abstract void
     * org.w3c.dom.UserDataHandler.handle(short,java.lang.String,java.lang.Object,org.w3c.dom.Node,org.w3c.dom.Node)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.UserDataHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.UserDataHandler]

}
