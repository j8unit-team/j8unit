package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attribute} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.naming.directory.AttributeClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeClassTest
implements org.j8unit.repository.javax.naming.directory.AttributeClassTests<Attribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.Attribute]

    @Override
    public Class<Attribute> createNewSUT() {
        return Attribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.Attribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.Attribute]

}
