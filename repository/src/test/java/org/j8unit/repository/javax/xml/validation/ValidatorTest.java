package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.Validator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidatorTest
implements org.j8unit.repository.javax.xml.validation.ValidatorTests<Validator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.Validator]

    @Override
    public Validator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.validation.Validator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.Validator]

}
