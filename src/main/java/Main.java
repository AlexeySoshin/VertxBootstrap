import io.vertx.core.Vertx;

/**
 * Starts the main verticle
 */
public class Main {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(MainVerticle.class.getName());
    }
}
