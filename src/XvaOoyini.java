import java.util.Random;
import java.util.Scanner;

public class XvaOoyini {

    static String[] fillboard() {
        String[] strings = new String[10];
        for (int i = 1; i < 10; i++) {
            strings[i] = String.valueOf(i);
        }
        return strings;
    }

    static String chooseturn() {
        Random random = new Random();
        return random.nextBoolean() ? "X" : "O";
    }

    static void printBoard(String[] board) {
        System.out.println(getSlote(board[1]) + "  " + getSlote(board[2]) + "  " + getSlote(board[3]));
        System.out.println();
        System.out.println(getSlote(board[4]) + "  " + getSlote(board[5]) + "  " + getSlote(board[6]));
        System.out.println();
        System.out.println(getSlote(board[7]) + "  " + getSlote(board[8]) + "  " + getSlote(board[9]));
    }

    static String getSlote(String slot) {
        String RED_BACKGROUND = "\033[41m ";
        String GREEN_BACKGROUND = "\033[42m ";
        String YELLOW_BACKGROUND = "\033[43m ";
        String RESET = " \033[0m";
        if (slot.equals("X"))
            return RED_BACKGROUND + slot + RESET;
        if (slot.equals("O"))
            return YELLOW_BACKGROUND + slot + RESET;
        return GREEN_BACKGROUND + slot + RESET;
    }

    private static boolean cechwin(String[] board, String turn) {
        String[] wincases = {
                board[1] + board[2] + board[3],
                board[4] + board[5] + board[6],
                board[7] + board[8] + board[9],

                board[1] + board[4] + board[7],
                board[2] + board[5] + board[8],
                board[3] + board[6] + board[9],


                board[1] + board[5] + board[9],
                board[3] + board[5] + board[7],
        };
        for (String wincase : wincases) {
            if (wincase.equals(turn.repeat(3)))
                return true;
        }
        return false;
    }

    private static boolean isboardfull(String[] board) {
        for (int i = 1; i < board.length; i++) {
            if (board[i].equals(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }
    static int[] natija(int[] a,int b){
        int[] result = new int[a.length-1];
        int remove =b;
        for (int i = 0,j=0; i <a.length ; i++) {
            if (i!=remove){
                result[j++]=a[i];
            }
        }
        return result;
    }

    private static int compyuterchoose(String[] board, String turn, int k) {
        int number = 0;
        int d = k;
        Random random = new Random();
        int[] yut;
        if ((board[1] + board[2]).equals("X".repeat(2)) || (board[6] + board[9]).equals("X".repeat(2)) || (board[7] + board[5]).equals("X".repeat(2))) {
            number = 3;
        }
        if ((board[2] + board[3]).equals("X".repeat(2)) || (board[4] + board[7]).equals("X".repeat(2)) || (board[5] + board[9]).equals("X".repeat(2))) {
            number = 1;
        }
        if ((board[4] + board[5]).equals("X".repeat(2)) || (board[3] + board[9]).equals("X".repeat(2))) {
            number = 6;
        }
        if ((board[7] + board[8]).equals("X".repeat(2)) || (board[3] + board[6]).equals("X".repeat(2)) || (board[1] + board[5]).equals("X".repeat(2))) {
            number = 9;
        }
        if ((board[1] + board[9]).equals("X".repeat(2)) || (board[7] + board[3]).equals("X".repeat(2)) || (board[2] + board[8]).equals("X".repeat(2)) || (board[4] + board[6]).equals("X".repeat(2))) {
            number = 5;
        }
        if ((board[1] + board[7]).equals("X".repeat(2)) || (board[5] + board[6]).equals("X".repeat(2))) {
            number = 4;
        }
        if ((board[1] + board[3]).equals("X".repeat(2)) || (board[5] + board[8]).equals("X".repeat(2))) {
            number = 2;
        }
        if ((board[1] + board[4]).equals("X".repeat(2)) || (board[3] + board[5]).equals("X".repeat(2)) || (board[8] + board[9]).equals("X".repeat(2))) {
            number = 7;
        }
        if ((board[2] + board[5]).equals("X".repeat(2)) || (board[7] + board[9]).equals("X".repeat(2))) {
            number = 8;
        }

        if (board[1].equals("X")) {
            yut = new int[]{2, 5, 4};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }
        } else if (board[2].equals("X")) {
            yut = new int[]{1, 3, 5};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }

        } else if (board[3].equals("X")) {
            yut = new int[]{2, 5, 6};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }
        } else if (board[4].equals("X")) {
            yut = new int[]{1, 7, 5};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }
        } else if (board[5].equals("X")) {
            yut = new int[]{2, 3, 4, 6, 7, 8, 9, 1};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }
        } else if (board[6].equals("X")) {
            yut = new int[]{3, 5, 9};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }
        } else if (board[7].equals("X")) {
            yut = new int[]{4, 5, 8};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }
        } else if (board[8].equals("X")) {
            yut = new int[]{6, 7, 9};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }
        } else if (board[9].equals("X")) {
            yut = new int[]{5, 6, 8};
            int g;
            int rand = random.nextInt(yut.length);
            g = yut[rand];
            if (board[g].equals(String.valueOf(g))) {
                number =g;
                for (int i = 1; i < board.length; i++) {
                    if (board[i].equals(String.valueOf(i))) {
                        number = i;
                    }
                }
            }
        } else {
            number = random.nextInt(board.length);
        }


        return number;
    }

    public static void main(String[] args) {
        var  fr =41;
        System.out.println(fr);
        String[] board = fillboard();
        String turn = chooseturn();
        printBoard(board);
        System.out.println(turn + " first Player ");
        Scanner input = new Scanner(System.in);
        while (!isboardfull(board)) {
            printBoard(board);
            System.out.println();
            int slotnumber = 0;
            if (turn.equals("X")) {
                System.out.print(turn + " Enter slot number : ");
                slotnumber = input.nextInt();
            } else if (turn.equals("O")) {
                int k = 0;
                k++;
                slotnumber = compyuterchoose(board, turn, k);

            }
            if (!board[slotnumber].equals(String.valueOf(slotnumber))) {
                System.out.println(" slot already taken ");
                continue;
            }
            board[slotnumber] = turn;
            if (cechwin(board, turn)) {
                printBoard(board);
                System.out.println("Player " + turn + " win 🎉🎉🎉🎉🎉");
                return;
            } else {
                turn = turn.equals("X") ? "O" : "X";
            }
        }
        printBoard(board);
        System.out.println(" Draw 😟😟😒😒");
    }


}