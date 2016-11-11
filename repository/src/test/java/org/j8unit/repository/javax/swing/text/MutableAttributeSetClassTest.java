package org.j8unit.repository.javax.swing.text;

import javax.swing.text.MutableAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MutableAttributeSet} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.MutableAttributeSetClassTests}).
 */

@RunWith(J8Unit4.class)
public class MutableAttributeSetClassTest
implements MutableAttributeSetClassTests<MutableAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.MutableAttributeSet]

    @Override
    public Class<MutableAttributeSet> createNewSUT() {
        return MutableAttributeSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.MutableAttributeSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.MutableAttributeSet]

}
