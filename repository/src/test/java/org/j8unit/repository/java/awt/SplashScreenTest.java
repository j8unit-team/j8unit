package org.j8unit.repository.java.awt;

import java.awt.SplashScreen;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SplashScreen} (by simply reusing the
 * J8Unit test interface {@link SplashScreenTests}).
 */

@RunWith(J8Unit4.class)
public class SplashScreenTest
implements SplashScreenTests<SplashScreen> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.SplashScreen]

    @Override
    public SplashScreen createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.SplashScreen], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.SplashScreen]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.SplashScreen]

}
