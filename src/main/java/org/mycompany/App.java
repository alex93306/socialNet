package org.mycompany;

import org.mycompany.entities.Dialog;
import org.mycompany.entities.User;
import org.mycompany.managers.DialogManager;
import org.mycompany.managers.DialogManagerImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by alex.ramanovich on 15.10.2017.
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssql");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
//        User user = new User();
//        user.setUsername("alex");
//        user.setPassword("0000");
//        user.setCreated(LocalDateTime.now());
//        user.setModified(LocalDateTime.now());
//        user.setFirstName("Alexander");
//        user.setLastName("Ramanovich");
//        entityManager.persist(user);

        User user = entityManager.find(User.class, 7L);
        entityManager.getTransaction().commit();
        entityManager.close();

        emf.close();

    }

    private void m() {
        Dialog dialog = new Dialog();
        DialogManager manager = new DialogManagerImpl();
        manager.save(dialog);
    }
}
