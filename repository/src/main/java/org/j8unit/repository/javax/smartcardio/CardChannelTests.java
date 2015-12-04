package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.smartcardio.CardChannel class javax.smartcardio.CardChannel}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.smartcardio.CardChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CardChannelTests<SUT extends javax.smartcardio.CardChannel>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardChannel#transmit(javax.smartcardio.CommandAPDU) public abstract
     * javax.smartcardio.ResponseAPDU javax.smartcardio.CardChannel.transmit(javax.smartcardio.CommandAPDU) throws
     * javax.smartcardio.CardException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transmit_CommandAPDU()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardChannel#transmit(java.nio.ByteBuffer,java.nio.ByteBuffer) public
     * abstract int javax.smartcardio.CardChannel.transmit(java.nio.ByteBuffer,java.nio.ByteBuffer) throws
     * javax.smartcardio.CardException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transmit_ByteBuffer_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardChannel#getCard() public abstract javax.smartcardio.Card
     * javax.smartcardio.CardChannel.getCard()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCard()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardChannel#close() public abstract void
     * javax.smartcardio.CardChannel.close() throws javax.smartcardio.CardException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardChannel#getChannelNumber() public abstract int
     * javax.smartcardio.CardChannel.getChannelNumber()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChannelNumber()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
