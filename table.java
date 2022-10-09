import java.util.Scanner;

public class table
{
    public static void main (String[] args)

    {
        int option;
        int statno, endno, mitino;
        while (true)
        {
            System.out.println("enter one" + "\n1.odd no:" + "\n2.even no:" + "\n3.all no:");
            Scanner input = new Scanner(System.in);
            option = Integer.parseInt(input.next());

            switch (option) {
                case 1: {
                    System.out.println("hade number :");
                    System.out.println("enter stat no :");
                    statno = Integer.parseInt(input.next());
                    System.out.println("enter last no :");
                    endno = Integer.parseInt(input.next());
                    System.out.println("enter multi number");
                    mitino=Integer.parseInt(input.next());
                    while (statno < endno) {
                        if (statno % 2 == 1) {
                            System.out.println(statno+ "*"+mitino+"="+statno*mitino);
                        }
                        statno++;
                    }
                    break;
                }
                case 2: {
                    System.out.println("even number :");
                    System.out.println("enter stat no :");
                    statno = Integer.parseInt(input.next());
                    System.out.println("enter last no :");
                    endno = Integer.parseInt(input.next());
                    System.out.println("enter multi no :");
                    mitino=Integer.parseInt(input.next());
                    while (statno < endno) {
                        if (statno % 2 == 0) {
                            System.out.println(statno+ "*"+mitino+"="+statno*mitino);

                        }
                        statno++;
                    }
                    break;
                }
                case 3: {
                    System.out.println(" number :");
                    System.out.println("enter stat no :");
                    statno = Integer.parseInt(input.next());
                    System.out.println("enter last no :");
                    endno = Integer.parseInt(input.next());
                    System.out.println("enter multi no :");
                    mitino=Integer.parseInt(input.next());

                    while (statno < endno) {
                        System.out.println("statno"+ "*"+"mitino"+"="+statno*mitino);

                        statno++;

                    }
                    break;
                }
                default:
                    System.out.println("wrong enter correct option");
            }
        }
    }

}
