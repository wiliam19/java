    class Lingkaran{
        double pi; 
        double r;
        
        // Constructor dengan dua parameter
        Lingkaran(double pi, double r) {
            this.pi = pi;
            this.r = r;
        }
     
        double luas() {
            return this.pi * this.r * this.r;
        }
    }
     
    class Testing {
        public static void main(String[] args) {
            Lingkaran penggarisLingkaran = new Lingkaran(22/7, 7);
            System.out.println("Luas Lingkaran " + penggarisLingkaran.luas());
        }
     
    }