package org.j8unit.repository.java.util.logging;

import java.util.logging.Handler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerClassTest
implements org.j8unit.repository.java.util.logging.HandlerClassTests<Handler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.Handler]

    @Override
    public Class<Handler> createNewSUT() {
        return Handler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.Handler]

}
