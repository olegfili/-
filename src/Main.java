//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main (String[] args) {
    var dog = 8.0;
    var cat = 3.8;
    var peper = 763789;

    dog = dog + 4;
    System.out.println(dog);
    cat = cat + 4;
    System.out.println(cat);
    peper = peper + 4;
    System.out.println(peper);

    dog = dog - 3.5;
    System.out.println(dog);
    cat = cat - 1.6;
    System.out.println(cat);
    peper = peper - 7639;
    System.out.println(peper);

    var friend = 19;
    friend = friend + 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);

    var frog = 3.5;
    frog = frog + 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);

    var oneWeight = 78.2;
    var twoWeight = 82.7;
    var generalWeight = oneWeight + twoWeight;
    System.out.println(" Общая масса двух бойцов " + generalWeight);
    var differenceWeight = twoWeight - oneWeight;
    System.out.println(" Разница между боцами " + differenceWeight);

    var remainder = twoWeight % oneWeight;
    System.out.println(remainder);

    var totalHours = 640;
    var workingHours = 8;
    var amountOfWorkers = totalHours / workingHours;
    System.out.println("Всего работников в компании - " + amountOfWorkers + " человек ");

    var moreEmployees = amountOfWorkers + 94;
    System.out.println(moreEmployees);
    var watch = totalHours / moreEmployees;
    System.out.println("Если в компании работает 174 человека, то всего " + watch + " часа работы может быть поделено между сотрудниками" );


    }
}