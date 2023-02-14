package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = height; i > 0; i-=2) {
            for (int j = 0; j < height; j++) {
                if(j >= (height - i) / 2 && j < (height + i) / 2){
                    System.out.print("8");
                } else System.out.print(" ");
            }
            System.out.println("");
        }
        if(height % 2 == 0){
        for (int i = 2; i <= height; i+=2) {
            for (int j = 0; j < height; j++) {
                if(j >= (height - i) / 2 && j < (height + i) / 2){
                    System.out.print("8");
                } else System.out.print(" ");
            }
            System.out.println("");
        }} else {
            for (int i = 2; i <= height; i+=2) {
                for (int j = 0; j < height; j++) {
                    if(j >= (height - i) / 2 && j <= (height + i) / 2){
                        System.out.print("8");
                    } else System.out.print(" ");
                }
                System.out.println("");
            }
            }

        }
    }

