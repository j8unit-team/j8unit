package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.DomHandler;
import javax.xml.transform.Result;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DomHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.DomHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class DomHandlerTest<ElementT, ResultT extends Result>
implements DomHandlerTests<DomHandler<ElementT, ResultT>, ElementT, ResultT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.DomHandler]

    @Override
    public DomHandler<ElementT, ResultT> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.DomHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.DomHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.DomHandler]

}
