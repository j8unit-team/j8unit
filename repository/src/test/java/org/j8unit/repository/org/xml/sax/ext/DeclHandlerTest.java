package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.ext.DeclHandler;

@RunWith(J8Unit4.class)
public class DeclHandlerTest
implements org.j8unit.repository.org.xml.sax.ext.DeclHandlerTests<DeclHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.DeclHandler]

    @Override
    public DeclHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.ext.DeclHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.DeclHandler]

}
