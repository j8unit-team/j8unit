package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommandAPDUClassTest
implements org.j8unit.repository.javax.smartcardio.CommandAPDUClassTests<javax.smartcardio.CommandAPDU> {

    @Override
    public Class<javax.smartcardio.CommandAPDU> createNewSUT() {
        return javax.smartcardio.CommandAPDU.class;
    }

}
