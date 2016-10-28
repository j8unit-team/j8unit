package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.CodeSets;

@RunWith(J8Unit4.class)
public class CodeSetsClassTest
implements org.j8unit.repository.org.omg.IOP.CodeSetsClassTests<CodeSets> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.CodeSets]

    @Override
    public Class<CodeSets> createNewSUT() {
        return CodeSets.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.CodeSets]

}
