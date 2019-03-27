package Java.lesson1.course;

import Java.lesson1.Participant;

public class Voice extends Obstacle {

    private int voice;

    public Voice(int voice) {
        this.voice = voice;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(this.voice);
    }
}