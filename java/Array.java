public class Array {
  public static void main(String[] args) {
    String[] stringArray;
    stringArray = new String[3];
    stringArray[0] = "Eko";
    stringArray[1] = "Kurniawan";
    stringArray[2] = "Khannedy";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);

    System.out.println(stringArray.length);

    String[][] nameArray = {
      {"Eko", "Kurniawan", "Khannedy"},
      {"Maulana", "Ibrahim"},
      {"Maulana"},
    };

    System.out.println(nameArray[0][1]);
    System.out.println(nameArray[1][1]);
    System.out.println(nameArray[2][0]);

    // or String[] stringArray = new String[3];
    // or String[] stringArray = {}
    // get array length stringArray.length result: 3
  }
}
