package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLResolverTest
implements org.j8unit.repository.javax.xml.stream.XMLResolverTests<XMLResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLResolver]

    @Override
    public XMLResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLResolver]

}
