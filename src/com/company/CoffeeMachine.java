package com.company;

public abstract class CoffeeMachine {
    double waterTank;
    double waterCoffee;
    String panelNavigation;

    public CoffeeMachine(double waterTank, double waterCoffee, String panelNavigation) {
        this.waterTank = waterTank;
        this.waterCoffee = waterCoffee;
        this.panelNavigation = panelNavigation;
    }
}
