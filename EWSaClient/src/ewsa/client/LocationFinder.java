/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ewsa.client;

import java.math.BigDecimal;

import it.elbuild.jcoord.LatLng;
import it.elbuild.jcoord.resolver.GeoCodeResolver;

/**
 *
 * @author nicholas
 */
public class LocationFinder {    

    
    public LocationFinder(){
        
    }
    
    public String getCoord(String locName){
        
        try{
            // init variables
            String address = locName;

            // call the static method of JCooord
            LatLng coord = GeoCodeResolver.findCoordForAddress(address);

            // get coordinate as double values
            BigDecimal lat = coord.getLat();
            BigDecimal lon = coord.getLng();

            //System.out.println("Lat " + lat + "\t Long: " + lon);

            return(lat+", "+lon);
        }catch (NullPointerException e) {
            return "error";
        }
    }
    
}
