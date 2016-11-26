package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Name;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Name} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.xml.soap.NameClassTests}).
 */
@RunWith(J8Unit4.class)
public class NameClassTest
implements NameClassTests<Name> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.Name]

    @Override
    public Class<Name> createNewSUT() {
        return Name.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.Name]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.Name]

}
