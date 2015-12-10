package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AEADBadTagExceptionTest
implements org.j8unit.repository.javax.crypto.AEADBadTagExceptionTests<javax.crypto.AEADBadTagException> {

    @Override
    public javax.crypto.AEADBadTagException createNewSUT() {
        return new javax.crypto.AEADBadTagException();
    }

}
