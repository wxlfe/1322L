class Piecemeal extends Vacation {
    double[] expenses;
    double[] corresponding;

    public Piecemeal(double budget, String destination, double[] expenses, double[] corresponding){
        double cost = 0;
        for (int i = 0; i < expenses.length; i++){
            cost += expenses[i];
        }
        for (int j = 0; j < corresponding.length; j++){
            cost += corresponding[j];
        }
        this.cost = cost;
        this.budget = budget;
        this.destination = destination;
    }
}