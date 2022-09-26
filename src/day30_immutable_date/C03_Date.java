package day30_immutable_date;
import java.time.LocalDate;
import java.time.Month;
public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();//bazı durumlarda conctructor kullanımını engellerler."final class" yazdığında özelikle. bu durumda new yazarak obje oluşturamayız bunun yerine".now" şelinde obje oluşturulu
        System.out.println(tarih); // 2022-07-23
        System.out.println(tarih.getDayOfYear()); // 204 yıllın kaçıncı günü
        System.out.println(tarih.getDayOfWeek()); // SATURDAY hangi gün
        System.out.println(tarih.getMonthValue()); // 7 //yıllın kaçıncı ayı
        System.out.println(tarih.isLeapYear()); // false// artık yıl mı?
        LocalDate tarih2= LocalDate.of(2001,5,15);
        System.out.println(tarih2); // 2001-05-15
        LocalDate tarih3= LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3); // 1990-01-10
        System.out.println(tarih.plusDays(100)); // 2022-10-31// 100gün sonra hangi tarih olacak
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); // 2027-11-04// 5 yıl 3 ay 12 gün sonra tarih ne olacak
        System.out.println(tarih.minusWeeks(20)); // 2022-03-05//bu da önceyi getiriyor 20 hafta önce
        System.out.println(tarih.minusDays(100).minusMonths(5)); // 2021-11-14
        System.out.println(tarih.isAfter(tarih2)); // true// 1 tarih ilk tarihten sonra mı?//işe başlangıç tarihi şundan sonraysa emeklilik hesapla gibi şeylerde kullanılabilir
        // iki farkli dogum gunu girildiginde
        // hangisinde doganin daha buyuk oldugunu bulunuz
        // tarih2 ve tarih3 icin yapalim
        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else{
            System.out.println("iki tarih birbiri ile ayni");
        }
    }
}
