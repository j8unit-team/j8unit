package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.MarshalException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MarshalException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.MarshalExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class MarshalExceptionTest
implements org.j8unit.repository.javax.xml.bind.MarshalExceptionTests<MarshalException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.MarshalException]

    @Override
    public MarshalException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.bind.MarshalException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.MarshalException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.MarshalException]

}
