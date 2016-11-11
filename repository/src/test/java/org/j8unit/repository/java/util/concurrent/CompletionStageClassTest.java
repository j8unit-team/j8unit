package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CompletionStage;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompletionStage} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.CompletionStageClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CompletionStageClassTest
implements CompletionStageClassTests<CompletionStage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CompletionStage]

    @Override
    public Class<CompletionStage> createNewSUT() {
        return CompletionStage.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.CompletionStage]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CompletionStage]

}
