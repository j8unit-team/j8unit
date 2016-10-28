package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.DomHandler;
import javax.xml.transform.Result;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DomHandlerTest<ElementT, ResultT extends Result>
implements org.j8unit.repository.javax.xml.bind.annotation.DomHandlerTests<DomHandler<ElementT, ResultT>, ElementT, ResultT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.DomHandler]

    @Override
    public DomHandler<ElementT, ResultT> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.DomHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.DomHandler]

}
