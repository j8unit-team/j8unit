package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.DTD;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DTD} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.xml.stream.events.DTDClassTests}).
 */

@RunWith(J8Unit4.class)
public class DTDClassTest
implements org.j8unit.repository.javax.xml.stream.events.DTDClassTests<DTD> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.DTD]

    @Override
    public Class<DTD> createNewSUT() {
        return DTD.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.DTD]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.DTD]

}
