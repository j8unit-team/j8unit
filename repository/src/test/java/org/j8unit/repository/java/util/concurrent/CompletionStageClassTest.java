package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CompletionStage;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CompletionStageClassTest
implements org.j8unit.repository.java.util.concurrent.CompletionStageClassTests<CompletionStage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CompletionStage]

    @Override
    public Class<CompletionStage> createNewSUT() {
        return CompletionStage.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CompletionStage]

}
