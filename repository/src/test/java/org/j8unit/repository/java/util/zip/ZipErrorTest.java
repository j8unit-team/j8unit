package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipError;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipErrorTest
implements org.j8unit.repository.java.util.zip.ZipErrorTests<ZipError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.ZipError]

    @Override
    public ZipError createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.ZipError], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.ZipError]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.ZipError]

}
