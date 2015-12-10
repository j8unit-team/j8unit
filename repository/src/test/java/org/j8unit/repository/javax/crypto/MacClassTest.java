package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MacClassTest
implements org.j8unit.repository.javax.crypto.MacClassTests<javax.crypto.Mac> {

    @Override
    public Class<javax.crypto.Mac> createNewSUT() {
        return javax.crypto.Mac.class;
    }

}
