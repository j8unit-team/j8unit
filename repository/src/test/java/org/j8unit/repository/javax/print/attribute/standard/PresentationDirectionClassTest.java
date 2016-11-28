package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PresentationDirection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PresentationDirection} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.standard.PresentationDirectionClassTests}).
 */
@RunWith(J8Unit4.class)
public class PresentationDirectionClassTest
implements PresentationDirectionClassTests<PresentationDirection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PresentationDirection]

    @Override
    public Class<PresentationDirection> createNewSUT() {
        return PresentationDirection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.PresentationDirection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PresentationDirection]

}
