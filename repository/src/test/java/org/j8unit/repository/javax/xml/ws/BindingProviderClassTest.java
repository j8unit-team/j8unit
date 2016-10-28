package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.BindingProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingProviderClassTest
implements org.j8unit.repository.javax.xml.ws.BindingProviderClassTests<BindingProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.BindingProvider]

    @Override
    public Class<BindingProvider> createNewSUT() {
        return BindingProvider.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.BindingProvider]

}
