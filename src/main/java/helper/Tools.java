package helper;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Calendar;

public class Tools {

    public String REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(String text){
        String i = text.replace("\n"," ").replaceAll("\\s{2,}", " ").trim();
        return i;
    }

    public String convertToLetterCase(String text) {
        String firstLetter = text.substring(0,1);
        String exceptFirstLetter = text.substring(1,text.length());
        return firstLetter.toUpperCase() + exceptFirstLetter.toLowerCase();
    }

    public ArrayList<String> getDate(String date)
    {
        ArrayList<String> i = new ArrayList<>(3);
        LocalDateTime now = LocalDateTime.now();
        String day = date.trim().replace("today","");
        if(day.equalsIgnoreCase(""))
        {
            i.add(Integer.toString(now.getDayOfMonth()));
            i.add(Integer.toString(now.getMonthValue()));
            i.add(Integer.toString(now.getYear()));
        }else{
            long d = Integer.parseInt(day.replace("+",""));
            i.add(Integer.toString(now.plusDays(d).getDayOfMonth()));
            i.add(Integer.toString(now.plusDays(d).getMonthValue()));
            i.add(Integer.toString(now.plusDays(d).getYear()));
        }
        return i;
    }

    public String fixAmountIssue(String amount){
        String[] amtSplit=amount.split(" ");
        String amt=amtSplit[0]+" "+amtSplit[amtSplit.length-1];
        return amt;
    }

    public String pesoAmount(double amount)
    {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String s = n.format(amount / 1);
        return s.replaceAll("￥","PHP ");
    }

    public String getDateInFormat(String day,String month,String year,String format) throws ParseException {
        String inputPattern="yyyy-M-dd";
        if(month.trim().length()>1){
            inputPattern="yyyy-MM-dd";
        }
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern); // or "YYYY-MM-DDThh:mm:ss±0000"
        String dateInString = year+"-"+month+"-"+day;
        Date date = inputFormat.parse(dateInString);
        SimpleDateFormat outputFormat = new SimpleDateFormat(format);
        return outputFormat.format(date);
    }

    public static String gettodaysDateInFormat()  {

//throws ParseException
        String mydate;
         mydate = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());

        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        // Printing the date
        System.out.println(dateFormatter.format(Calendar.getInstance().getTime()));
        mydate=dateFormatter.format(Calendar.getInstance().getTime());
        String mydate1=mydate.substring(3,5);
        String mydate2=mydate.substring(6,10);
        int mydate3=Integer.parseInt(mydate2)+1;
        String month=mydate.substring(0,2);
        String monthnew=null;
        switch (month.toUpperCase() ){
            case "01":
                monthnew="January";
                break;
            case "02":
                monthnew="February";
                break;
            case "03":
                monthnew="March";
                break;
            case "04":
                monthnew="April";
                break;
            case "05":
                monthnew="May";
                break;
            case "06":
                monthnew="June";
                break;
            case "07":
                monthnew="July";
                break;
            case "08":
                monthnew="August";
                break;
            case "09":
                monthnew="September";
                break;
            case "10":
                monthnew="October";
                break;
            case "11":
                monthnew="November";
                break;
            case "12":
                monthnew="December";
                break;


        }
        mydate=monthnew+" "+mydate1+","+" "+mydate3;

       // mydate=monthnew+" "+mydate.substring(4);
        return mydate;
    }

    public static String getDateInFormatforMBB(int futuredatefromtoday)  {


        String mydate = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        String futuredate;
        //System.out.println(mydate);
        mydate=mydate.substring(0,12);
        String month=mydate.substring(0,3);
        String monthnew=null;
        switch (month.toUpperCase() ){
            case "JAN":
                monthnew="January";
                break;
            case "FEB":
                monthnew="February";
                break;
            case "MAR":
                monthnew="March";
                break;
            case "APR":
                monthnew="April";
                break;
            case "JUN":
                monthnew="June";
                break;
            case "JUL":
                monthnew="July";
                break;
            case "AUG":
                monthnew="August";
                break;
            case "SEP":
                monthnew="September";
                break;
            case "OCT":
                monthnew="October";
                break;
            case "NOV":
                monthnew="November";
                break;
            case "DEC":
                monthnew="December";
                break;


        }


         futuredate=mydate.substring(4,6);
//        if(futuredate.contains(",")){
//            futuredate=futuredate.replace(",","");
//            futuredate="0"+futuredate;
//        }

        int futuredateadd=Integer.parseInt(futuredate.replace(",",""));
        futuredateadd=futuredateadd+futuredatefromtoday;
        //System.out.println(futuredateadd);
        futuredate=String.valueOf(futuredateadd);
        if(futuredate.length()==1)
        {
            futuredate="0"+futuredate;
        }

        mydate=futuredate+" "+monthnew+mydate.substring(6);
        mydate=mydate.replace(",", "");
        //System.out.println(mydate);


        return mydate;
    }


    public static String RANDOMTEXT(String Type ,int Stringlength) {
        String out=null;

            String Randominput=Type.toUpperCase();
            if(Randominput.contains("RANDOMTEXT"))
            {
                String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvwxyz1234567890";
                StringBuilder sb = new StringBuilder();
                Random rnd = new Random();
                while (sb.length() < Stringlength) { // length of the random string.
                    int index = (int) (rnd.nextFloat() * CHARS.length());
                    sb.append(CHARS.charAt(index));
                }
                out = sb.toString();
            }
            else if(Randominput.contains("RANDOMNUMBER")) {

                String CHARS = "1234567890";
                StringBuilder sb = new StringBuilder();
                Random rnd = new Random();
                while (sb.length() < Stringlength) { // length of the random string.
                    int index = (int) (rnd.nextFloat() * CHARS.length());
                    sb.append(CHARS.charAt(index));
                }
                out = sb.toString();

            }
            else if(Randominput.contains("RANDOMSTRING")) {

                String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghiklmnopqrstuvwxyz";
                StringBuilder sb = new StringBuilder();
                Random rnd = new Random();
                while (sb.length() < Stringlength) { // length of the random string.
                    int index = (int) (rnd.nextFloat() * CHARS.length());
                    sb.append(CHARS.charAt(index));
                }
                out = sb.toString();

            }



        return out;
    }

    public static String RANDOMMOBILENUMBER(int Stringlength) {
        String out=null;


            String CHARS = "123456789";
            StringBuilder sb = new StringBuilder();
            Random rnd = new Random();
            while (sb.length() < Stringlength) { // length of the random string.
                int index = (int) (rnd.nextFloat() * CHARS.length());
                sb.append(CHARS.charAt(index));
            }
            out = "9"+sb.toString();

            return out;
    }

    public static String RANDOMMAILID(int Stringlength) {
        String out=null;
        String CHARS = "abcdefghijklmnopqrstuvwxyz123456789";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (sb.length() < Stringlength) { // length of the random string.
            int index = (int) (rnd.nextFloat() * CHARS.length());
            sb.append(CHARS.charAt(index));
        }
        out = sb.toString()+"@gmail.com";

        return out;
    }





}