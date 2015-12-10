package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataHandlerClassTest
implements org.j8unit.repository.javax.activation.DataHandlerClassTests<javax.activation.DataHandler> {

    @Override
    public Class<javax.activation.DataHandler> createNewSUT() {
        return javax.activation.DataHandler.class;
    }

}
