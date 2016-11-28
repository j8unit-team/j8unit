package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Templates;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Templates} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.TemplatesTests}).
 */
@RunWith(J8Unit4.class)
public class TemplatesTest
implements TemplatesTests<Templates> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.Templates]

    @Override
    public Templates createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.Templates], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.Templates]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.Templates]

}
