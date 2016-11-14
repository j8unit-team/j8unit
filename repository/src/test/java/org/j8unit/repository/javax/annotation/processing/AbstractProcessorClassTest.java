package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.AbstractProcessor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractProcessor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.annotation.processing.AbstractProcessorClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractProcessorClassTest
implements AbstractProcessorClassTests<AbstractProcessor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.AbstractProcessor]

    @Override
    public Class<AbstractProcessor> createNewSUT() {
        return AbstractProcessor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.AbstractProcessor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.AbstractProcessor]

}
