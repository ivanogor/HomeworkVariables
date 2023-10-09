public class Main {
    public static void main(String[] args) {
        var allWorkTime = 640;
        var timeForEach = 8;
        var workers = allWorkTime / timeForEach;

        System.out.println("Всего работников в компании — " + workers + " человек.");

        workers = workers + 94;
        allWorkTime = timeForEach * workers;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + allWorkTime + " часов работы может быть поделено между сотрудниками");

    }
}