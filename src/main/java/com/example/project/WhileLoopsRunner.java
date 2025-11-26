package com.example.project;


public class WhileLoopsRunner{

    public static void main(String[] args) {

        int n = WhileLoops.countEvensUpTo(10);
        System.out.println(n);
        System.out.println(WhileLoops.countEvensUpTo(20));

        System.out.println(WhileLoops.digitSum(4098));
        System.out.println(WhileLoops.countDownBy(20, 3));

        System.out.println(WhileLoops.weeksToReachGoal(0, 50, 200));
        System.out.println(WhileLoops.weeksToReachGoal(100, 20, 110));
        System.out.println(WhileLoops.weeksToReachGoal(500, 100, 400));
        System.out.println(WhileLoops.weeksToReachGoal(10, 10, 40));
        System.out.println(WhileLoops.minutesUntilDead(100, 10));

       
    }
}
