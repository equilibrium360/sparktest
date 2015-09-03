package com.lex.sparktestp;

/**
 * Created by UNIVERSE on 11/25/14.
 */
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class sparkmainc {

    public void main(){

        SparkConf conf = new SparkConf().setMaster("local").setAppName("My App");
        JavaSparkContext sc = new JavaSparkContext(conf);
    }
}
