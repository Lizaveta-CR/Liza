package com.company.homework_12.task_6;

import com.company.homework_12.task_4.User;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SportsmanMain {
    public static void main(String[] args) throws InterruptedException {
        List<Sportsman> sportsmanList = getSportsman();
        run(sportsmanList, 600);

        System.out.println("Ladies and gentlemen we have winners: ");
        sportsmanList.sort(Sportsman::compareTo);

        Map<Integer, Sportsman> runnerMapWinners = getWinners(sportsmanList);
        Map<Integer, Sportsman> runnerMapLast = getLastSportsman(sportsmanList);

        System.out.println("Winners: " + runnerMapWinners);
        System.out.println(runnerMapLast);
    }

    private static List<Sportsman> getSportsman() {
        List<Sportsman> sportsmanList = new ArrayList<>();
        Map<Integer, Color> runnerMap = new HashMap<>();
        sportsmanList.add(new Sportsman("Valera", 100));
        sportsmanList.add(new Sportsman("Alexey", 119));
        sportsmanList.add(new Sportsman("Oleg", 89));
        sportsmanList.add(new Sportsman("Alex", 112));
        sportsmanList.add(new Sportsman("Pavel", 120));

        return sportsmanList;
    }

    private static void run(List<Sportsman> sportsmanList, int distance) throws InterruptedException {
        int averageSpeed = 100;
        int totalTime = distance / averageSpeed;
        System.out.println("Ready?Go!");
        Thread.sleep(totalTime + 3000);
    }

    private static Map<Integer, Sportsman> getWinners(List<Sportsman> sportsmanList) {
        Map<Integer, Sportsman> runnerMap = new HashMap<>();
        Sportsman firstSportsman = sportsmanList.get(0);
        firstSportsman.setMedal(MedalStrategy.GOLD_MEDAL);
        runnerMap.put(1, firstSportsman);
        Sportsman secondSportsman = sportsmanList.get(1);
        secondSportsman.setMedal(MedalStrategy.SILVER_MEDAL);
        runnerMap.put(2, secondSportsman);
        Sportsman thirdSportsman = sportsmanList.get(2);
        thirdSportsman.setMedal(MedalStrategy.BRONZE_MEDAL);
        runnerMap.put(3, thirdSportsman);
        return runnerMap;
    }

    private static Map<Integer, Sportsman> getLastSportsman(List<Sportsman> sportsmanList) {
        Map<Integer, Sportsman> runnerMap = new HashMap<>();
        int firstIteration = 3;
        for (int i = firstIteration; i < sportsmanList.size(); i++) {
            Sportsman lastSportsmen = sportsmanList.get(i);
            lastSportsmen.setMedal(MedalStrategy.CHOCOLATE_MEDAL);
            runnerMap.put(i, lastSportsmen);
        }
        return runnerMap;
    }
}
