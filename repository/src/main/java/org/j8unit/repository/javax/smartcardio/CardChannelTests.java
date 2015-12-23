package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.smartcardio.CardChannel class javax.smartcardio.CardChannel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.smartcardio.CardChannelTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.smartcardio.CardChannelClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.smartcardio.CardChannel
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CardChannelTests<SUT extends javax.smartcardio.CardChannel>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardChannel#close() public abstract void
     * javax.smartcardio.CardChannel.close() throws javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardChannel#close()
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
     * Test method for {@link javax.smartcardio.CardChannel#getCard() public abstract javax.smartcardio.Card
     * javax.smartcardio.CardChannel.getCard()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardChannel#getCard()
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
     * Test method for {@link javax.smartcardio.CardChannel#getChannelNumber() public abstract int
     * javax.smartcardio.CardChannel.getChannelNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardChannel#getChannelNumber()
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

    /**
     * <p>
     * Test method for {@link javax.smartcardio.CardChannel#transmit(java.nio.ByteBuffer, java.nio.ByteBuffer) public
     * abstract int javax.smartcardio.CardChannel.transmit(java.nio.ByteBuffer,java.nio.ByteBuffer) throws
     * javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardChannel#transmit(java.nio.ByteBuffer, java.nio.ByteBuffer)
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
     * Test method for {@link javax.smartcardio.CardChannel#transmit(javax.smartcardio.CommandAPDU) public abstract
     * javax.smartcardio.ResponseAPDU javax.smartcardio.CardChannel.transmit(javax.smartcardio.CommandAPDU) throws
     * javax.smartcardio.CardException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.smartcardio.CardChannel#transmit(javax.smartcardio.CommandAPDU)
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

}
