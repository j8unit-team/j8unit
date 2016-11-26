package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.TransformerHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TransformerHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.sax.TransformerHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class TransformerHandlerClassTest
implements TransformerHandlerClassTests<TransformerHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.sax.TransformerHandler]

    @Override
    public Class<TransformerHandler> createNewSUT() {
        return TransformerHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.sax.TransformerHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.sax.TransformerHandler]

}
