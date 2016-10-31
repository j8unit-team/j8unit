package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class FileChannelTest
implements org.j8unit.repository.java.nio.channels.FileChannelTests<FileChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.FileChannel]

    @Override
    public FileChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.FileChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.FileChannel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.FileChannel]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MapModeTest
    implements org.j8unit.repository.java.nio.channels.FileChannelTests.MapModeTests<MapMode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.FileChannel$MapMode]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(MapMode.READ_WRITE, //
                                    MapMode.PRIVATE, //
                                    MapMode.READ_ONLY);
        }

        @Parameter(0)
        public MapMode sut;

        @Override
        public MapMode createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.FileChannel$MapMode]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.FileChannel$MapMode]

    }

}
