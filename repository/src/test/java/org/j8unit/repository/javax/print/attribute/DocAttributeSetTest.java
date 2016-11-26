package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.DocAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocAttributeSet} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.DocAttributeSetTests}).
 */
@RunWith(J8Unit4.class)
public class DocAttributeSetTest
implements DocAttributeSetTests<DocAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.DocAttributeSet]

    @Override
    public DocAttributeSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.DocAttributeSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.DocAttributeSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.DocAttributeSet]

}
