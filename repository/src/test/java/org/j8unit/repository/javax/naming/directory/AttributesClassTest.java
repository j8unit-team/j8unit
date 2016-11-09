package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.Attributes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attributes} (by simply reusing the J8Unit
 * test interface {@link AttributesClassTests}).
 */

@RunWith(J8Unit4.class)
public class AttributesClassTest
implements AttributesClassTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.Attributes]

    @Override
    public Class<Attributes> createNewSUT() {
        return Attributes.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.Attributes]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.Attributes]

}
