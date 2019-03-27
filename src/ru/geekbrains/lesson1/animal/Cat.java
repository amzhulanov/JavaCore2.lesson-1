package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participant;
import ru.geekbrains.lesson1.enums.Color;

public class Cat extends Animal implements Participant {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private String vowel="аояуеию"; //строка с глассными буквами для определения пола животного
    private boolean gender; //для определения пола животного

    public Cat(String name, Color color, int age, int runDistance, int jumpHeight) {
        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;

        if (vowel.indexOf((getName().charAt(getName().length()-1)))>=0) {
            gender=true;
        }else {
            gender=false;
        }
    }

    public Cat(String name, Color color) {
        super(name, color, 0);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
            if (gender) {
                System.out.println(String.format("Кошке %s не хватило сил пробежать %d. На прошлых соревнованиях она достигла отметки %d", getName(), distance, runDistance));
            }else{
                System.out.println(String.format("Коту %s не хватило сил пробежать %d. На прошлых соревнованиях он достиг отметки %d", getName(), distance, runDistance));
            }
            return;
        }
        //Если последний символ из имени животного гласный, то женский род.
        if (gender) {
            System.out.println(String.format("Кошка %s пробежала кросс длинной %d. Её личный рекорд %d", getName(), distance,runDistance));
        }else {
            System.out.println(String.format("Кот %s пробежал кросс длинной %d. Его личный рекорд %d", getName(), distance,runDistance));
        }

    }

    @Override
    public void jump(int height) {
        if (!isOnDistance) {

            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            if (gender) {
                System.out.println(String.format("Кошка %s не смогла взять высоту %d", getName(), height));
            }else {
                System.out.println(String.format("Кот %s не смог взять высоту %d", getName(), height));
            }
            return;
        }
        if (gender) {
            System.out.println(String.format("Кошка %s прыгнула на высоту %d. Её личный рекорд %d", getName(), height, jumpHeight));
        }else {
            System.out.println(String.format("Кот %s прыгнул на высоту %d. Его личный рекорд %d", getName(), height, jumpHeight));
        }

        }


    @Override
    public void swim(int distance) {
        isOnDistance = false;
        if (gender) {
            System.out.println("Кошка не умеет плавать");
        }else{
            System.out.println("Кот не умеет плавать");
        }
        // throw new UnsupportedOperationException("Кошка не умеет плавать");
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }
}