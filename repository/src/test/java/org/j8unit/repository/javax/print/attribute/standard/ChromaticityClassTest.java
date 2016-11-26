package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Chromaticity;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Chromaticity} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.ChromaticityClassTests}).
 */
@RunWith(J8Unit4.class)
public class ChromaticityClassTest
implements ChromaticityClassTests<Chromaticity> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Chromaticity]

    @Override
    public Class<Chromaticity> createNewSUT() {
        return Chromaticity.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.Chromaticity]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Chromaticity]

}
