package org.kainos.ea;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class EvianApplicationApplication extends Application<EvianApplicationConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EvianApplicationApplication().run(args);
    }

    @Override
    public String getName() {
        return "EvianApplication";
    }

    @Override
    public void initialize(final Bootstrap<EvianApplicationConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final EvianApplicationConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
