package com.company;
import java.util.*;

public class Magic8Ball
{
    public static void main ( String[] args )
    {
        String[] ball = {"It is certain","It is decidedly so","Without a doubt","Yes — definitely","You may rely on it",// vp
        "As I see it, yes","Most likely","Outlook good","Signs point to yes","Yes", //p
        "Reply hazy, try again","Ask again later","Better not tell you now","Cannot predict now","Concentrate and ask again", //n
                "Don’t count on it","My reply is no","My sources say no","Outlook not so good","Very doubtful"}; //ne
        Random r = new Random();
        int index = r.nextInt(ball.length);
        System.out.println("THE BALL SAYS:");
        System.out.println(ball[index]);
    }
}