package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPBody;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPBody} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.soap.SOAPBodyClassTests}).
 */
@RunWith(J8Unit4.class)
public class SOAPBodyClassTest
implements SOAPBodyClassTests<SOAPBody> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPBody]

    @Override
    public Class<SOAPBody> createNewSUT() {
        return SOAPBody.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPBody]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPBody]

}
