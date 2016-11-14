package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyName} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyNameTests}).
 */

@RunWith(J8Unit4.class)
public class KeyNameTest
implements KeyNameTests<KeyName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.keyinfo.KeyName]

    @Override
    public KeyName createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.keyinfo.KeyName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.keyinfo.KeyName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.keyinfo.KeyName]

}
