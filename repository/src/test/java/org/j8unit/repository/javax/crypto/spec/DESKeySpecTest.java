package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.DESKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DESKeySpecTest
implements org.j8unit.repository.javax.crypto.spec.DESKeySpecTests<DESKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.DESKeySpec]

    @Override
    public DESKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.spec.DESKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.DESKeySpec]

}
