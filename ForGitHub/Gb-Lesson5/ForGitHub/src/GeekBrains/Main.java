package GeekBrains;

public class Main {

    public static void main(String[] args) {
        Worker Stan = new Worker("Stanly Cubric", "film director", "Stanly@gmail.com", 150000, 989123543, 64);
        Worker Chis = new Worker("Christopher Nolan", "film director", "Nolan@me.com", 145000, 989234564, 36);
        Worker Phil = new Worker("Jim Carry", "actor", "jimmy@rofl.com", 600000, 989246576, 57);
        Worker Bruce = new Worker("Bruce Lee", "actor", "lee@fight.com", 400000, 989213567, 33);
        Worker Jude = new Worker("Jude Law", "actor", "jude@law.com", 250000, 989657483, 24);

//        Stan.Info();
        Worker[] workersArray = new Worker[5];
        workersArray[0] = Stan;
        workersArray[1] = Chis;
        workersArray[2] = Phil;
        workersArray[3] = Bruce;
        workersArray[4] = Jude;
        for (int i = 0; i < workersArray.length; i++) {
            if(workersArray[i].Age > 40){
                workersArray[i].Info();
            }
        }
    }
}
