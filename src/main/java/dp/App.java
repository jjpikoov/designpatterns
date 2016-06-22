package dp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        //STRATEGY (nie dokonca tak powinno byc, patrz UML)
//        Dog dog = new Dog();
//        dog.setFlyType(new CanNotFly());
//        dog.fly();
//
//        Cat cat = new Cat();
//        cat.setFlyType(new CanFly());
//        cat.fly();



//        //OBSERVER
//        StockGrabber stockGrabber = new StockGrabber();
//        StockObserver stockObserver = new StockObserver();
//        stockGrabber.addObserver(stockObserver);
//
//        stockGrabber.setA(1);
//        stockGrabber.setA(2);



//        //FACTORY
//        EnemyFactory enemyFactory = new EnemyFactory();
//        FirstEnemy firstEnemy = (FirstEnemy) enemyFactory.getFirstEnemy();
//        SecondEnemy secondEnemy = (SecondEnemy) enemyFactory.getSecondEnemy();
//
//        firstEnemy.setAttack(1);
//        secondEnemy.setAttack(2);



//        //ABSTRACT FACTORY
//        EnemyBuilding enemyBuilding = new GoodEnemyBuilding();
//        dp.abstractfactory.Enemy e =  enemyBuilding.makeEnemy("1");
//        e.info();
//
//        e = enemyBuilding.makeEnemy("2");
//        e.info();


//        //SINGLETON
//        Singleton s = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//        assert s == s2;


//        //SINGLETON THREADS
//        Thrd thread1 = new Thrd();
//        Thrd thread2 = new Thrd();
//
//        thread1.start();
//        thread2.start();


//        //BUILDER
//        RobotDirector robotDirector = new RobotDirector(new OldRobotBuilder());
//        robotDirector.makeRobot();
//        Robot r = robotDirector.getRobot();
//        System.out.println(r.getRobotHead());
//        System.out.println(r.getRobotLegs());


//        //PROTOTYPE
//        SheepFactory sheepFactory = new SheepFactory();
//        Sheep s = new Sheep();
//        Sheep s2 = (Sheep) sheepFactory.getCopy(s);
//
//        System.out.println(System.identityHashCode(s));
//        System.out.println(System.identityHashCode(s2));


//        //DECORATOR
//        Pizza outPizza = new SalamiDecorator(new CheeseDecorator(new PlainPizza()));
//        System.out.println(outPizza.getDescription());



//        //COMMAND
//        ElectronicDevice tv = new TV();
//        Command c = new SwitchOn(tv);
//        CommandInvoker.run(c);
//        CommandInvoker.undo(c);


//        //ADAPTER
//        Hero robinhood = new RobinHood();
//        Hero robot = new RobotHeroAdapter(new Robot());
//
//        robinhood.walk();
//        robinhood.yield();
//
//        robot.walk();
//        robot.yield();


//        //FACADE
//        BankAccountFacade bankAccountFacade = new BankAccountFacade(123456789, 1234);
//        bankAccountFacade.depositCash();


        //BRIDGE
        // http://www.tutorialspoint.com/design_pattern/bridge_pattern.htm //No comment! GReat!



//        //TEMPLATE
//        Sandwich normal = new NormalSandwich();
//        normal.makeSandwich();
//        System.out.println();
//        Sandwich plain = new PlainSandwich();
//        plain.makeSandwich();


        //ITERATOR
        //There are images in folder


//        //COMPOSITE
//        SongComponent allSongs = new SongGroup("All Songs", "All all songs!");
//
//        SongComponent popSongs = new SongGroup("Pop songs", "POPOP");
//
//        SongComponent heyJude = new Song("Hey Jude", "Beatles");
//        SongComponent yesterday = new Song("Yesterday", "Beatles");
//
//        SongComponent idlmondays = new Song("I don't like mondays", "Boomtown Rats");
//
//        popSongs.add(heyJude);
//        popSongs.add(yesterday);
//
//        allSongs.add(popSongs);
//        allSongs.add(idlmondays);
//
//        allSongs.info();


        //FLYWEIGTH
        //Idea is to store some objects in hashmap so we don't have to create them at runtime, for example we have 9 colors (rectangulars),
        // so we can create 9 objects
        //and store them in hashmap, changing only dimensions at runtime.


//        //STATE
//        ATMMaschine atmMaschine = new ATMMaschine();
//        atmMaschine.insertCard();
//        atmMaschine.insertPin(123);
//        atmMaschine.requestCash(100);


//        //PROXY
//        GettingCash bank = new BankProxy();
//        System.out.println(bank.getCahs());


//        //CHAIN OF RESPONSIBILITY
//        Chain ch1 = new Add();
//        Chain ch2 = new Sub();
//        Chain ch3 = new Mul();
//
//        ch1.setNextChain(ch2);
//        ch2.setNextChain(ch3);
//
//        ch1.calculate(1, 2, "mul");
//
//        ch1.calculate(1, 2, "sub");
//
//        ch1.calculate(1, 2, "sdfs");



        //INTERPRETER


//        //MEDIATOR
//        Mediator mediator = new Mediator();
//
//        User user1 = new User(mediator);
//        User user2 = new User(mediator);
//
//        user1.sendMessage("1");
//        user2.sendMessage("2");



//        //MEMENTO
//        Originator originator = new Originator();
//        CareTaker careTaker = new CareTaker();
//
//        careTaker.addMemento(originator.storeInMemento("1"));
//        careTaker.addMemento(originator.storeInMemento("12"));
//        originator.restoreFromMemento(careTaker.getPreviousMemento());
//        careTaker.addMemento(originator.storeInMemento("123"));
//        originator.restoreFromMemento(careTaker.getLastMemento());


//        //VISITOR
//        Vodka vodka = new Vodka(10);
//        Tabacco tabacco = new Tabacco(5);
//        TaxVisitor taxVisitor = new TaxVisitor();
//
//        System.out.println(vodka.getPrice());
//        System.out.println(tabacco.getPrice());
//
//        System.out.println();
//
//        System.out.println(vodka.accept(taxVisitor));
//        System.out.println(tabacco.accept(taxVisitor));





    }
}
