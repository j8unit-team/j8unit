package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.CodeSets;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CodeSets} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.IOP.CodeSetsClassTests}).
 */

@RunWith(J8Unit4.class)
public class CodeSetsClassTest
implements CodeSetsClassTests<CodeSets> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.CodeSets]

    @Override
    public Class<CodeSets> createNewSUT() {
        return CodeSets.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.CodeSets]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.CodeSets]

}
