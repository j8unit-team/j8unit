package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MacTest
implements org.j8unit.repository.javax.crypto.MacTests<javax.crypto.Mac> {

    @Override
    public javax.crypto.Mac createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.crypto.Mac] available.");
    }

}
