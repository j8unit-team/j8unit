package org.j8unit.repository.java.io;

import java.io.DataOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataOutputStreamTest
implements org.j8unit.repository.java.io.DataOutputStreamTests<DataOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.DataOutputStream]

    @Override
    public DataOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.DataOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.DataOutputStream]

}
