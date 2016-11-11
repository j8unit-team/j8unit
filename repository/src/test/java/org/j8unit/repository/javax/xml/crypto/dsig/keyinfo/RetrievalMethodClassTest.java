package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RetrievalMethod} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.RetrievalMethodClassTests}).
 */

@RunWith(J8Unit4.class)
public class RetrievalMethodClassTest
implements RetrievalMethodClassTests<RetrievalMethod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.RetrievalMethod]

    @Override
    public Class<RetrievalMethod> createNewSUT() {
        return RetrievalMethod.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.RetrievalMethod]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.RetrievalMethod]

}
