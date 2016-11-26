package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.URIDereferencer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URIDereferencer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.URIDereferencerClassTests}).
 */
@RunWith(J8Unit4.class)
public class URIDereferencerClassTest
implements URIDereferencerClassTests<URIDereferencer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.URIDereferencer]

    @Override
    public Class<URIDereferencer> createNewSUT() {
        return URIDereferencer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.URIDereferencer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.URIDereferencer]

}
