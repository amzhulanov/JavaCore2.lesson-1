package Java.ru.geekbrains.lesson1;

import Java.ru.geekbrains.lesson1.animal.Cat;
import Java.ru.geekbrains.lesson1.animal.Dog;
import Java.ru.geekbrains.lesson1.course.Course;
import Java.ru.geekbrains.lesson1.course.Cross;
import Java.ru.geekbrains.lesson1.course.Wall;
import Java.ru.geekbrains.lesson1.course.Water;
import Java.ru.geekbrains.lesson1.enums.Color;

/**
 * Класс для запуска приложения - симулятор кросса
 */
public class Application {

    public static void main(String[] args) {
        Team team = new Team(
                new Cat("Барсик", Color.BLACK, 1, 100, 5),
                new Cat("Мурка", Color.BLACK, 1, 80, 12),
                new Dog("Дружок", Color.BLACK,5,150,15)


                // TODO здесь должны быть участники всех видов (Cat, Dog, Human, Robot)
        );

        Course course = new Course(
                new Cross(50),
                new Wall(10),
                new Water(5),
                new Voice()

        );

        course.doIt(team);
    }
}