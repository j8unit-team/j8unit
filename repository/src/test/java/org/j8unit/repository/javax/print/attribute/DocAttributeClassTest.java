package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.DocAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocAttribute} (by simply reusing the
 * J8Unit test interface {@link DocAttributeClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocAttributeClassTest
implements DocAttributeClassTests<DocAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.DocAttribute]

    @Override
    public Class<DocAttribute> createNewSUT() {
        return DocAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.DocAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.DocAttribute]

}
