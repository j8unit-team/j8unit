package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RetrievalMethod} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.RetrievalMethodTests}).
 */

@RunWith(J8Unit4.class)
public class RetrievalMethodTest
implements RetrievalMethodTests<RetrievalMethod> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.keyinfo.RetrievalMethod]

    @Override
    public RetrievalMethod createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.keyinfo.RetrievalMethod], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.keyinfo.RetrievalMethod]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.keyinfo.RetrievalMethod]

}
