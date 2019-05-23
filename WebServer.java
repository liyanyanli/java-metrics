
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class WebServer {

    public static void main(String[] args) throws Exception {

        int port = Integer.parseInt("9091");
        Server server = new Server(port);
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new HealthServlet()), "/metrics");
        server.start();
        server.join();
    }
}

