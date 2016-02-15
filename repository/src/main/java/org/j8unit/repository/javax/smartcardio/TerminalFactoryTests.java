package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.smartcardio.TerminalFactory class javax.smartcardio.TerminalFactory}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link TerminalFactoryClassTests}.
 * </p>
 *
 * @see javax.smartcardio.TerminalFactory class javax.smartcardio.TerminalFactory (the hereby targeted class-under-test
 *      class)
 * @see TerminalFactoryClassTests TerminalFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TerminalFactoryTests<SUT extends javax.smartcardio.TerminalFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.smartcardio.TerminalFactory#terminals() public javax.smartcardio.CardTerminals
     * javax.smartcardio.TerminalFactory.terminals()}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.TerminalFactory#terminals() public javax.smartcardio.CardTerminals
     * javax.smartcardio.TerminalFactory.terminals()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.TerminalFactory#terminals() public javax.smartcardio.CardTerminals
     *      javax.smartcardio.TerminalFactory.terminals() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_terminals()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.TerminalFactory#getProvider() public java.security.Provider
     * javax.smartcardio.TerminalFactory.getProvider()}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.TerminalFactory#getProvider() public java.security.Provider
     * javax.smartcardio.TerminalFactory.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.TerminalFactory#getProvider() public java.security.Provider
     *      javax.smartcardio.TerminalFactory.getProvider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.TerminalFactory#toString() public java.lang.String
     * javax.smartcardio.TerminalFactory.toString()}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.TerminalFactory#toString() public java.lang.String
     * javax.smartcardio.TerminalFactory.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.TerminalFactory#toString() public java.lang.String
     *      javax.smartcardio.TerminalFactory.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.TerminalFactory#getType() public java.lang.String
     * javax.smartcardio.TerminalFactory.getType()}.
     *
     * <p>
     * Test method for {@link javax.smartcardio.TerminalFactory#getType() public java.lang.String
     * javax.smartcardio.TerminalFactory.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.smartcardio.TerminalFactory#getType() public java.lang.String
     *      javax.smartcardio.TerminalFactory.getType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
