package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.SignedInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignedInfoTest
implements org.j8unit.repository.javax.xml.crypto.dsig.SignedInfoTests<SignedInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.SignedInfo]

    @Override
    public SignedInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.SignedInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.SignedInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.SignedInfo]

}
