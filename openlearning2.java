// Kelas Mahasiswa
class Mahasiswa {
    String nim; 
    String nama; 
 
    void belajar() {
        System.out.println(this.nama + " sedang belajar");
    }

    void kerjakanTugas() {
        System.out.println(this.nama + " sedang mengerjakan Tugas");
    }
 
    void info() {
        System.out.println("NIM " + this.nim);
        System.out.println("NAMA " + this.nama);
    }
}
 
class Testing {
    public static void main(String[] args) {

        Mahasiswa agus = new Mahasiswa();
        agus.nim = "200001";
        agus.nama = "Agusta";

        Mahasiswa aldi = new Mahasiswa();
        aldi.nim = "200025";
        aldi.nama = "aldi sekarang";

        Mahasiswa arif = new Mahasiswa();
        arif.nim = "200025";
        arif.nama = "arif kapan";

        aldi.belajar();
        aldi.kerjakanTugas();
        aldi.info();

        arif.belajar();
        arif.kerjakanTugas();
        arif.info();
        
        agus.belajar();
        agus.kerjakanTugas();
        agus.info();
 
    }
}