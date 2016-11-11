package org.j8unit.repository.java.util.zip;

import java.util.zip.DeflaterOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DeflaterOutputStream} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.zip.DeflaterOutputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class DeflaterOutputStreamTest
implements DeflaterOutputStreamTests<DeflaterOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.DeflaterOutputStream]

    @Override
    public DeflaterOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.DeflaterOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.DeflaterOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.DeflaterOutputStream]

}
