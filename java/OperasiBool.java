public class OperasiBool {
  public static void main(String[] args) {
    int absen = 75;
    int nilaiAkhir = 88;

    boolean lulusAbsen = absen >= 75;
    boolean lulusNilai = nilaiAkhir >= 75;

    var lulus = lulusAbsen && lulusNilai;
    System.out.println(lulus);
  }
}
