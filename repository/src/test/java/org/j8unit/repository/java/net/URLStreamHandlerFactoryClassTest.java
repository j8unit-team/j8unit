package org.j8unit.repository.java.net;

import java.net.URLStreamHandlerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URLStreamHandlerFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.net.URLStreamHandlerFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class URLStreamHandlerFactoryClassTest
implements URLStreamHandlerFactoryClassTests<URLStreamHandlerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.URLStreamHandlerFactory]

    @Override
    public Class<URLStreamHandlerFactory> createNewSUT() {
        return URLStreamHandlerFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.URLStreamHandlerFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.URLStreamHandlerFactory]

}
