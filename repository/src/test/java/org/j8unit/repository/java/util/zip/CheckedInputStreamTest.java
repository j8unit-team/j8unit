package org.j8unit.repository.java.util.zip;

import java.util.zip.CheckedInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CheckedInputStreamTest
implements org.j8unit.repository.java.util.zip.CheckedInputStreamTests<CheckedInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.CheckedInputStream]

    @Override
    public CheckedInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.CheckedInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.CheckedInputStream]

}
