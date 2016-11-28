package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.KeyStoreBuilderParameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyStoreBuilderParameters} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.KeyStoreBuilderParametersTests}).
 */
@RunWith(J8Unit4.class)
public class KeyStoreBuilderParametersTest
implements KeyStoreBuilderParametersTests<KeyStoreBuilderParameters> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.KeyStoreBuilderParameters]

    @Override
    public KeyStoreBuilderParameters createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.KeyStoreBuilderParameters], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.KeyStoreBuilderParameters]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.KeyStoreBuilderParameters]

}
