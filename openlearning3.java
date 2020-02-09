    // Kelas Mahasiswa
    class Mahasiswa {
        String nim; 
        String nama; 
     
        void belajar(String matakuliah) {
            System.out.println(this.nama + " sedang belajar Mata Kuliah" + matakuliah);
        }
     
        void kerjakanTugas(String mataString) {
            System.out.println(this.nama + " sedang mengerjakan Tugas Mata Kuliah " + mataString);
        }
    }
     
    class Testing {
        public static void main(String[] args) {
            String matakuliahPbo = "Pemrograman Berorientasi Objek";
            String matakuliahAgm = "Agama";
            String matakuliahMtk = "Matematika";
            String matakuliahSos = "Sosial";

            Mahasiswa anisa = new Mahasiswa();
            anisa.nim = "200002";
            anisa.nama = "Anisa";

            Mahasiswa arif = new Mahasiswa();
            arif.nim = "200012";
            arif.nama = "Ruiz";

            Mahasiswa ayu = new Mahasiswa();
            ayu.nim = "200013";
            ayu.nama = "Astuti";

            Mahasiswa aldi = new Mahasiswa();
            aldi.nim = "200025";
            aldi.nama = "Aldi";

            anisa.belajar(matakuliahPbo);
            anisa.kerjakanTugas(matakuliahPbo);
            System.out.println(" ");

            arif.belajar(matakuliahAgm);
            arif.kerjakanTugas(matakuliahAgm);
            System.out.println(" ");

            ayu.belajar(matakuliahMtk);
            ayu.kerjakanTugas(matakuliahMtk);
            System.out.println(" ");

            aldi.belajar(matakuliahSos);
            aldi.kerjakanTugas(matakuliahSos);
            System.out.println(" ");
        }
     
    }