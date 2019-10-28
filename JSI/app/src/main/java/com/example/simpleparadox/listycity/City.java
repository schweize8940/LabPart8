package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    /**
     * CompareTo compraes the City name
     * @param city
     *  other city to get compared to
     * @return
     * 0=same
     * -1=this is lexographically earlier
     * 1= city is lexogrpahcially earlier
     */
    @Override
    public int compareTo(City city){
        return this.city.compareTo(city.getCityName());
    }
}
