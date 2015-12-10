package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SealedObjectTest
implements org.j8unit.repository.javax.crypto.SealedObjectTests<javax.crypto.SealedObject> {

    @Override
    public javax.crypto.SealedObject createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.crypto.SealedObject] available.");
    }

}
