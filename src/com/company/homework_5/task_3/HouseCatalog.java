package com.company.homework_5.task_3;

import java.util.Arrays;

public class HouseCatalog {
    // оба эти массив должны быть одним House[]
    private final CityHouse[] cityHouses;
    private final VacationHome[] vacationHomes;

    public HouseCatalog(CityHouse[] cityHouses, VacationHome[] vacationHomes) {
        this.cityHouses = cityHouses;
        this.vacationHomes = vacationHomes;
    }

    public CityHouse[] getArrayCities() {
        CityHouse[] arrayCopy = Arrays.copyOf(cityHouses, cityHouses.length);
        return arrayCopy;
    }

    public VacationHome[] getArrayVacation() {
        VacationHome[] arrayCopy = Arrays.copyOf(vacationHomes, vacationHomes.length);
        return arrayCopy;
    }

    @Override
    public String toString() {
        return "House{" +
                "City houses: " + Arrays.toString(cityHouses) +
                "Vacation houses: " + Arrays.toString(vacationHomes) +
                '}';
    }
}
