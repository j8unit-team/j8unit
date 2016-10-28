package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Reference;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceTest
implements org.j8unit.repository.javax.xml.crypto.dsig.ReferenceTests<Reference> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.Reference]

    @Override
    public Reference createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.Reference], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.Reference]

}
