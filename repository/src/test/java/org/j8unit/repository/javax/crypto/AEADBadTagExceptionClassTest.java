package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AEADBadTagExceptionClassTest
implements org.j8unit.repository.javax.crypto.AEADBadTagExceptionClassTests<javax.crypto.AEADBadTagException> {

    @Override
    public Class<javax.crypto.AEADBadTagException> createNewSUT() {
        return javax.crypto.AEADBadTagException.class;
    }

}
