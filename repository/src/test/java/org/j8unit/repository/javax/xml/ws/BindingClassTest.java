package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Binding;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingClassTest
implements org.j8unit.repository.javax.xml.ws.BindingClassTests<Binding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Binding]

    @Override
    public Class<Binding> createNewSUT() {
        return Binding.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.Binding]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Binding]

}
