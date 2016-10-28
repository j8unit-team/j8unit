package org.j8unit.repository.java.net;

import java.net.StandardSocketOptions;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardSocketOptionsTest
implements org.j8unit.repository.java.net.StandardSocketOptionsTests<StandardSocketOptions> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.StandardSocketOptions]

    @Override
    public StandardSocketOptions createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.StandardSocketOptions], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.StandardSocketOptions]

}
