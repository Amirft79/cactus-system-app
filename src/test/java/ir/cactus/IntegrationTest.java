package ir.cactus;

import ir.cactus.config.AsyncSyncConfiguration;
import ir.cactus.config.EmbeddedKafka;
import ir.cactus.config.EmbeddedSQL;
import ir.cactus.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CactusSystemApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
