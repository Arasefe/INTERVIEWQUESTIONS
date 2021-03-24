package myInterviewQuetions;

import java.util.Arrays;
import java.util.HashMap;

public class PlutoTv {
    static String  baseUrl = "https://www.google.com/search?source=hp&ei=b15sXMKrM4278AOHpbCwCw&q=Testing+Stuff&btnK=Google+Search&oq=Testing+Stuff&gs_l=psy-ab.3..0l3j0i22i30l7.3166.4948..5170...1.0..0.205.1020.13j0j1......0....1..gws-wiz.....6..35i39j0i131j0i67j0i131i67j0i20i263.h5UNezcaj8w";


    public static void main(String[] args) {
        urlParsing2();
        //stringParse() find only the www.google.com which a dynamic fashion
    }
    public static void stringParse(){
        String newBase=baseUrl.substring(baseUrl.indexOf("//")+2,baseUrl.lastIndexOf("/"));
        System.out.println(newBase);
    }


    public static void urlParsing2() {
        // How to store parameters in baseUrl in Key and value format
        HashMap<String, String> params = new HashMap<String, String>();
        String strUrl=baseUrl.substring(baseUrl.indexOf("?")+1);
        System.out.println(strUrl);

        String [] strArray=strUrl.split("&");
        System.out.println(Arrays.toString(strArray));
        for(String each: strArray){
            params.put(each.substring(0,each.indexOf("=")),each.substring(each.indexOf("=")+1));
        }
        System.out.println(params);
    }
}

