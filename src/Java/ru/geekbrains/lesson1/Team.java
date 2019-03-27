package Java.ru.geekbrains.lesson1;

import java.util.Arrays;

/**
 * Класс - комманда участников соревнований
 */
public class Team {

    private Participant[] participants;

    // здесь используется конструктор с переменным числом параметров
    public Team(Participant... participants) {
        // внутри метода переменное число параметров интерпретируется как массив
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Team{" +
                "participants=" + Arrays.toString(participants) +
                '}';
    }

    public void ShowResult(){
        System.out.println(toString());
    }

    public void ShowTeam(){
        System.out.println(toString());
    }



    public Participant[] getParticipants() {
        return participants;
    }

}