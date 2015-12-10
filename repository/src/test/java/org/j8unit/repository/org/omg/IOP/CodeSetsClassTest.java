package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodeSetsClassTest
implements org.j8unit.repository.org.omg.IOP.CodeSetsClassTests<org.omg.IOP.CodeSets> {

    @Override
    public Class<org.omg.IOP.CodeSets> createNewSUT() {
        return org.omg.IOP.CodeSets.class;
    }

}
