package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.BindingType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTypeClassTest
implements org.j8unit.repository.javax.xml.ws.BindingTypeClassTests<BindingType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.BindingType]

    @Override
    public Class<BindingType> createNewSUT() {
        return BindingType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.BindingType]

}
