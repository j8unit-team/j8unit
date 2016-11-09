package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CardChannel} (by simply reusing the
 * J8Unit test interface {@link CardChannelTests}).
 */

@RunWith(J8Unit4.class)
public class CardChannelTest
implements CardChannelTests<CardChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardChannel]

    @Override
    public CardChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.smartcardio.CardChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.CardChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.CardChannel]

}
