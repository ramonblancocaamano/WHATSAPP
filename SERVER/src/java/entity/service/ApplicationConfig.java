package entity.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * @Authors: BLANCO CAAMANO, Ramon <ramonblancocaamano@gmail.com>
 * GREGORIO DURANTE, Nicola <ng.durante@gmail.com>
 */
@javax.ws.rs.ApplicationPath("rpc")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(entity.service.MessageFacadeREST.class);
        resources.add(entity.service.UserFacadeREST.class);
        resources.add(entity.service.UserInfoFacadeREST.class);
    }

}
