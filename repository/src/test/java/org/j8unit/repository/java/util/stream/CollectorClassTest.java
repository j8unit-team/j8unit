package org.j8unit.repository.java.util.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CollectorClassTest
implements org.j8unit.repository.java.util.stream.CollectorClassTests<java.util.stream.Collector> {

    @RunWith(J8Unit4.class)
    public static class CharacteristicsClassTest
    implements org.j8unit.repository.java.util.stream.CollectorClassTests.CharacteristicsClassTests<java.util.stream.Collector.Characteristics> {

        @Override
        public Class<java.util.stream.Collector.Characteristics> createNewSUT() {
            return java.util.stream.Collector.Characteristics.class;
        }

    }

    @Override
    public Class<java.util.stream.Collector> createNewSUT() {
        return java.util.stream.Collector.class;
    }

}
