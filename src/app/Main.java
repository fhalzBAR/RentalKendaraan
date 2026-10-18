package app;

import controller.RentalController;
import model.Mobil;
import model.Mobil;
import model.Minibus;
import model.MobilPremium;

public class Main {
        public static void main(String[] args) {
                RentalController controller = new RentalController();
                //Data awal/dummy data
                controller.tambahDataAwal(new Mobil(
                        "S 1234 TV", 
                        "Suzuki Ertiga", 
                        350000)
                );
                controller.tambahDataAwal(new Mobil(
                        "S 2468 TY", 
                        "Honda Jazz", 
                        300000)
                );
                controller.tambahDataAwal(new Mobil(
                        "S 5678 TV", 
                        "Honda Vario", 
                        75000)
                );
                controller.tambahDataAwal(new Minibus(
                        "S 4321 TY", 
                        "Toyota Hiace", 
                        900000)
                );
                controller.tambahDataAwal(new MobilPremium(
                        "S 9 TV", 
                        "Porsche 911 Carrera",
                        1500000)
                );

                controller.jalankan();
        }
}