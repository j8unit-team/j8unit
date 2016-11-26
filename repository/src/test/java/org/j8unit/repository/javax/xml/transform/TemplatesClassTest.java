package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Templates;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Templates} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.TemplatesClassTests}).
 */
@RunWith(J8Unit4.class)
public class TemplatesClassTest
implements TemplatesClassTests<Templates> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.Templates]

    @Override
    public Class<Templates> createNewSUT() {
        return Templates.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.Templates]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.Templates]

}
