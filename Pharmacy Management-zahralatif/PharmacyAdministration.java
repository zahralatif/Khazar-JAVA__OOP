import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

public class PharmacyAdministration {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Aptek adını daxil edin: ");
            String pharmacyName = scanner.next();
            Pharmacy pharmacy = new Pharmacy(pharmacyName);

            while (true) {
                System.out.println("\nAptek Administrasiyası");
                System.out.println("1. Dərman əlavə edin");
                System.out.println("2. Dərmanları göstərin");
                System.out.println("3. İşçi əlavə edin");
                System.out.println("4. İşçiləri göstərin");
                System.out.println("5. Aptek məlumatlarını file-da yadda saxla");
                System.out.println("6. Programdan çıxış");
                System.out.print("Seçiminizi daxil edin: ");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Dərman adını qeyd edin: ");
                        String medicineName = scanner.next();
                        System.out.print("Sayını daxil edin: ");
                        int medicineQuantity = scanner.nextInt();
                        pharmacy.addMedicine(medicineName, medicineQuantity);
                        break;

                    case 2:
                        pharmacy.displayMedicines();
                        break;

                    case 3:
                        System.out.print("İşçi adını daxil edin: ");
                        String workerName = scanner.next();

                        System.out.print("İşçinin ID-sini yazın: ");
                        int workerId = scanner.nextInt();

                        pharmacy.addWorker(workerName, workerId);
                        break;

                    case 4:
                        pharmacy.displayWorkers();
                        break;

                    case 5:
                        pharmacy.saveItemsToFile();
                        System.out.println("Bütün əşyalar data file-da  saxlanıldı.");
                        break;

                    case 6:
                        System.out.println("Aptek sistemindən çıxış edildi. ");
                        System.exit(0);

                    default:
                        System.out.println("Yanlış seçim, yenidən yoxlayın.");
                }
            }
        }
    }
}