package com.company.WeatherAPI;

import java.util.HashMap;
import java.util.Map;

public class WeatherResponse {

    public Map<String, Double> coord;
    public weather[] weather;
    public String base;
    public Map<String, Double> main;
    public String visibility;
    public Map<String, Double> wind;
    public Map<String, Integer> clouds;
    public Map<String, String> sys;
    public int timezone;
    public int id;
    public String name;

}
