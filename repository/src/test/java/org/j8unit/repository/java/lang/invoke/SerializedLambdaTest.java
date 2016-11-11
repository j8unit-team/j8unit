package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.SerializedLambda;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SerializedLambda} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.invoke.SerializedLambdaTests}).
 */

@RunWith(J8Unit4.class)
public class SerializedLambdaTest
implements SerializedLambdaTests<SerializedLambda> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.SerializedLambda]

    @Override
    public SerializedLambda createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.SerializedLambda], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.SerializedLambda]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.SerializedLambda]

}
