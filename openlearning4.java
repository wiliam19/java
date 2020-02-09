    // Kelas Mahasiswa
    class Mahasiswa {
        String nim; 
        String nama; 
     
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
     
        void info(){
            System.out.println("Kode Mata Kuliah: " + this.kode);
            System.out.println("Nama Mata Kuliah: " + this.nama);
        }
    }
     
    class Testing {
        public static void main(String[] args) {
            MataKuliah pbo = new MataKuliah();
            pbo.kode = "INF1301";
            pbo.nama = "Pemrograman Berorientasi Objek";

            MataKuliah db = new MataKuliah();
            db.kode = "INF13002";
            db.nama = "Basis Data";

            MataKuliah agm = new MataKuliah();
            agm.kode = "INF13011";
            agm.nama = "Agama";

            MataKuliah mtk = new MataKuliah();
            mtk.kode = "INF13005";
            mtk.nama = "Matematika";

            MataKuliah sos = new MataKuliah();
            sos.kode = "INF13020";
            sos.nama = "Sosial";

            Mahasiswa rasmus = new Mahasiswa();
            rasmus.nim = "980002";
            rasmus.nama = "Rasmus";

            Mahasiswa iqbal = new Mahasiswa();
            iqbal.nim = "985522";
            iqbal.nama = "Iqbal Syam";

            Mahasiswa farid = new Mahasiswa();
            farid.nim = "985526";
            farid.nama = "Farid Majid";

            Mahasiswa arif = new Mahasiswa();
            arif.nim = "985586";
            arif.nama = "Ruiz";

            Mahasiswa ayu = new Mahasiswa();
            ayu.nim = "980066";
            ayu.nama = "Astuti";

            rasmus.belajar(pbo);
            rasmus.kerjakanTugas(pbo);
            pbo.info();
            System.out.println(" ");

            iqbal.belajar(db);
            iqbal.kerjakanTugas(db);
            db.info();
            System.out.println(" ");

            farid.belajar(agm);
            farid.kerjakanTugas(agm);
            agm.info();
            System.out.println(" ");
            
            arif.belajar(mtk);
            arif.kerjakanTugas(mtk);
            mtk.info();
            System.out.println(" ");

            ayu.belajar(sos);
            ayu.kerjakanTugas(sos);
            sos.info();
            System.out.println(" ");
        }
     
    }