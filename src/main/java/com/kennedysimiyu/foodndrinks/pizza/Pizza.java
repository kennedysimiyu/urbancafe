package com.kennedysimiyu.foodndrinks.pizza;


public final class Pizza {

    private final PizzaType type;
    private final int sauce;
    private final int cheese;

    public Pizza(PizzaType pizzaType, int sauce, int cheese) {
        this.type = pizzaType;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    public PizzaType getType() {
        return type;
    }

    public int getSauce() {
        return sauce;
    }

    public int getCheese() {
        return cheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "type=" + type +
                ", sauce=" + sauce +
                ", milk=" + cheese +
                '}';
    }
}
