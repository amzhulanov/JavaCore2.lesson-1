package Java.lesson1.course;

import Java.lesson1.Participant;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) { this.distance=100;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(this.distance);
    }
}