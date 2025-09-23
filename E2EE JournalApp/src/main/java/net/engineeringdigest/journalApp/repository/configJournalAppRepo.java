package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.ConfigJournalAppEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface configJournalAppRepo extends MongoRepository<ConfigJournalAppEntity, ObjectId> {
    
}
