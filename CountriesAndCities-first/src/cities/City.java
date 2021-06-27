
package cities;


public class City {
    String iso3 ;
    String city_ascii;
    double lat ;
    double lng ;
    boolean capital ;
    double population ; 
    String id ;   
    
    
    // make constructors
    
    public City (String iso3 , String city_ascii, double lat ,double lng ,boolean capital ,double population ,String id){
        
        this.iso3 = iso3;
        this.city_ascii = city_ascii;
        this.lat = lat;
        this.lng = lng;
        this.capital = capital;
        this.population = population;
        this.id = id ;
        
    }

    public String getIso3() {
        return iso3;
    }

    public String getCity_ascii() {
        return city_ascii;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public boolean isCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "City{" + "iso3=" + iso3 + ", city_ascii=" + city_ascii + ", lat=" + lat + ", lng=" + lng + ", capital=" + capital + ", population=" + population + ", id=" + id + '}';
    }
    
    
}
