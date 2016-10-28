package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.URIDereferencer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URIDereferencerClassTest
implements org.j8unit.repository.javax.xml.crypto.URIDereferencerClassTests<URIDereferencer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.URIDereferencer]

    @Override
    public Class<URIDereferencer> createNewSUT() {
        return URIDereferencer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.URIDereferencer]

}
