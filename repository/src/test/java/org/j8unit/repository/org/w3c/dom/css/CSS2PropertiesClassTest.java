package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.CSS2Properties;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CSS2Properties} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.css.CSS2PropertiesClassTests}).
 */

@RunWith(J8Unit4.class)
public class CSS2PropertiesClassTest
implements CSS2PropertiesClassTests<CSS2Properties> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.CSS2Properties]

    @Override
    public Class<CSS2Properties> createNewSUT() {
        return CSS2Properties.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.CSS2Properties]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.CSS2Properties]

}
