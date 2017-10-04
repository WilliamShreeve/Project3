
/**
 * Class ZipCode includes constructors, getters, and mutators for Zip code
 * including zip, city, state, longitude, at latitude.
 * 
 * @author  William Shreeve
 * @version April 2017
 */
public class ZipCode
{
    /**Instance variables*/
    private int zip;
    private String city;
    private String state;
    private double longitude;
    private double latitude;

    /***************************************************************************
     * Constructor that intializes the zipcodes to the provided values
     * but provides the following default values to each of the remaining
     * instance variables.
     ***************************************************************************/
    public ZipCode (int pZip){
        zip = pZip;
        city = "UNKNOWN";
        state = "ST";
        latitude = 0.0;
        longitude = 0.0;
    }

    /***************************************************************************
     * Constructor that intializes the zipcodes to the provided values
     ***************************************************************************/
    public ZipCode(int pZip, String pCity, String pState, double pLat, double pLon){
        zip = pZip;
        city = pCity;
        state = pState;
        latitude = pLat;
        longitude = pLon;
    }
    
    /****************************************************************************
     * Gets zip
     * @returns     zip code
     ***************************************************************************/
    public int getZip(){
        return zip;
    }
    
    /****************************************************************************
     * Gets city
     * @returns     city
     ***************************************************************************/
    public String getCity(){
        return city;
    }
    
    /****************************************************************************
     * Gets state
     * @returns     state
     ***************************************************************************/
    public String getState(){
        return state;
    }
    
    /****************************************************************************
     * Gets Latitude
     * @returns     latitude
     ***************************************************************************/
    public double getLatitude(){
        return latitude;
    }
    
    /****************************************************************************
     * Gets Longitude
     * @returns     longitude
     ***************************************************************************/
    public double getLongitude(){
        return longitude;
    }
    
    /****************************************************************************
     * Changes zip
     * @param   new Zip code
     ***************************************************************************/
    public void setZip(int pZip){
        zip = pZip;
    }
    
    /****************************************************************************
     * Changes City
     * @param   new city
     ***************************************************************************/
    public void setCity(String pCity){
        city = pCity;
    }
    
    /****************************************************************************
     * Changes state
     * @param   new state
     ***************************************************************************/
    public void setState(String pState){
        state = pState;
    }
    
    /****************************************************************************
     * Changes longitude
     * @param   new longitude
     ***************************************************************************/
    public void setLongitude(double pLon){
        longitude = pLon;
    }
    
    /****************************************************************************
     * Changes latitude
     * @param   new latitude.
     ***************************************************************************/
    public void setLatitude(double pLat){
        latitude = pLat;
    }
    
    /****************************************************************************
     * Returns String containing City, state, and zip code.
     * @return  formatted string
     ***************************************************************************/
     public String toString(){
         return city + ", " + state + " " + zip;
        }
}
