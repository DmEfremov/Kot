package main.java.animals;

public class Kotik {


    private static int count;
    private static final int METHODS = 5;
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        Kotik.count += 1;
    }

    public Kotik() {
        Kotik.count += 1;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(int satiety) {
        satiety += satiety;
    }

    public void eat(int satiety, String brand) {
        this.satiety += 3;
    }

    public void eat() {
        this.eat(3, "kitkat");

    }


    public boolean play() {
        satiety -= 1;
        return true;

    }

    public boolean sleep() {
        satiety -= 1;
        return true;

    }

    public boolean wash() {
        satiety -= 1;
        return true;

    }

    public boolean walk() {
        satiety -= 1;
        return true;

    }

    public boolean hunt() {
        satiety -= 1;
        return true;


    }


    public String[] liveAnotherDay() {
        String[] activityRecords = new String[24];

        for (int i = 0; i < 24; i++) {
            if (satiety > 1) {

                activityRecords[i] = "Час " + String.valueOf(i) + " - ";
                switch ((int) (Math.random() * METHODS) + 1) {
                    case 1:
                        this.play();
                        activityRecords[i] += "Играет";
                        break;
                    case 2:
                        this.hunt();
                        activityRecords[i] += "Охотится";
                        break;
                    case 3:
                        this.walk();
                        activityRecords[i] += "Гуляет";
                        break;
                    case 4:
                        this.wash();
                        activityRecords[i] += "Моется";
                        break;
                    case 5:
                        this.sleep();
                        activityRecords[i] += "Спит";
                        break;
                }

            } else {
                this.eat();
                activityRecords[i] = "Час " + String.valueOf(i) + " - ";
                activityRecords[i] += "Кушает" ;

            }
        }
        return activityRecords;
    }


    public static boolean compareVoice(Kotik k1, Kotik k2) {
        if (k1.getVoice().equals(k2.getVoice())) {
            return true;
        }
        return false;

    }


}
