package org.j8unit.repository.org.omg.IOP.CodecFactoryPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.IOP.CodecFactoryPackage.UnknownEncoding;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UnknownEncodingTest
implements FactoryBasedJ8UnitTest<UnknownEncoding>, org.j8unit.repository.org.omg.IOP.CodecFactoryPackage.UnknownEncodingTests<UnknownEncoding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.CodecFactoryPackage.UnknownEncoding]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UnknownEncoding::new);
    }

    @Parameter(0)
    public Callable<UnknownEncoding> sutFactory;

    @Override
    public Callable<UnknownEncoding> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.CodecFactoryPackage.UnknownEncoding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.CodecFactoryPackage.UnknownEncoding]

}
