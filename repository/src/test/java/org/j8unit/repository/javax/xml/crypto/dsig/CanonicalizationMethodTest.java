package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CanonicalizationMethod} (by simply
 * reusing the J8Unit test interface {@link CanonicalizationMethodTests}).
 */

@RunWith(J8Unit4.class)
public class CanonicalizationMethodTest
implements CanonicalizationMethodTests<CanonicalizationMethod> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.CanonicalizationMethod]

    @Override
    public CanonicalizationMethod createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.CanonicalizationMethod], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.CanonicalizationMethod]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.CanonicalizationMethod]

}
