package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * this class keeps track of city objects
 */


public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is the candidate city to add
     */
    public void add(City city){
    if (cities.contains(city)){
        throw new IllegalArgumentException();
        }
    cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *  Return the sorted list
     */
    public List<City> getCities(){
        List<City>list=cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if list has a city in it already
     * @param city
     * the city passed in
     * @return
     * returns true if city is in
     * returns false if city is not
     */
    public Boolean hasCity(City city){
        List<City>list=cities;
        for (int i=0;i<list.size();i++){
            if(list.get(i).getCityName()==city.getCityName() && list.get(i).getProvinceName()==city.getProvinceName()){
                return true;
            }
        }
        return false;
    }

    /**
     * deletes city from list if it exists
     * @param city
     * this is the passed in city
     */
    public void delete(City city) {
        List<City>list=cities;
        for (int i=0;i<list.size();i++){
            if(list.get(i).getCityName()==city.getCityName() && list.get(i).getProvinceName()==city.getProvinceName()){
                list.remove(i);
            }
        }
    }

    /**
     * returns int of how many cities there are in list
     * @return
     * returns the number
     */
    public int countCities(){
        List<City>list=cities;
        return list.size();
    }
}

