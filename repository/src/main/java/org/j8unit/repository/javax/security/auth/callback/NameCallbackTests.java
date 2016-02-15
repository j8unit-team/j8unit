package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.callback.NameCallback class
 * javax.security.auth.callback.NameCallback}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link NameCallbackClassTests}.
 * </p>
 *
 * @see javax.security.auth.callback.NameCallback class javax.security.auth.callback.NameCallback (the hereby targeted
 *      class-under-test class)
 * @see NameCallbackClassTests NameCallbackClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NameCallbackTests<SUT extends javax.security.auth.callback.NameCallback>
extends CallbackTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.NameCallback#getName() public java.lang.String
     * javax.security.auth.callback.NameCallback.getName()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.NameCallback#getName() public java.lang.String
     * javax.security.auth.callback.NameCallback.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.NameCallback#getName() public java.lang.String
     *      javax.security.auth.callback.NameCallback.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.NameCallback#setName(String) public void
     * javax.security.auth.callback.NameCallback.setName(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.NameCallback#setName(String) public void
     * javax.security.auth.callback.NameCallback.setName(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.NameCallback#setName(String) public void
     *      javax.security.auth.callback.NameCallback.setName(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.NameCallback#getPrompt() public java.lang.String
     * javax.security.auth.callback.NameCallback.getPrompt()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.NameCallback#getPrompt() public java.lang.String
     * javax.security.auth.callback.NameCallback.getPrompt()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.NameCallback#getPrompt() public java.lang.String
     *      javax.security.auth.callback.NameCallback.getPrompt() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrompt()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.NameCallback#getDefaultName() public java.lang.String
     * javax.security.auth.callback.NameCallback.getDefaultName()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.NameCallback#getDefaultName() public java.lang.String
     * javax.security.auth.callback.NameCallback.getDefaultName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.NameCallback#getDefaultName() public java.lang.String
     *      javax.security.auth.callback.NameCallback.getDefaultName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
