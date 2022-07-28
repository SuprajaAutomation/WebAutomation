import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Examples {

    public void addArray(int a[])
    {
        int sum=0;
        int n=a.length;
        for ( int i=0;i<n;i++){
            sum = sum +a[i];
        }
       System.out.println("sum of the array = "+sum);
    }

    public void multiplicationTable()
    {
      int m=0;

       for(int j=1;j<=10;j++)
       {
           m=m+5;
           System.out.println(m);
       }

    }

    public void CompareArray()
    {
        int arr1[]={1,4,6,8,3};
        int arr2[]={2,5,6,7,9};
        ArrayList arr3 = new ArrayList();
        for(int i=1;i<arr1.length;i++)
        {
            for(int j=1;j<arr2.length;j++) {

                if (arr1[i] == arr2[j])
                {
                    arr3.add(arr1[i]);
                }

            }
        }

        for(Object result:arr3){
        System.out.println(result);
    }

    }

    public void Occurance_number()
    {
        int a[] = {6,3,4,7,8,9,6};
        int n=a.length;
        ArrayList result = new ArrayList();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                   result.add(a[i]);
                }
            }
        }

        for(Object r:result)
        {
            System.out.println("occurance number is "+ r);
        }
    }

    public void occurance_String()
    {
    String s1="SubhaSlfneubhAj";
    int n=s1.length();

    char[] ch = s1.toCharArray();
    ArrayList<Character> arrayList = new ArrayList();

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {

                if((ch[i])==ch[j])
                {
                    arrayList.add(ch[i]);
                }
            }
        }
       System.out.println("Occurance characters are "+ arrayList.toString());

    }

    public void Distinct_String()
    {
        String s1="SubhaSubhaSunnkk";
        int n=s1.length();
        char[] ch = s1.toCharArray();
        ArrayList arrayList = new ArrayList();

        for(int i=0;i<n;i++)
        {
            int j;
            for( j=0;j<n;j++)
            {

                if(ch[i]==ch[j])
                {
                   break;
                }
            }
            if(j == i)
            {
                arrayList.add(ch[i]);

            }
        }
        System.out.println("Distinct characters are "+ arrayList.toString());
    }

    public void Swappingwithtemp(int a,int b)
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("after swapping = "+a+ " "+b);
    }

    public void Swapping_without_temp(int a , int b)
    {
        a=a+b;//a=9
        b=a-b;//b=9-7=2
        a=a-b;//a=a-b=9-2

        System.out.println("after swapping = "+a+ " "+b);
    }
    public void greatest_Array(int array1[])
    {

        int n=array1.length;
        int max = array1[0];
        for(int i=1;i<n;i++)
        {
            if(array1[i]>max)
            {
                max=array1[i];
            }

        }
        System.out.println("greatest array "+max);
    }

    public void smallest_Array(int array1[])
    {
        int n=array1.length;
        int min = array1[0];
        for(int i=1;i<n;i++)
        {
            if(array1[i]<min)
            {
                min=array1[i];
            }

        }
        System.out.println("smallest_Array "+min);
    }

    public void asending_Array(int arr[]) throws AWTException
    {
        int temp = 0;
        int n=arr.length;
        for(int i=0;i<n; i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }

    public void desending_Array(int arr[]) throws AWTException
    {
        int temp = 0;
        int n=arr.length;
        for(int i=0;i<n; i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }

    public void reverse_String_StringBuffer()
    {
        String Str = "Hello";
        StringBuffer sb = new StringBuffer(Str);
        sb.reverse();
        System.out.println("Reverse a string using buffer = "+sb);

    }

    public void reverse_String_toCharArray()
    {
        String str = "helol";
        String rev = "" ;
        char ch[] = str.toCharArray();

        for(int i=ch.length-1;i>=0;i--)
        {
        rev=rev+ch[i];
        }
        System.out.println("reverse using charAt = "+rev);
    }

    public void reverse_IndividualString_Array()
    {
        String str = "Hello World Hi";
        String[] words= str.split("\\s");
        String rev = "" ;
        for(String w:words)

        {
            StringBuffer sb=new StringBuffer(w);
            sb.reverse();
            rev=rev+sb+" ";
        }
        System.out.println("reverse using charAt = "+rev);
    }

    public void palindrome()
    {
        String str="madam";
        String rev="";
        char[] ch = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+ch[i];
        }
        System.out.println("reverse using charAt = "+rev);
        if(str.equals(rev))
        {
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Given string is not a palindrom");
        }

    }

    public void finocci()
    {
        int count=10;
        int n1=0;
        int n2=1;
        int n3;
        System.out.println(" "+n1);
        for(int i=2;i<=count;i++)
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;

        }

    }

    public void regularExpression()
    {
    String s1 ="944";
    String s2= "87897";
    String condition = "^[0-9]*$"; //only digits

        // ^*[0-9]$ -> only one digit from 0 to 9
        // ^[0-9]*$  -> any no of digits from 0 to9 and can also repeat the digits.


        Pattern p = Pattern.compile(condition);

        Matcher m = p.matcher(s1);
        System.out.println("Check whether s1 is true: "+m.matches());

        Matcher m1=p.matcher(s2);
        System.out.println("s2 is true ? : "+m1.matches());

    }

    public void conversion()
    {
        int i=9;
        String s="08787";

        System.out.println(Integer.parseInt(s));
        String s1=Integer.toString(i);
        System.out.println(s1);

    }

    public void replace_Char_in_StringBuffer()
    {
        String s = "aaa+bbbb+cc+dddd";
        System.out.println("Original string = "+s);
        StringBuffer b = new StringBuffer(s);
        b.setCharAt(11, ' ');
        System.out.println("Replaced String = "+b);

    }

    public void replace_Char_in_String()
    {
        String s = "aaa+bbbb+cc+dddd";
        //String[] strings = s.split("\\+");
        String newStr = "";

        System.out.println(newStr);

    }

    public void stringConcat()
    {
        String s1 = "Subha";
        String s2 = s1.concat("Sss");
        System.out.println("String = "+s2);
    }

    public static void main(String[] args) throws AWTException {
        int a[] = {1,2,3,4};
        int array[] = {5,2,8,9,0,3,1,6,4,7};
        String a1[] = {"sf", "sf"};

        Examples e = new Examples();

        //e.addArray(a);
        //e.multiplicationTable();
        //e.CompareArray();
        //e.Swappingwithtemp(2,4);
        //e.Swapping_without_temp(9,0);

        //e.greatest_Array(array);
        //e.smallest_Array(array);
        //e.asending_Array(array);
        //e.desending_Array(array);
        //e.reverse_String_StringBuffer();
        //e.reverse_String_toCharArray();
        //e.reverse_IndividualString_Array();
        //e.palindrome();
        //e.finocci();
        // e.regularExpression();
         //   e.conversion();
          //  e.Occurance_number();
           // e.occurance_String();
        //e.Distinct_String();
        //e.printTextBlock();
        //e.replace_Char_in_StringBuffer();
       // e.replace_Char_in_String();
        e.stringConcat();

    }
}
