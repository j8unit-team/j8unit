package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SNIMatcher;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SNIMatcherTest
implements org.j8unit.repository.javax.net.ssl.SNIMatcherTests<SNIMatcher> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SNIMatcher]

    @Override
    public SNIMatcher createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SNIMatcher], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SNIMatcher]

}
