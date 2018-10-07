package com.k381.good;

public abstract class Bird {
    private boolean isFlying;
    private final String name;

    Bird(String name) {
        this.isFlying = false;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public abstract void feed();

    void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "isFlying=" + isFlying +
                ", name='" + name + '\'' +
                '}';
    }

    public void newExceprtion(){
        if(this.name=="") throw new RuntimeException("Name can't be empty");
    }
}
