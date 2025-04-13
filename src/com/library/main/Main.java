package com.library.main;

import com.library.domain.models.*;
import com.library.domain.services.*;
import com.library.infrastructure.repositories.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Initialize repositories
        UserRepository userRepository = new InMemoryUserRepository();
        RoleRepository roleRepository = new InMemoryRoleRepository();
        ReservationRepository reservationRepository = new InMemoryReservationRepository();
        ReviewRepository reviewRepository = new InMemoryReviewRepository();
        InventoryRepository inventoryRepository = new InMemoryInventoryRepository();
        FineRepository fineRepository = new InMemoryFineRepository();
        LoanHistoryRepository loanHistoryRepository = new InMemoryLoanHistoryRepository();
        
        // Initialize services
        NotificationService notificationService = new NotificationService();
        OAuthService oauthService = new OAuthService();
        SearchService searchService = new SearchService();
        BackupService backupService = new BackupService();

        // Create Roles
        Role userRole = new Role("USER");
        Role adminRole = new Role("ADMIN");

        // Save roles in the repository
        roleRepository.save(userRole);
        roleRepository.save(adminRole);

        // Create Users with roles
        User user1 = new User(1, "john_doe", "password123", Arrays.asList(userRole));
        User admin1 = new User(2, "admin", "admin123", Arrays.asList(adminRole));
        
        // Save users
        userRepository.save(user1);
        userRepository.save(admin1);

        // Authenticate user using OAuth (simulated)
        User authenticatedUser = oauthService.authenticateWithOAuth("google", "token123");
        
        // Sending notifications
        notificationService.sendEmail(user1.getUsername(), "Your book reservation is confirmed!");
        notificationService.sendSMS(user1.getUsername(), "You have a new fine to pay.");
        
        // Create Books and Inventory
        Book book1 = new Book(1, "The Great Gatsby", "Fiction", "F. Scott Fitzgerald", 10);
        Book book2 = new Book(2, "1984", "Dystopian", "George Orwell", 5);

        // Add Books to Inventory
        Inventory inventory1 = new Inventory(book1.getId(), 10);
        Inventory inventory2 = new Inventory(book2.getId(), 5);
        inventoryRepository.save(inventory1);
        inventoryRepository.save(inventory2);
        
        // User reserving a book
        Reservation reservation = new Reservation(user1.getId(), book1.getId());
        reservationRepository.save(reservation);
        
        // Adding Reviews
        Review review = new Review(book1.getId(), user1.getId(), 5, "Amazing book!");
        reviewRepository.save(review);
        
        // Searching for books
        List<Book> searchResults = searchService.searchBooksByTitle(Arrays.asList(book1, book2), "1984");
        System.out.println("Search Results: " + searchResults.get(0).getTitle());

        // Calculate fine
        Fine fine = new Fine(user1.getId(), 5.0);
        fineRepository.save(fine);
        
        // Loan History and Analytics
        LoanHistory loanHistory = new LoanHistory(user1.getId(), book1.getId(), new Date(), new Date());
        loanHistoryRepository.save(loanHistory);
        
        // Backup system (Placeholder)
        backupService.backupData(new File("library_backup.zip"));

        // Demonstrate the role-based actions
        if (user1.hasRole("ADMIN")) {
            System.out.println("Admin access granted!");
        } else {
            System.out.println("User access granted!");
        }
        
        // Display Loan History
        loanHistoryRepository.save(new LoanHistory(user1.getId(), book2.getId(), new Date(), new Date()));
        System.out.println("Loan History: " + loanHistory.getBookId());
        
        // Fine system (Example fine)
        fineRepository.save(new Fine(user1.getId(), 10.0));
        System.out.println("Fine amount: " + fine.getAmount());
    }
}
