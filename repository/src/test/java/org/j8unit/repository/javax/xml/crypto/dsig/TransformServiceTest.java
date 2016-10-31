package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.TransformService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformServiceTest
implements org.j8unit.repository.javax.xml.crypto.dsig.TransformServiceTests<TransformService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.TransformService]

    @Override
    public TransformService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.TransformService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.TransformService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.TransformService]

}
