package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.AttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.AttributeSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.AttributeSetClassTests<AttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.AttributeSet]

    @Override
    public Class<AttributeSet> createNewSUT() {
        return AttributeSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.AttributeSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.AttributeSet]

}
