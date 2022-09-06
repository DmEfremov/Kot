package main.java;

import main.java.animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik k1= new Kotik();
        k1.setName("Iris");
        k1.setVoice("may");
        k1.setSatiety(3);
        k1.setWeight(1000);
        Kotik k2 = new Kotik("Kot","may",3,1000);
        for(String activityRecord:k2.liveAnotherDay()){
            System.out.println(activityRecord);
        }
        System.out.println("Котик по имени "+k1.getName()+" весит "+ k1.getWeight()+" грамм");
        if(Kotik.compareVoice(k1 ,k2)){
            System.out.println("Котики говорят одинково");
        }else{
            System.out.println("Котики говорят по разному ");
        }
        System.out.println("В процессе выполнения программы было создано " + Kotik.getCount()+ " котика(ов).");



    }
}
