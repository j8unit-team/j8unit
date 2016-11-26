package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardNotPresentException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CardNotPresentException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.CardNotPresentExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class CardNotPresentExceptionClassTest
implements CardNotPresentExceptionClassTests<CardNotPresentException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.CardNotPresentException]

    @Override
    public Class<CardNotPresentException> createNewSUT() {
        return CardNotPresentException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.smartcardio.CardNotPresentException#CardNotPresentException(String) public
     * javax.smartcardio.CardNotPresentException(java.lang.String)}.
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
    public void create_CardNotPresentException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CardNotPresentException sut = null; // = new CardNotPresentException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.smartcardio.CardNotPresentException#CardNotPresentException(Throwable) public
     * javax.smartcardio.CardNotPresentException(java.lang.Throwable)}.
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
    public void create_CardNotPresentException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CardNotPresentException sut = null; // = new CardNotPresentException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.smartcardio.CardNotPresentException#CardNotPresentException(String, Throwable) public
     * javax.smartcardio.CardNotPresentException(java.lang.String,java.lang.Throwable)}.
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
    public void create_CardNotPresentException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CardNotPresentException sut = null; // = new CardNotPresentException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.CardNotPresentException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.CardNotPresentException]

}
