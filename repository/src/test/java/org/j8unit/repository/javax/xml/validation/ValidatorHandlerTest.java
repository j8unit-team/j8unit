package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.ValidatorHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidatorHandlerTest
implements org.j8unit.repository.javax.xml.validation.ValidatorHandlerTests<ValidatorHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.ValidatorHandler]

    @Override
    public ValidatorHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.validation.ValidatorHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.validation.ValidatorHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.validation.ValidatorHandler]

}
