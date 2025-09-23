package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    private static final Logger log = LoggerFactory.getLogger(JournalEntryService.class);
    // create the business logic here

    @Autowired
    private JournalEntryRepo journalEntryRepo;
    @Autowired
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(JournalEntryService.class);

    //@Transactional
    public void saveEntry(JournalEntry journalEntry, String userName){
        try {
            User user = userService.findByUserName(userName);
            journalEntry.setDate(LocalDateTime.now());
            JournalEntry saved = journalEntryRepo.save(journalEntry);
            user.getJournalEntries().add(saved);
            userService.saveUser(user);
        } catch (Exception e){
            //log.error("Exception",e);
            e.printStackTrace();
            throw new RuntimeException("An error occurred while saving the entry:  ",e);
        }

    }

    public void saveEntry(JournalEntry journalEntry){
        try {
            journalEntryRepo.save(journalEntry);
        } catch (Exception e){
            log.error("Exception",e);
        }

    }

    public List<JournalEntry> getAll(){
        return journalEntryRepo.findAll() ;
    }

    public Optional<JournalEntry> findbyId(ObjectId id){
        return journalEntryRepo.findById(id);
    }

    public boolean deleteById(ObjectId id, String userName){
        boolean removed = false;
        try {
            User user = userService.findByUserName(userName);
            removed = user.getJournalEntries().removeIf(x -> x.getId().equals(id));
            if (removed) {
                userService.saveUser(user);
                journalEntryRepo.deleteById(id);
            }
        }
        catch(Exception e){
            System.out.println(e);
            throw new RuntimeException("An error occured while deleting the entry:", e);
        }
        return removed;
    }


}

// controller ---> service ---> repository
// controller calls service & service calls repository.
