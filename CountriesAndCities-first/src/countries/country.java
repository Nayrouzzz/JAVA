
package countries;

/**
 *
 * @author Nayrouz
 */
public class country {
    
    String iso3 ;
    String country;

    public country(String iso3, String country) {
        this.iso3 = iso3;
        this.country = country;
    }

    public String getIso3() {
        return iso3;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "country{" + "iso3=" + iso3 + ", country=" + country + '}';
    }
    
    
    
    
}
