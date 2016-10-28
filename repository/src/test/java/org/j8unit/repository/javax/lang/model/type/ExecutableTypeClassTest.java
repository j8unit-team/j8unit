package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ExecutableType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutableTypeClassTest
implements org.j8unit.repository.javax.lang.model.type.ExecutableTypeClassTests<ExecutableType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.ExecutableType]

    @Override
    public Class<ExecutableType> createNewSUT() {
        return ExecutableType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.ExecutableType]

}
