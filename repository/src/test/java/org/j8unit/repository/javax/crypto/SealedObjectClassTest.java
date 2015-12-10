package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SealedObjectClassTest
implements org.j8unit.repository.javax.crypto.SealedObjectClassTests<javax.crypto.SealedObject> {

    @Override
    public Class<javax.crypto.SealedObject> createNewSUT() {
        return javax.crypto.SealedObject.class;
    }

}
