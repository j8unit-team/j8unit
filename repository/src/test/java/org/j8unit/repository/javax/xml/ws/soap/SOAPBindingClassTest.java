package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.SOAPBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPBinding} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.soap.SOAPBindingClassTests}).
 */
@RunWith(J8Unit4.class)
public class SOAPBindingClassTest
implements SOAPBindingClassTests<SOAPBinding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.soap.SOAPBinding]

    @Override
    public Class<SOAPBinding> createNewSUT() {
        return SOAPBinding.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.soap.SOAPBinding]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.soap.SOAPBinding]

}
