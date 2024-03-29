import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;
//import org.flywaydb.core.Flyway;

/**
 *
 * Created by zhaotq on 2014/10/13.
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        String webappDirLocation = "m-master/src/main/webapp/";
        // The port that we should run on can be set into an environment variable
        // Look for that variable and default to 8080 if it isn't there.
        String webPort = System.getenv("PORT");

        //新添加的一个注释
        if (webPort == null || "".equals(webPort)) {
            webPort = "8090";
        }

        File file = new File(webappDirLocation) ;
        if(file.exists()){
            System.out.println(file.getAbsolutePath());
        }else{
            System.out.println("路径有问题");
        }

        Server server = new Server(Integer.valueOf(webPort));
        WebAppContext root = new WebAppContext();

        root.setContextPath("/");
        root.setDescriptor(webappDirLocation + "/WEB-INF/web.xml");
        root.setResourceBase(webappDirLocation);

        root.setParentLoaderPriority(true);
        server.setHandler(root);
        server.start();
        server.join();
    }


}
