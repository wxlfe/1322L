class AllInclusive extends Vacation {
    String brand;
    int stars;
    double totalCost;

    public AllInclusive(double cost, double budget, String destination, String brand, int stars, double totalCost){
        this.cost = cost;
        this.budget = budget;
        this.destination = destination;
        this.brand = brand;
        this.stars = stars;
        this.totalCost = totalCost;
    }
}