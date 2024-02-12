import org.apache.camel.builder.RouteBuilder;

public class StoreRestRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:start")
                .routeId("test route")
                .log("Order Route Started");

    }
}
