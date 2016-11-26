package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSInput;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSInput} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSInputClassTests}).
 */
@RunWith(J8Unit4.class)
public class LSInputClassTest
implements LSInputClassTests<LSInput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSInput]

    @Override
    public Class<LSInput> createNewSUT() {
        return LSInput.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSInput]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSInput]

}
