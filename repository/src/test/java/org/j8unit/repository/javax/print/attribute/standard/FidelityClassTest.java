package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Fidelity;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Fidelity} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.print.attribute.standard.FidelityClassTests}).
 */
@RunWith(J8Unit4.class)
public class FidelityClassTest
implements FidelityClassTests<Fidelity> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Fidelity]

    @Override
    public Class<Fidelity> createNewSUT() {
        return Fidelity.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.Fidelity]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Fidelity]

}
