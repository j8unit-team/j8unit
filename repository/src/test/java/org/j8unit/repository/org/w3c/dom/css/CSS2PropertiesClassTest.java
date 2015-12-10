package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CSS2PropertiesClassTest
implements org.j8unit.repository.org.w3c.dom.css.CSS2PropertiesClassTests<org.w3c.dom.css.CSS2Properties> {

    @Override
    public Class<org.w3c.dom.css.CSS2Properties> createNewSUT() {
        return org.w3c.dom.css.CSS2Properties.class;
    }

}
