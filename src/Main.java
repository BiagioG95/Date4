import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        //Creazione oggetto tramite la stringa richiesta
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //stampo la data originale
        System.out.println("La data completa è " + data);

        //utilizzo plusYears per aggiungere anni
        OffsetDateTime aggiuntoAnno = data.plusYears(1);
        System.out.println("Aggiunta di un anno: " + aggiuntoAnno);

        //utilizzo minusMonths per sottrarre il mese
        OffsetDateTime sottraiMese = data.minusMonths(1);
        System.out.println("Sottratto un mese: " + sottraiMese);

        //utilizzo plusDays per aggiungere giorni
        OffsetDateTime aggiunti7giorni = data.plusDays(7);
        System.out.println("Aggiunti 7 giorni: " + aggiunti7giorni);

    }
}