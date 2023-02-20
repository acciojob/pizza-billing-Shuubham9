package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    private int bag;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isTakeAway;
    boolean isBillCreated;

    public Boolean getVeg() {
        return isVeg;
    }

    public int getToppings() {
        return toppings;
    }

    public int getBag() {
        return bag;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public void setBag(int bag) {
        this.bag = bag;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            price+=80;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            price+=this.toppings;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            price+=20;
            isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated){
            if(isExtraCheeseAdded){
                this.bill+="Extra Cheese Added: "+80+"\n";
            }
            if(isExtraToppingsAdded){
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isTakeAway){
                this.bill+="Paperbag Added: "+20+"\n";
            }
            this.bill+="Total Price: "+this.price+"\n";
            this.isBillCreated=true;
            return this.bill;
        }
        return this.bill;
    }
}
