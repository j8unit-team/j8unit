package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Reference;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Reference} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.ReferenceClassTests}).
 */
@RunWith(J8Unit4.class)
public class ReferenceClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.ReferenceClassTests<Reference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.Reference]

    @Override
    public Class<Reference> createNewSUT() {
        return Reference.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.Reference]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.Reference]

}
