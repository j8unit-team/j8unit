package org.j8unit.generator;

import static java.util.Arrays.stream;
import static java.util.Objects.nonNull;
import static java.util.ResourceBundle.getBundle;
import static java.util.stream.Collectors.toList;
import static org.j8unit.generator.api.LoggingMessagesKeys.LOGGING_MESSAGES_BUNDLE;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.ResourceBundle;
import org.j8unit.generator.api.LoggingMessagesKeys;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LoggingMessagesKeysTest {

    private static ResourceBundle bundle;

    @BeforeClass
    public static void initResourceBundle() {
        bundle = getBundle(LOGGING_MESSAGES_BUNDLE);
    }

    @Parameters(name = "{index}: {0}")
    public static List<Object[]> data() {
        return stream(LoggingMessagesKeys.values()).map(lmk -> new Object[] { lmk }).collect(toList());
    }

    @Parameter(0)
    public LoggingMessagesKeys lmk;

    @Test
    public void testKeyIsPresent()
    throws Exception {
        final String key = this.lmk.get();
        assert nonNull(key);

        assertTrue(bundle.containsKey(key));
    }

    @Test
    public void testValueIsPresent()
    throws Exception {
        final String key = this.lmk.get();
        assert nonNull(key);

        assertNotNull(bundle.getObject(key));
        assertNotNull(bundle.getString(key));
    }

}
