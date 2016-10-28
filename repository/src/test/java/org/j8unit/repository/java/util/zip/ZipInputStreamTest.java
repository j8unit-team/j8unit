package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipInputStreamTest
implements org.j8unit.repository.java.util.zip.ZipInputStreamTests<ZipInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.ZipInputStream]

    @Override
    public ZipInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.ZipInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.ZipInputStream]

}
