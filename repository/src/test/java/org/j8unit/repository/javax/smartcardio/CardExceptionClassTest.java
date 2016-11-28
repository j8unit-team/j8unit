package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CardException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.CardExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class CardExceptionClassTest
implements CardExceptionClassTests<CardException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.CardException]

    @Override
    public Class<CardException> createNewSUT() {
        return CardException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.smartcardio.CardException#CardException(String) public
     * javax.smartcardio.CardException(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_CardException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CardException sut = null; // = new CardException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.smartcardio.CardException#CardException(Throwable) public
     * javax.smartcardio.CardException(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_CardException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CardException sut = null; // = new CardException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.smartcardio.CardException#CardException(String, Throwable) public
     * javax.smartcardio.CardException(java.lang.String,java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_CardException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CardException sut = null; // = new CardException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.CardException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.CardException]

}
