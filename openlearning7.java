    // Kelas Mahasiswa
    class Mahasiswa {
        String nim; 
        String nama; 
     
        Mahasiswa(String nim, String nama) {
            this.nim = nim;
            this.nama = nama;
        }
     
        void belajar(MataKuliah matakuliah) {
            System.out.println(this.nama + " sedang belajar Mata Kuliah" + matakuliah.nama);
        }
     
        void kerjakanTugas(MataKuliah mataKuliah) {
            System.out.println(this.nama + " sedang mengerjakan Tugas Mata Kuliah " + mataKuliah.nama);
        }
    }
     
    // Kelas MataKuliah
    class MataKuliah {
        String kode; 
        String nama; 
     
        MataKuliah(String kode, String nama) {
            this.kode = kode;
            this.nama = nama;
        }
     
        void info(){
            System.out.println("Kode Mata Kuliah: " + this.kode);
            System.out.println("Nama Mata Kuliah: " + this.nama);
        }
    }
     
    class Testing {
        public static void main(String[] args) {
            // membuat objek MataKuliah dengan nama objek pbo
            MataKuliah pbo = new MataKuliah("INF1301", "Pemrograman Berorientasi Objek");
            // membuat objek MataKuliah dengan nama objek db
            MataKuliah db = new MataKuliah("INF13002","Basis Data");
            
            // membuat objek mahasiswa dengan nama objek rasmus
            Mahasiswa rasmus = new Mahasiswa("980002", "Rasmus");
            
            // Memanggil method belajar() 
            rasmus.belajar(pbo);
     
            // Memanggil method kerjakanTugas()
            rasmus.kerjakanTugas(db);
     
            // Memanggil Info Mata Kuliah
            pbo.info();
            db.info();
        }
     
    }