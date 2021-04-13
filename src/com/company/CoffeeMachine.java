package com.company;

public abstract class CoffeeMachine {
    public double waterTank;
    public double waterCoffee;
    public String panelNavigation;

    public CoffeeMachine(double waterTank, double waterCoffee, String panelNavigation) {
        this.waterTank = waterTank;
        this.waterCoffee = waterCoffee;
        this.panelNavigation = panelNavigation;
    }
    public abstract void makeCofee();
}
