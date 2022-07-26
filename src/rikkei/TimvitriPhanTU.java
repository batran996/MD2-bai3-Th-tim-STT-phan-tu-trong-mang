package rikkei;

import java.util.Scanner;

public class TimvitriPhanTU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studens = {"mot","hai","ba","bon","nam"};
        System.out.print("enter a name student");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < studens.length; i++) {
            if (studens[i].equals(inputName)){
                System.out.println("Position of the students in the list "+ inputName + " is:"+ i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("not found " + inputName +" in the list.");
        }
    }
}
