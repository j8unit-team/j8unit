package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.callback.TextOutputCallback class
 * javax.security.auth.callback.TextOutputCallback}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link TextOutputCallbackClassTests}.
 * </p>
 *
 * @see javax.security.auth.callback.TextOutputCallback class javax.security.auth.callback.TextOutputCallback (the
 *      hereby targeted class-under-test class)
 * @see TextOutputCallbackClassTests TextOutputCallbackClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextOutputCallbackTests<SUT extends javax.security.auth.callback.TextOutputCallback>
extends CallbackTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.TextOutputCallback#getMessageType() public int
     * javax.security.auth.callback.TextOutputCallback.getMessageType()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.TextOutputCallback#getMessageType() public int
     * javax.security.auth.callback.TextOutputCallback.getMessageType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.TextOutputCallback#getMessageType() public int
     *      javax.security.auth.callback.TextOutputCallback.getMessageType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMessageType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.TextOutputCallback#getMessage() public java.lang.String
     * javax.security.auth.callback.TextOutputCallback.getMessage()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.TextOutputCallback#getMessage() public java.lang.String
     * javax.security.auth.callback.TextOutputCallback.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.TextOutputCallback#getMessage() public java.lang.String
     *      javax.security.auth.callback.TextOutputCallback.getMessage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
