package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.PortInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PortInfo} (by simply reusing the J8Unit
 * test interface {@link PortInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class PortInfoClassTest
implements PortInfoClassTests<PortInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.PortInfo]

    @Override
    public Class<PortInfo> createNewSUT() {
        return PortInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.handler.PortInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.PortInfo]

}
