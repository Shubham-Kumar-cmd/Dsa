package com.dsa.normal.string;

public class Performance {
    public static void main(String[] args) {
        String series="";//String is immutable(i.e, every time a new object will be created)
        StringBuilder builder=new StringBuilder();//StringBuilder is mutable
        for (int i = 0; i < 58; i++) {
            int asciiValue=('A'+i);
            char ch=(char)('A'+i);
            System.out.print(ch+" ");
            System.out.print(asciiValue+"\n");
            series=series+ch;//series+=ch;
            builder=builder.append(ch);
        }
        System.out.println(series);
        System.out.println(builder);
    }
}
