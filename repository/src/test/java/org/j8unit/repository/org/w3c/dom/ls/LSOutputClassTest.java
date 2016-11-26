package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSOutput;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSOutput} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSOutputClassTests}).
 */
@RunWith(J8Unit4.class)
public class LSOutputClassTest
implements LSOutputClassTests<LSOutput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSOutput]

    @Override
    public Class<LSOutput> createNewSUT() {
        return LSOutput.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSOutput]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSOutput]

}
