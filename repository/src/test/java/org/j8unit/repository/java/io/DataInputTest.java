package org.j8unit.repository.java.io;

import java.io.DataInput;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataInputTest
implements org.j8unit.repository.java.io.DataInputTests<DataInput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.DataInput]

    @Override
    public DataInput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.DataInput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.DataInput]

}
