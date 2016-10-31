package org.j8unit.repository.javax.activation;

import javax.activation.DataHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataHandlerTest
implements org.j8unit.repository.javax.activation.DataHandlerTests<DataHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.activation.DataHandler]

    @Override
    public DataHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.activation.DataHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.activation.DataHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.activation.DataHandler]

}
