package org.j8unit.showcase.jm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class Test3
implements ITest2 {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { ArrayList.class }, { LinkedList.class }, { Vector.class } });
    }

    @Parameter(0)
    public Class<List<String>> clazz;

    @Override
    public List<String> createNewSUT() {
        try {
            return this.clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException cause) {
            throw new RuntimeException(cause);
        }
    }

}
