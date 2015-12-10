package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardChannelClassTest
implements org.j8unit.repository.javax.smartcardio.CardChannelClassTests<javax.smartcardio.CardChannel> {

    @Override
    public Class<javax.smartcardio.CardChannel> createNewSUT() {
        return javax.smartcardio.CardChannel.class;
    }

}
