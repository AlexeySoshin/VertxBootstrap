import io.vertx.core.AbstractVerticle;

/**
 *
 */
public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() {
        System.out.println(this.getClass().getName() + " restarted");
    }
}
