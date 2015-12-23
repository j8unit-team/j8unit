package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.smartcardio.CardTerminals class javax.smartcardio.CardTerminals}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.smartcardio.CardTerminalsTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.smartcardio.CardTerminalsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.smartcardio.CardTerminals
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CardTerminalsTests<SUT extends javax.smartcardio.CardTerminals>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.smartcardio.CardTerminals.State class
     * javax.smartcardio.CardTerminals$State}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.javax.smartcardio.CardTerminalsTests.StateTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.smartcardio.CardTerminalsClassTests.StateClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.smartcardio.CardTerminals.State
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StateTests<SUT extends javax.smartcardio.CardTerminals.State>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.smartcardio.CardTerminals.State> {

    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardTerminals#getTerminal(java.lang.String) public
     * javax.smartcardio.CardTerminal javax.smartcardio.CardTerminals.getTerminal(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardTerminals#getTerminal(java.lang.String)
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
     * Test method for {@link javax.smartcardio.CardTerminals#list() public java.util.List
     * javax.smartcardio.CardTerminals.list() throws javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardTerminals#list()
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
     * Test method for {@link javax.smartcardio.CardTerminals#list(javax.smartcardio.CardTerminals.State) public
     * abstract java.util.List javax.smartcardio.CardTerminals.list(javax.smartcardio.CardTerminals$State) throws
     * javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardTerminals#list(javax.smartcardio.CardTerminals.State)
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
     * Test method for {@link javax.smartcardio.CardTerminals#waitForChange() public void
     * javax.smartcardio.CardTerminals.waitForChange() throws javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardTerminals#waitForChange()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardTerminals#waitForChange(long)
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

}
