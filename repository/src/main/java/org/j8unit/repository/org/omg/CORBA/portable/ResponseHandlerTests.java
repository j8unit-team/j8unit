package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.portable.ResponseHandler interface
 * org.omg.CORBA.portable.ResponseHandler}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ResponseHandlerClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.portable.ResponseHandler interface org.omg.CORBA.portable.ResponseHandler (the hereby targeted
 *      class-under-test class)
 * @see ResponseHandlerClassTests ResponseHandlerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ResponseHandlerTests<SUT extends org.omg.CORBA.portable.ResponseHandler>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ResponseHandler#createExceptionReply() public abstract
     * org.omg.CORBA.portable.OutputStream org.omg.CORBA.portable.ResponseHandler.createExceptionReply()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ResponseHandler#createExceptionReply() public abstract
     * org.omg.CORBA.portable.OutputStream org.omg.CORBA.portable.ResponseHandler.createExceptionReply()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.portable.ResponseHandler#createExceptionReply() public abstract
     *      org.omg.CORBA.portable.OutputStream org.omg.CORBA.portable.ResponseHandler.createExceptionReply() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createExceptionReply()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ResponseHandler#createReply() public abstract
     * org.omg.CORBA.portable.OutputStream org.omg.CORBA.portable.ResponseHandler.createReply()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ResponseHandler#createReply() public abstract
     * org.omg.CORBA.portable.OutputStream org.omg.CORBA.portable.ResponseHandler.createReply()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.portable.ResponseHandler#createReply() public abstract org.omg.CORBA.portable.OutputStream
     *      org.omg.CORBA.portable.ResponseHandler.createReply() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createReply()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
