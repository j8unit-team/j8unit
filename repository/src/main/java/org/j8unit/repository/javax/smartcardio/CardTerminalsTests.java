package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.smartcardio.CardTerminals class javax.smartcardio.CardTerminals}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link CardTerminalsClassTests}.
 * </p>
 *
 * @see javax.smartcardio.CardTerminals class javax.smartcardio.CardTerminals (the hereby targeted class-under-test
 *      class)
 * @see CardTerminalsClassTests CardTerminalsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CardTerminalsTests<SUT extends javax.smartcardio.CardTerminals>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#list(javax.smartcardio.CardTerminals.State) public
     * abstract java.util.List
     * <javax.smartcardio.CardTerminal> javax.smartcardio.CardTerminals.list(javax.smartcardio.CardTerminals$State)
     * throws javax.smartcardio.CardException}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#list(javax.smartcardio.CardTerminals.State) public
     * abstract java.util.List javax.smartcardio.CardTerminals.list(javax.smartcardio.CardTerminals$State) throws
     * javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.CardTerminals#list(javax.smartcardio.CardTerminals.State) public abstract java.util.List
     *      javax.smartcardio.CardTerminals.list(javax.smartcardio.CardTerminals$State) throws
     *      javax.smartcardio.CardException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_list_State()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#list() public java.util.List
     * <javax.smartcardio.CardTerminal> javax.smartcardio.CardTerminals.list() throws javax.smartcardio.CardException}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#list() public java.util.List
     * javax.smartcardio.CardTerminals.list() throws javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.CardTerminals#list() public java.util.List javax.smartcardio.CardTerminals.list() throws
     *      javax.smartcardio.CardException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_list()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#getTerminal(String) public javax.smartcardio.CardTerminal
     * javax.smartcardio.CardTerminals.getTerminal(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#getTerminal(String) public javax.smartcardio.CardTerminal
     * javax.smartcardio.CardTerminals.getTerminal(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.CardTerminals#getTerminal(String) public javax.smartcardio.CardTerminal
     *      javax.smartcardio.CardTerminals.getTerminal(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTerminal_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#waitForChange() public void
     * javax.smartcardio.CardTerminals.waitForChange() throws javax.smartcardio.CardException}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#waitForChange() public void
     * javax.smartcardio.CardTerminals.waitForChange() throws javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.CardTerminals#waitForChange() public void javax.smartcardio.CardTerminals.waitForChange()
     *      throws javax.smartcardio.CardException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_waitForChange()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#waitForChange(long) public abstract boolean
     * javax.smartcardio.CardTerminals.waitForChange(long) throws javax.smartcardio.CardException}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#waitForChange(long) public abstract boolean
     * javax.smartcardio.CardTerminals.waitForChange(long) throws javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.CardTerminals#waitForChange(long) public abstract boolean
     *      javax.smartcardio.CardTerminals.waitForChange(long) throws javax.smartcardio.CardException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_waitForChange_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.smartcardio.CardTerminals.State class
     * javax.smartcardio.CardTerminals$State}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link CardTerminalsClassTests.StateClassTests}.
     * </p>
     *
     * @see javax.smartcardio.CardTerminals.State class javax.smartcardio.CardTerminals$State (the hereby targeted
     *      class-under-test class)
     * @see CardTerminalsClassTests.StateClassTests CardTerminalsClassTests.StateClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StateTests<SUT extends javax.smartcardio.CardTerminals.State>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.smartcardio.CardTerminals.State> {

    }

}
