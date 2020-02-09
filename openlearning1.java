class Mahasiswa {
    String nim ;
    String nama ;
    String prodi ;
    String semester ;
    int age ;
    char grade ;
    float nilai ;
}

class Testing {
    public static void main (String [] args){
        Mahasiswa anto = new Mahasiswa();
        anto.nim = "180001";
        anto.nama = "Antonio";
        anto.prodi = "Teknik Mesin";
        anto.semester = "4";
        anto.age = 18 ;
        anto.grade = 'C';
        anto.nilai = 69.7f ;

        System.out.println("NIM " + anto.nim);
        System.out.println("Nama " + anto.nama);
        System.out.println("Prodi " + anto.prodi);
        System.out.println("Semester " + anto.semester);
        System.out.println("Umur " + anto.age);
        System.out.println("Grade " + anto.grade);
        System.out.println("Nilai " + anto.nilai);

        Mahasiswa ani = new Mahasiswa();
        ani.nim = "180002";
        ani.nama = "Anita Wati";
        ani.prodi = "Teknik Sipil";
        ani.semester = "4";
        ani.age = 19 ;
        ani.grade = 'B';
        ani.nilai = 76.7f ;

        System.out.println("NIM " + ani.nim);
        System.out.println("Nama " + ani.nama);
        System.out.println("Prodi " + ani.prodi);
        System.out.println("Semester " + ani.semester);
        System.out.println("Umur " + ani.age);
        System.out.println("Grade " + ani.grade);
        System.out.println("Nilai " + ani.nilai);

        Mahasiswa iqbal = new Mahasiswa();
        iqbal.nim = "180003";
        iqbal.nama = "Iqbal Syam";
        iqbal.prodi = "Teknik Informatika";
        iqbal.semester = "4";
        iqbal.age = 19 ;
        iqbal.grade = 'A';
        iqbal.nilai = 81.7f ;

        System.out.println("NIM " + iqbal.nim);
        System.out.println("Nama " + iqbal.nama);
        System.out.println("Prodi " + iqbal.prodi);
        System.out.println("Semester " + iqbal.semester);
        System.out.println("Umur " + iqbal.age);
        System.out.println("Grade " + iqbal.grade);
        System.out.println("Nilai " + iqbal.nilai);
    
    }
}