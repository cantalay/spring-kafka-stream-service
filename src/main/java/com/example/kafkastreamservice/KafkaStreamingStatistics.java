package com.example.kafkastreamservice;

import java.io.Serializable;
import java.util.Date;

public class KafkaStreamingStatistics implements Serializable{

    long countJobs;
    String date;
    Date hacit;
    Date readDate;

    public KafkaStreamingStatistics() {
    }

    public KafkaStreamingStatistics add(String value){


        countJobs += 1;
        date = value;
        return this;
    }

    public KafkaStreamingStatistics computeAvgTime(){
        hacit = new Date();
        return this;
    }

    @Override
    public String toString() {
        return countJobs + " " + hacit.toString();
    }
}
