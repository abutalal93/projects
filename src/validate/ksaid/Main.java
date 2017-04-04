/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate.ksaid;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        System.out.println("test");
        System.out.println(convertDate("2017-03-27T10:23:14.135Z"));

//        Scanner in = new Scanner(System.in);
//
//        double circleLat = in.nextDouble();
//        double circleLong = in.nextDouble();
//        double circledistance = in.nextDouble();
//
//        double accountLat = in.nextDouble();
//        double accountLong = in.nextDouble();
//
//        double distanceCalculated = (Math.sqrt(Math.pow((circleLong - accountLong), 2) + Math.pow((circleLat - accountLong), 2)));
//        distanceCalculated = distanceCalculated * 1000;
//        System.out.println("circledistance: " + circledistance);
//        System.out.println("distanceCalculated: " + distanceCalculated);
//        System.out.println(distanceCalculated < circledistance);
//        for (; true;) {
//            System.out.print("Please Enter ID: ");
//            String str = in.next();
//            if (str.equals("s")) {
//                break;
//            } else {
//                System.out.println("ValidateID: " + ValidateID(str));
//            }
//
//        }
    }

  

    public static Date convertDate(String str) throws ParseException {
        
        String newStr = str.replace('T', ':');
        newStr = newStr.substring(0,newStr.lastIndexOf("."));


        DateFormat format = new SimpleDateFormat("YYYY-MM-DD:HH:mm:ss");
        Date date = format.parse(newStr);
        System.out.println(date);
        return date;

    }

}
