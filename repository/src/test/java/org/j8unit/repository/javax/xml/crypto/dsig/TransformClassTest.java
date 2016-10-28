package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Transform;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.TransformClassTests<Transform> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.Transform]

    @Override
    public Class<Transform> createNewSUT() {
        return Transform.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.Transform]

}
