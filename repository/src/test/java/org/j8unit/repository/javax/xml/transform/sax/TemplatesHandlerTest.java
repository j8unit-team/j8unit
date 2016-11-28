package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.TemplatesHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TemplatesHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.sax.TemplatesHandlerTests}).
 */
@RunWith(J8Unit4.class)
public class TemplatesHandlerTest
implements TemplatesHandlerTests<TemplatesHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.sax.TemplatesHandler]

    @Override
    public TemplatesHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.sax.TemplatesHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.sax.TemplatesHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.sax.TemplatesHandler]

}
