package com.company;

public class Main {

    public static void main(String[] args) {
        Main simulator = new Main();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory echoCountDuckFactory = new CoutingEchoDuckFactory();
        simulator.simulator(duckFactory);
        //simulator.simulatorEchoduck(echoCountDuckFactory); //echoCount

    }

    void simulator(AbstractDuckFactory duckFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckcall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Composite - Flocks");
        Quackable redhead = new QuackCounter(new QuackEcho(new MallardDuck()));

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckcall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeon);

        Flock flockOfMallards = new Flock();

        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuckOne);
        flockOfMallards.add(mallardDuckTwo);
        flockOfMallards.add(mallardDuckThree);
        flockOfMallards.add(mallardDuckFour);

        flockOfDucks.add(flockOfMallards);


        LeaderFlock leaderFlock = new LeaderFlock();
        leaderFlock.add(mallardDuckOne);
        leaderFlock.add(mallardDuckTwo);
        leaderFlock.add(mallardDuckThree);
        leaderFlock.add(mallardDuckFour);

        System.out.println("leader quack----");
        leaderFlock.quack();
        System.out.println("----leader quack");

        System.out.println("\nredhead:");
        simulate(redhead);
        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked "+QuackCounter.getQuacks()+" times");

    }
    void simulatorEchoduck(AbstractDuckFactory duckFactory){
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckcall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Composite - Flocks");
        Quackable redhead = new QuackCounter(new QuackEcho(new MallardDuck()));

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckcall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeon);

        Flock flockOfMallards = new Flock();

        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuckOne);
        flockOfMallards.add(mallardDuckTwo);
        flockOfMallards.add(mallardDuckThree);
        flockOfMallards.add(mallardDuckFour);

        flockOfDucks.add(flockOfMallards);


        LeaderFlock leaderFlock = new LeaderFlock();
        leaderFlock.add(mallardDuckOne);
        leaderFlock.add(mallardDuckTwo);
        leaderFlock.add(mallardDuckThree);
        leaderFlock.add(mallardDuckFour);

        System.out.println("leader quack----");
        leaderFlock.quack();
        System.out.println("----leader quack");

        System.out.println("\nredhead:");
        simulate(redhead);
        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked "+QuackCounter.getQuacks()+" times");

    }

    void simulate(Quackable duck) {

        duck.quack();

    }

}
