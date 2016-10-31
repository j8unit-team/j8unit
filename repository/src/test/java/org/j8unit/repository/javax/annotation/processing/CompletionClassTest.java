package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Completion;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionClassTest
implements org.j8unit.repository.javax.annotation.processing.CompletionClassTests<Completion> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.Completion]

    @Override
    public Class<Completion> createNewSUT() {
        return Completion.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.Completion]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.Completion]

}
