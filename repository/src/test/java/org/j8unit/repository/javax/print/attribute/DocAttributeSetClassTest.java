package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.DocAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocAttributeSet} (by simply reusing the
 * J8Unit test interface {@link DocAttributeSetClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocAttributeSetClassTest
implements DocAttributeSetClassTests<DocAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.DocAttributeSet]

    @Override
    public Class<DocAttributeSet> createNewSUT() {
        return DocAttributeSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.DocAttributeSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.DocAttributeSet]

}
