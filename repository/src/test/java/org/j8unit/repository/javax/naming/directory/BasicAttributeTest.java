package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.BasicAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicAttributeTest
implements org.j8unit.repository.javax.naming.directory.BasicAttributeTests<BasicAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.BasicAttribute]

    @Override
    public BasicAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.directory.BasicAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.directory.BasicAttribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.directory.BasicAttribute]

}
