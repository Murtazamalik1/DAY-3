package com.day_3;

public class Line {

    point p1;
    point p2;
    float length;

    float getLength() {
        return(float) Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}

class point{
   int x,y;
}
class main{
    public static void main(String[] args) {
        Line l1 = new Line();
        l1.p1 = new point();
        l1.p1.x = 40;
        l1.p1.y = 20;

        l1.p2 = new point();
        l1.p2.x = 10;
        l1.p2.y = 80;

        Line l2 = new Line();
        l2.p1 = new point();
        l2.p1.x = 40;
        l2.p1.y = 20;

        l2.p2 = new point();
        l2.p2.x = 10;
        l2.p2.y = 80;
        float length1 = l1.getLength();
        System.out.println(length1);
    }
}
