package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.callback.ChoiceCallback class
 * javax.security.auth.callback.ChoiceCallback}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ChoiceCallbackClassTests}.
 * </p>
 *
 * @see javax.security.auth.callback.ChoiceCallback class javax.security.auth.callback.ChoiceCallback (the hereby
 *      targeted class-under-test class)
 * @see ChoiceCallbackClassTests ChoiceCallbackClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ChoiceCallbackTests<SUT extends javax.security.auth.callback.ChoiceCallback>
extends CallbackTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#getSelectedIndexes() public int[]
     * javax.security.auth.callback.ChoiceCallback.getSelectedIndexes()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#getSelectedIndexes() public int[]
     * javax.security.auth.callback.ChoiceCallback.getSelectedIndexes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.ChoiceCallback#getSelectedIndexes() public int[]
     *      javax.security.auth.callback.ChoiceCallback.getSelectedIndexes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedIndexes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#allowMultipleSelections() public boolean
     * javax.security.auth.callback.ChoiceCallback.allowMultipleSelections()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#allowMultipleSelections() public boolean
     * javax.security.auth.callback.ChoiceCallback.allowMultipleSelections()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.ChoiceCallback#allowMultipleSelections() public boolean
     *      javax.security.auth.callback.ChoiceCallback.allowMultipleSelections() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_allowMultipleSelections()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#getChoices() public java.lang.String[]
     * javax.security.auth.callback.ChoiceCallback.getChoices()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#getChoices() public java.lang.String[]
     * javax.security.auth.callback.ChoiceCallback.getChoices()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.ChoiceCallback#getChoices() public java.lang.String[]
     *      javax.security.auth.callback.ChoiceCallback.getChoices() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChoices()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#setSelectedIndexes(int[]) public void
     * javax.security.auth.callback.ChoiceCallback.setSelectedIndexes(int[])}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#setSelectedIndexes(int[]) public void
     * javax.security.auth.callback.ChoiceCallback.setSelectedIndexes(int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.ChoiceCallback#setSelectedIndexes(int[]) public void
     *      javax.security.auth.callback.ChoiceCallback.setSelectedIndexes(int[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectedIndexes_intArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#getDefaultChoice() public int
     * javax.security.auth.callback.ChoiceCallback.getDefaultChoice()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#getDefaultChoice() public int
     * javax.security.auth.callback.ChoiceCallback.getDefaultChoice()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.ChoiceCallback#getDefaultChoice() public int
     *      javax.security.auth.callback.ChoiceCallback.getDefaultChoice() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultChoice()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#setSelectedIndex(int) public void
     * javax.security.auth.callback.ChoiceCallback.setSelectedIndex(int)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#setSelectedIndex(int) public void
     * javax.security.auth.callback.ChoiceCallback.setSelectedIndex(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.ChoiceCallback#setSelectedIndex(int) public void
     *      javax.security.auth.callback.ChoiceCallback.setSelectedIndex(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectedIndex_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#getPrompt() public java.lang.String
     * javax.security.auth.callback.ChoiceCallback.getPrompt()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.ChoiceCallback#getPrompt() public java.lang.String
     * javax.security.auth.callback.ChoiceCallback.getPrompt()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.ChoiceCallback#getPrompt() public java.lang.String
     *      javax.security.auth.callback.ChoiceCallback.getPrompt() (the hereby targeted method-under-test)
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

}
