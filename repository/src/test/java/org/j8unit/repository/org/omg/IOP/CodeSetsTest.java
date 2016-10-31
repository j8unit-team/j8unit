package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.CodeSets;

@RunWith(J8Unit4.class)
public class CodeSetsTest
implements org.j8unit.repository.org.omg.IOP.CodeSetsTests<CodeSets> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.CodeSets]

    @Override
    public CodeSets createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.CodeSets], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.CodeSets]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.CodeSets]

}
