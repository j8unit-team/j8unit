package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ATRClassTest
implements org.j8unit.repository.javax.smartcardio.ATRClassTests<javax.smartcardio.ATR> {

    @Override
    public Class<javax.smartcardio.ATR> createNewSUT() {
        return javax.smartcardio.ATR.class;
    }

}
