package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.DatatypeConverterInterface;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DatatypeConverterInterface} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.DatatypeConverterInterfaceClassTests}).
 */

@RunWith(J8Unit4.class)
public class DatatypeConverterInterfaceClassTest
implements DatatypeConverterInterfaceClassTests<DatatypeConverterInterface> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.DatatypeConverterInterface]

    @Override
    public Class<DatatypeConverterInterface> createNewSUT() {
        return DatatypeConverterInterface.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.DatatypeConverterInterface]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.DatatypeConverterInterface]

}
