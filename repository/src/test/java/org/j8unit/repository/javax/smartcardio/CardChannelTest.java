package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardChannelTest
implements org.j8unit.repository.javax.smartcardio.CardChannelTests<CardChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardChannel]

    @Override
    public CardChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.smartcardio.CardChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardChannel]

}
