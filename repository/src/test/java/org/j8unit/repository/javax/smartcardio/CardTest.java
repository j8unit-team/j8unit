package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.Card;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Card} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.smartcardio.CardTests}).
 */

@RunWith(J8Unit4.class)
public class CardTest
implements CardTests<Card> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.Card]

    @Override
    public Card createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.smartcardio.Card], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.Card]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.Card]

}
