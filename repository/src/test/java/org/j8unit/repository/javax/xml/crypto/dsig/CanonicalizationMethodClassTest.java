package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CanonicalizationMethodClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.CanonicalizationMethodClassTests<javax.xml.crypto.dsig.CanonicalizationMethod> {

    @Override
    public Class<javax.xml.crypto.dsig.CanonicalizationMethod> createNewSUT() {
        return javax.xml.crypto.dsig.CanonicalizationMethod.class;
    }

}
