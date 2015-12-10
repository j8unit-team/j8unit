package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HMACParameterSpecClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.spec.HMACParameterSpecClassTests<javax.xml.crypto.dsig.spec.HMACParameterSpec> {

    @Override
    public Class<javax.xml.crypto.dsig.spec.HMACParameterSpec> createNewSUT() {
        return javax.xml.crypto.dsig.spec.HMACParameterSpec.class;
    }

}
