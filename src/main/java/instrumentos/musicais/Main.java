package instrumentos.musicais;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Metodos metodos = new Metodos(scan);
    metodos.menu();
    scan.close();
  }
}