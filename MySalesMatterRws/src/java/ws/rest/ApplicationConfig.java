/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.rest;

import java.util.Set;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

/**
 *
 * @author Yuki
 */
@javax.ws.rs.ApplicationPath("Resources")
public class ApplicationConfig extends javax.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        resources.add(MultiPartFeature.class);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ws.rest.CategoryResource.class);
        resources.add(ws.rest.FileResource.class);
        resources.add(ws.rest.LikedItemResource.class);
        resources.add(ws.rest.ListingResource.class);
        resources.add(ws.rest.MessageResource.class);
        resources.add(ws.rest.OfferResource.class);
        resources.add(ws.rest.RentalReservationResource.class);
        resources.add(ws.rest.ReviewResource.class);
        resources.add(ws.rest.SalesTransactionResource.class);
        resources.add(ws.rest.TagResource.class);
        resources.add(ws.rest.UserResource.class);
    }
    
}
