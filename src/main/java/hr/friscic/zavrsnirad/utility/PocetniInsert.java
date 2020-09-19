/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.utility;

import com.github.javafaker.Faker;
import hr.friscic.zavrsnirad.utility.HibernateUtil;
import hr.friscic.zavrsnirad.model.Klijent;
import org.hibernate.Session;

/**
 *
 * @author K1R4
 */
public class PocetniInsert {

    public static void izvedi() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Faker faker = new Faker();

        String[] kontaktBrojevi = {"0957894356", "0995698147", "0925698753", "0979684523",
            "0915869456", "0916003551", "0993658796", "0954562389",
            "0927568453", "0953487635"};

        Klijent k;
        for (int i = 0; i < 10; i++) {
            k = new Klijent();
            k.setIme((faker.name().firstName()));
            k.setPrezime(faker.name().lastName());
            k.setOib(Oib.getOibIiCentrala());
            k.setEmail(k.getIme().toLowerCase() + "." + k.getPrezime().toLowerCase() + "@gmail.com");
            k.setKontaktbroj(kontaktBrojevi[i]);
            session.save(k);
        }
        session.getTransaction().commit();
    }

}
