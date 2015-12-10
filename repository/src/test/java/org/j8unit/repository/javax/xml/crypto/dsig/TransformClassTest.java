package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.TransformClassTests<javax.xml.crypto.dsig.Transform> {

    @Override
    public Class<javax.xml.crypto.dsig.Transform> createNewSUT() {
        return javax.xml.crypto.dsig.Transform.class;
    }

}
