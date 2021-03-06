package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.Sasl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Sasl} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.security.sasl.SaslTests}).
 */
@RunWith(J8Unit4.class)
public class SaslTest
implements SaslTests<Sasl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.Sasl]

    @Override
    public Sasl createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.sasl.Sasl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.sasl.Sasl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.sasl.Sasl]

}
