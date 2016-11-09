package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CardException} (by simply reusing the
 * J8Unit test interface {@link CardExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class CardExceptionTest
implements CardExceptionTests<CardException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardException]

    @Override
    public CardException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.smartcardio.CardException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.CardException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.CardException]

}
