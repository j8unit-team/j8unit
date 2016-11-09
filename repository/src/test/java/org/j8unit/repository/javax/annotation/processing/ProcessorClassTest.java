package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Processor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Processor} (by simply reusing the J8Unit
 * test interface {@link ProcessorClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProcessorClassTest
implements ProcessorClassTests<Processor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.Processor]

    @Override
    public Class<Processor> createNewSUT() {
        return Processor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.Processor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.Processor]

}
