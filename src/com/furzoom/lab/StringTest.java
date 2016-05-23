package com.furzoom.lab;

import java.util.StringTokenizer;
import java.util.Date;
import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        // String()
        // String(char a[])
        // String(char a[], int offset, int length)
        String s = new String();
        System.out.println(s);
        char a[] = {'g', 'o', 'o', 'd'};
        s = new String(a);
        System.out.println(s);
        s = new String("good");
        System.out.println(s);
        s = new String(a, 1, 2);
        System.out.println(s);

        // +
        String s1 = "programming";
        String s2 = "\t" + s + " " + s1;
        System.out.println(s2);
        System.out.println(s2 + 12);

        // s.length()
        System.out.println("s2.length(): " + s2.length());

        // s.indexOf()
        System.out.println("s2.indexOf(\"oo\"): " + s2.indexOf(new String("oo")));
        System.out.println("s2.indexOf(\"op\"): " + s2.indexOf(new String("op")));

        // s.lastIndexOf()
        System.out.println("s2.lastIndexOf(\"o\"): " + s2.lastIndexOf(new String("o")));
        System.out.println("s2.lastIndexOf(\"io\"): " + s2.lastIndexOf(new String("io")));

        // s.charAt()
        System.out.println("s2.charAt(3): " + s2.charAt(3));

        // s.trim()
        System.out.println("s2.trim(): " + s2.trim());

        // StringTokenizer
        System.out.println("StringTokenizer: ");
        StringTokenizer st = new StringTokenizer(s2);
        while (st.hasMoreTokens()) {
            System.out.println("\t" + st.nextToken());
        }

        // s.replaceAll()
        System.out.println("s2.replaceAll(\" \", \"\"): " + s2.replaceAll(" ", ""));

        // s.replace()
        System.out.println("s2.replace(\"o\", \"#\"): " + s2.replace("o", "#"));

        // s.replaceFirst()
        System.out.println("s2.replaceFirst(\"o\", \"#\"): " + s2.replaceFirst("o", "#"));
        
        // s.equals()
        System.out.println("s.equals(\"oo\"): " + s.equals("oo"));
        System.out.println("s.equals(\"OO\"): " + s.equals("OO"));

        // s.equalsIgnoreCase()
        System.out.println("s.equalsIgnoreCase(\"oo\"): " + s.equalsIgnoreCase("oo"));
        System.out.println("s.equalsIgnoreCase(\"OO\"): " + s.equalsIgnoreCase("OO"));

        // s.startsWith()
        System.out.println("s2.startsWith(\"\t\"): " + s2.startsWith("\t"));
        System.out.println("s2.startsWith(\"b\"): " + s2.startsWith("b"));

        // s.endsWith()
        System.out.println("s2.endsWith(\"ing\"): " + s2.endsWith("ing"));
        System.out.println("s2.endsWith(\"b\"): " + s2.endsWith("b"));

        // s.toUpperCase()
        System.out.println("s2.toUpperCase(): " + s2.toUpperCase());

        // s.toLowerCase()
        System.out.println("s2.toLowerCase(): " + s2.toLowerCase());

        // s.split()
        System.out.print("s2.split(\" \"): ");
        String[] s3 = s2.split(" ");
        for (String str : s3) {
            System.out.print(str);
            System.out.print("---");
        }
        System.out.println();

        System.out.print("s2.split(\"\", 5): ");
        s3 = s2.split("", 5);
        for (String str : s3) {
            System.out.print(str);
            System.out.print("---");
        }
        System.out.println();
 
        // String.format()
        // date and time
        System.out.println("\n\nString.format():");
        Date today = new Date();
        System.out.println("\t%te: " + String.format("%te", today));
        System.out.println("\t%tb: " + String.format("%tb", today));
        System.out.println("\t%tB: " + String.format("%tB", today));
        System.out.println("\t%tA: " + String.format("%tA", today));
        System.out.println("\t%ta: " + String.format("%ta", today));
        System.out.println("\t%tc: " + String.format("%tc", today));
        System.out.println("\t%tY: " + String.format("%tY", today));
        System.out.println("\t%tj: " + String.format("%tj", today));
        System.out.println("\t%tm: " + String.format("%tm", today));
        System.out.println("\t%td: " + String.format("%td", today));
        System.out.println("\t%ty: " + String.format("%ty", today));
        
        System.out.println();
        System.out.println("\t%tH: " + String.format("%tH", today));
        System.out.println("\t%tI: " + String.format("%tI", today));
        System.out.println("\t%tk: " + String.format("%tk", today));
        System.out.println("\t%tl: " + String.format("%tl", today));
        System.out.println("\t%tM: " + String.format("%tM", today));
        System.out.println("\t%tS: " + String.format("%tS", today));
        System.out.println("\t%tL: " + String.format("%tL", today));
        System.out.println("\t%tN: " + String.format("%tN", today));
        System.out.println("\t%tp: " + String.format("%tp", today));
        System.out.println("\t%tz: " + String.format("%tz", today));
        System.out.println("\t%tZ: " + String.format("%tZ", today));
        System.out.println("\t%ts: " + String.format("%ts", today));
        System.out.println("\t%tQ: " + String.format("%tQ", today));

        System.out.println();
        System.out.println("\t%tF: " + String.format("%tF", today));
        System.out.println("\t%tD: " + String.format("%tD", today));
        System.out.println("\t%tc: " + String.format("%tc", today));
        System.out.println("\t%tr: " + String.format("%tr", today));
        System.out.println("\t%tT: " + String.format("%tT", today));
        System.out.println("\t%tR: " + String.format("%tR", today));

        // s.matches()
        String pattern = "\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d";
        String testStr1 = "Mrkj007";
        String testStr2 = "mrkj007";
        System.out.println(testStr1 + ".matches(" + pattern + "): " + testStr1.matches(pattern));
        System.out.println(testStr2 + ".matches(" + pattern + "): " + testStr2.matches(pattern));
        String pattern2 = "\\p{Upper}\\p{Lower}{3}\\d{3}";
        System.out.println(testStr1 + ".matches(" + pattern2 + "): " + testStr1.matches(pattern2));
        System.out.println(testStr2 + ".matches(" + pattern2 + "): " + testStr2.matches(pattern2));
        

        // StringBuilder
        String s4 = "";
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < 10000; ++i) {
            s4 += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String cost: " + (endTime - startTime));

        StringBuilder builder = new StringBuilder("");
        s4 = "";
        startTime = System.currentTimeMillis();
        for (i = 0; i < 10000; ++i) {
            s4.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder cost: " + (endTime - startTime));

    }
}
