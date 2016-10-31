package org.j8unit.repository.javax.crypto;

import javax.crypto.SecretKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeyTest
implements org.j8unit.repository.javax.crypto.SecretKeyTests<SecretKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.SecretKey]

    @Override
    public SecretKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.SecretKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.SecretKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.SecretKey]

}
