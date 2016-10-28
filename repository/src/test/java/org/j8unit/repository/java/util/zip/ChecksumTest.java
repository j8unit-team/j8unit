package org.j8unit.repository.java.util.zip;

import java.util.zip.Checksum;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChecksumTest
implements org.j8unit.repository.java.util.zip.ChecksumTests<Checksum> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.Checksum]

    @Override
    public Checksum createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.zip.Checksum], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.Checksum]

}
