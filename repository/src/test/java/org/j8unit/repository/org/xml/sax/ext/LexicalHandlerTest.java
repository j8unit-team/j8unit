package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.ext.LexicalHandler;

@RunWith(J8Unit4.class)
public class LexicalHandlerTest
implements org.j8unit.repository.org.xml.sax.ext.LexicalHandlerTests<LexicalHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.LexicalHandler]

    @Override
    public LexicalHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.ext.LexicalHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ext.LexicalHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ext.LexicalHandler]

}
