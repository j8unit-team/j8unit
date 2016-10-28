package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.URIDereferencer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URIDereferencerTest
implements org.j8unit.repository.javax.xml.crypto.URIDereferencerTests<URIDereferencer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.URIDereferencer]

    @Override
    public URIDereferencer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.URIDereferencer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.URIDereferencer]

}
