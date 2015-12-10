package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseAPDUClassTest
implements org.j8unit.repository.javax.smartcardio.ResponseAPDUClassTests<javax.smartcardio.ResponseAPDU> {

    @Override
    public Class<javax.smartcardio.ResponseAPDU> createNewSUT() {
        return javax.smartcardio.ResponseAPDU.class;
    }

}
