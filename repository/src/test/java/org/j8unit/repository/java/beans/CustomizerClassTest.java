package org.j8unit.repository.java.beans;

import java.beans.Customizer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Customizer} (by simply reusing the J8Unit
 * test interface {@link CustomizerClassTests}).
 */

@RunWith(J8Unit4.class)
public class CustomizerClassTest
implements CustomizerClassTests<Customizer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.Customizer]

    @Override
    public Class<Customizer> createNewSUT() {
        return Customizer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.Customizer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.Customizer]

}
