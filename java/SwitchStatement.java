public class SwitchStatement {
  public static void main(String[] args) {
    var nilai = "b";

    switch (nilai) {
      case "A":
        System.out.println("Nilai Anda Terbaik");
        break;
      case "B":
      case "C":
      case "D":
        System.out.println("Anda Lulus");
        break;
      case "E":
        System.out.println("Tidak Lulus");
        break;
      default:
        System.out.println("Anda Salah Jurusan");
    }

    // switch lambda

    switch (nilai) {
      case "a" -> System.out.println("Lulus dengan baik");
      case "b", "c" -> System.out.println("Lulus");
      case "d" -> System.out.println("Tidak Lulus");
      default -> {
        System.out.println("Anda");
        System.out.println("Salah");
        System.out.println("Jurusan");
      }
    }
  }
}
