package org.j8unit.repository.org.omg.IOP;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.IOP.TaggedProfile;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TaggedProfileTest
implements FactoryBasedJ8UnitTest<TaggedProfile>, TaggedProfileTests<TaggedProfile> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TaggedProfile]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(TaggedProfile::new);
    }

    @Parameter(0)
    public Callable<TaggedProfile> sutFactory;

    @Override
    public Callable<TaggedProfile> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TaggedProfile]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TaggedProfile]

}
