package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.TemplatesHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TemplatesHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.sax.TemplatesHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TemplatesHandlerClassTest
implements TemplatesHandlerClassTests<TemplatesHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.sax.TemplatesHandler]

    @Override
    public Class<TemplatesHandler> createNewSUT() {
        return TemplatesHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.sax.TemplatesHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.sax.TemplatesHandler]

}
