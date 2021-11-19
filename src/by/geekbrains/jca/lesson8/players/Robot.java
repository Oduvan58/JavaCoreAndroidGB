package by.geekbrains.jca.lesson8.players;

public class Robot implements Player {

    public static final int RUN_LENGTH = 1500;
    public static final int JUMP_HEIGHT = 3;
    private String name;
    private boolean onSuccess;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        if (length <= RUN_LENGTH) {
            System.out.printf("Robot %s successfully passed the track.\n", name);
            onSuccess = true;
        } else {
            System.out.printf("Robot %s didn't pass the track.\n", name);
        }
    }

    @Override
    public void jump(int height) {
        if (height <= JUMP_HEIGHT) {
            System.out.printf("Robot %s successfully passed the wall.\n", name);
            onSuccess = true;
        } else {
            System.out.printf("Robot %s didn't pass the wall.\n", name);
        }
    }

    @Override
    public boolean isSuccess() {
        return onSuccess;
    }
}
