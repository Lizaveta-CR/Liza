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
        sportsmanList.add(new Sportsman("Valera", 100));
        sportsmanList.add(new Sportsman("Alexey", 119));
        sportsmanList.add(new Sportsman("Oleg", 89));
        sportsmanList.add(new Sportsman("Alex", 112));
        sportsmanList.add(new Sportsman("Pavel", 120));

        return sportsmanList;
    }

    // ты в метод передаешь sportsmanList но никак его не используешь, зачем он тогда здесь?
    // можно пробежаться по списку спортсменов, у каждого ведь есть своя скорость и таким образом заменишь averageSpeed на скорость спортсмена
    // плюс это даст возможность узнать кто же пробежал дистанцию быстрее
    private static void run(List<Sportsman> sportsmanList, int distance) throws InterruptedException {
        int averageSpeed = 100;
        int totalTime = distance / averageSpeed;
        System.out.println("Ready?Go!");
        Thread.sleep(totalTime + 3000);
    }

    // а если будет коллекция из 1 спортсмена? или из двух? можно пробежаться в цикле по каждому элементу, так будет правильно
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
    
// метод getLastSportsman исходя из названия должен возвращать одного спортсмена
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
