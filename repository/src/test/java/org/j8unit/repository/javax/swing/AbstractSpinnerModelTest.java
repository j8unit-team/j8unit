package org.j8unit.repository.javax.swing;

import javax.swing.AbstractSpinnerModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractSpinnerModelTest
implements org.j8unit.repository.javax.swing.AbstractSpinnerModelTests<AbstractSpinnerModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.AbstractSpinnerModel]

    @Override
    public AbstractSpinnerModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.AbstractSpinnerModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.AbstractSpinnerModel]

}
