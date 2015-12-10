package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardClassTest
implements org.j8unit.repository.javax.smartcardio.CardClassTests<javax.smartcardio.Card> {

    @Override
    public Class<javax.smartcardio.Card> createNewSUT() {
        return javax.smartcardio.Card.class;
    }

}
