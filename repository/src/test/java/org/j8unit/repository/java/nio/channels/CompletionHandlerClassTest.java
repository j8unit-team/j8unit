package org.j8unit.repository.java.nio.channels;

import java.nio.channels.CompletionHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompletionHandler} (by simply reusing the
 * J8Unit test interface {@link CompletionHandlerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CompletionHandlerClassTest
implements CompletionHandlerClassTests<CompletionHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.CompletionHandler]

    @Override
    public Class<CompletionHandler> createNewSUT() {
        return CompletionHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.CompletionHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.CompletionHandler]

}
