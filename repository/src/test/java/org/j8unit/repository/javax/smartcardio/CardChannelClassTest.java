package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardChannelClassTest
implements org.j8unit.repository.javax.smartcardio.CardChannelClassTests<CardChannel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.CardChannel]

    @Override
    public Class<CardChannel> createNewSUT() {
        return CardChannel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.CardChannel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.CardChannel]

}
