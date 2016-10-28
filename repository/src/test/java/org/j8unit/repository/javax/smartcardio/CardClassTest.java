package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.Card;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardClassTest
implements org.j8unit.repository.javax.smartcardio.CardClassTests<Card> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.Card]

    @Override
    public Class<Card> createNewSUT() {
        return Card.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.Card]

}
