package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipOutputStreamTest
implements org.j8unit.repository.java.util.zip.ZipOutputStreamTests<ZipOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.ZipOutputStream]

    @Override
    public ZipOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.ZipOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.ZipOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.ZipOutputStream]

}
