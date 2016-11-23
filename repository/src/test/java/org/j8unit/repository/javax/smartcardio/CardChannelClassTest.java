package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CardChannel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.CardChannelClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class CardChannelClassTest
implements CardChannelClassTests<CardChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.CardChannel]

    @Override
    public Class<CardChannel> createNewSUT() {
        return CardChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.CardChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.CardChannel]

}
