package org.j8unit.repository.javax.management.loading;

import javax.management.loading.PrivateMLet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivateMLetTest
implements org.j8unit.repository.javax.management.loading.PrivateMLetTests<PrivateMLet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.PrivateMLet]

    @Override
    public PrivateMLet createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.loading.PrivateMLet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.loading.PrivateMLet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.loading.PrivateMLet]

}
