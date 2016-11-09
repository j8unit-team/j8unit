package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.ColorType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ColorType} (by simply reusing the J8Unit
 * test interface {@link ColorTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class ColorTypeClassTest
implements ColorTypeClassTests<ColorType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.synth.ColorType]

    @Override
    public Class<ColorType> createNewSUT() {
        return ColorType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.synth.ColorType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.synth.ColorType]

}
