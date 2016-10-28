package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Reference;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.ReferenceClassTests<Reference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.Reference]

    @Override
    public Class<Reference> createNewSUT() {
        return Reference.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.Reference]

}
