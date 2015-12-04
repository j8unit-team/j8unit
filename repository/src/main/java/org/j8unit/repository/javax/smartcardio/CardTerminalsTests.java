package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.smartcardio.CardTerminals class javax.smartcardio.CardTerminals}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.smartcardio.CardTerminalsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CardTerminalsTests<SUT extends javax.smartcardio.CardTerminals>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#list(javax.smartcardio.CardTerminals.State) public
     * abstract java.util.List javax.smartcardio.CardTerminals.list(javax.smartcardio.CardTerminals$State) throws
     * javax.smartcardio.CardException}.
     * </p>
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
     * javax.smartcardio.CardTerminals.list() throws javax.smartcardio.CardException}.
     * </p>
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
     * Test method for {@link javax.smartcardio.CardTerminals#getTerminal(java.lang.String) public
     * javax.smartcardio.CardTerminal javax.smartcardio.CardTerminals.getTerminal(java.lang.String)}.
     * </p>
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
     * </p>
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
     * </p>
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
     * Test class for {@link javax.smartcardio.CardTerminals$State class javax.smartcardio.CardTerminals$State},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.smartcardio.CardTerminalsClassTests.StateClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface StateTests<SUT extends javax.smartcardio.CardTerminals.State>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.smartcardio.CardTerminals.State> {

    }

}
