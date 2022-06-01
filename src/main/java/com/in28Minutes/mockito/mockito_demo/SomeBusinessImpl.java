package com.in28Minutes.mockito.mockito_demo;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGraatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int value: data) {
            if(value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}

