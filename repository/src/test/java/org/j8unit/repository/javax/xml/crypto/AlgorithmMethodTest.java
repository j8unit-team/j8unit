package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.AlgorithmMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AlgorithmMethod} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.AlgorithmMethodTests}).
 */

@RunWith(J8Unit4.class)
public class AlgorithmMethodTest
implements AlgorithmMethodTests<AlgorithmMethod> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.AlgorithmMethod]

    @Override
    public AlgorithmMethod createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.AlgorithmMethod], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.AlgorithmMethod]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.AlgorithmMethod]

}
