package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformServiceClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.TransformServiceClassTests<javax.xml.crypto.dsig.TransformService> {

    @Override
    public Class<javax.xml.crypto.dsig.TransformService> createNewSUT() {
        return javax.xml.crypto.dsig.TransformService.class;
    }

}
