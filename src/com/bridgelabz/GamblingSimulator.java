package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambler Simulator Problem");
        int wins = 0;
        int loss = 0;
        int bet = 1;
        int totalAmount = 0;

        for (int day = 1; day <= 20; day++) {
            int stake = 100;
            while (stake > 50 && stake < 150) {
                double gameCheck = Math.floor(Math.random() * 10) % 2;
                if (bet == gameCheck) {
                    stake++;
                } else {
                    stake--;
                }
            }
            if (stake == 50) {
                loss++;
                System.out.println("Day " + day + " is a unlucky day where he lost Maximum ");
            } else {
                wins++;
                System.out.println("Day " + day + " is a lucky day where he won maximum ");
            }
            totalAmount = totalAmount + stake;
        }

        if (totalAmount > 2000) {
            int profitAmt = totalAmount - 2000;
            System.out.println("After 20 days Gambler won: $ " + profitAmt);
        }else if (totalAmount < 0) {
            int lossAmt=2000-totalAmount;
            System.out.println("After 20 days Gambler lost: $ " + lossAmt);
        }else
            System.out.println("No profit or loss ");

        System.out.println("In this month " + wins + " Days Won. " + loss + " Days lost");
        }
    }

