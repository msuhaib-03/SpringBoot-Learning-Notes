package net.engineeringdigest.journalApp.api.response;

import lombok.Getter;
import lombok.Setter;
import org.apache.coyote.Request;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class WeatherResponse{
    private Request request;
    private Location location;
    private Current current;

    @Getter
    @Setter
    public class Current{
        public String observation_time;
        public int temperature;
        public int weather_code;
        public List<String> weather_icons;
        public List<String> weather_description;
        public int wind_speed;
        public int wind_degree;
        public String wind_dire;
        public int pressure;
        public int humidity;
        public int cloudcover;
        public int feelslike;
        public int uv_index;
        public int visbility;
        public String is_day;
    }


    @Getter
    @Setter
    public class Request{
        public String type;
        public String query;
        public String language;
        public String unit;
    }


    @Getter
    @Setter
    public class Location{
        public String name;
        public String country;
        public String region;
        public String lat;
        public String lon;
        public String timezone_idn;
        public String localtime;
        public int localtime_epoch;
        public String utc_offset;

    }



}
